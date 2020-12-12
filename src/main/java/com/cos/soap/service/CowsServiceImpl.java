package com.cos.soap.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.soap.model.dto.Cow;
import com.cos.soap.model.dto.CowBcs;
import com.cos.soap.model.dto.Herd;
import com.cos.soap.model.entity.CowBcsEntity;
import com.cos.soap.model.entity.CowEntity;
import com.cos.soap.model.entity.HerdEntity;
import com.cos.soap.model.repository.ICowBcsRepository;
import com.cos.soap.model.repository.ICowRepository;
import com.cos.soap.model.repository.IHerdRepository;
import com.cos.soap.util.CowsUtil;





@Service
public class CowsServiceImpl implements ICowsService {
	
	
	@Autowired 
	private ICowRepository cowRepository;
	
	@Autowired
	private ICowBcsRepository cowBcsRepository;
	
	@Autowired 
	private IHerdRepository herdRepository;
	
	
	Function<CowEntity,Cow> setCowDto = ( cowEntity ) -> {
		List<CowBcsEntity> cowsBcs = cowEntity.getCowBcsEntity();
		Cow cow = new Cow();
		cow.setId(cowEntity.getId());
		cow.setElectronicId(cowEntity.getElectronicID());
		cow.setPeso(cowEntity.getPeso());
		cow.setFechaNacimiento(CowsUtil.getXmlGregorianCalendarFromDate(cowEntity.getFechaNacimiento()));
		cow.setUltimaFechaParto(CowsUtil.getXmlGregorianCalendarFromDate(cowEntity.getUltimaFechaParto()));
		Optional<CowBcsEntity> bcsActual =  cowsBcs.stream().max(Comparator.comparing(CowBcsEntity::getFecha));
		CowBcs cowBcs = new CowBcs(); 
		if (bcsActual.isPresent()) {
			 cowBcs.setCc(bcsActual.get().getCc());
			 cowBcs.setFecha(CowsUtil.getXmlGregorianCalendarFromDate(bcsActual.get().getFecha()));
			 cowBcs.setId(bcsActual.get().getId());
			 cow.setCowBcs(cowBcs);
		}			
		return cow;
	};
	
	

	public Cow getCow(Integer id)  {

		Optional<CowEntity> cowModel =  cowRepository.findById(id);

		try {
			return cowModel.map(setCowDto).orElseThrow(Exception::new);
		} catch (Exception e) {
			return null;
		}			
	}


	
	public String postCowBcs(Integer cowId, Integer condicionCorporal, XMLGregorianCalendar fecha) {
		CowBcsEntity cowBcsEntity = new CowBcsEntity();
		Optional<CowEntity> cowEntity = cowRepository.findById(cowId);
		cowBcsEntity.setCc(condicionCorporal);
		cowBcsEntity.setFecha(CowsUtil.getDateFromXmlGregorianCalendar(fecha));
		cowBcsEntity.setCowEntity(cowEntity.get());
		cowBcsRepository.save(cowBcsEntity);
		return "Ok";
	}



	public String postCowHerd(Integer cowId, String location) {
		Optional<HerdEntity> OherdEntity = herdRepository.findByLocation(location);
		HerdEntity herdEntity = null;
		herdEntity = OherdEntity.isPresent()? OherdEntity.get() : new HerdEntity();
		
		
		CowEntity cowEntity = cowRepository.findById(cowId).get();
		herdEntity.addCow(cowEntity);
		herdEntity.setLocation(location);
		herdRepository.save(herdEntity);
		cowEntity.setHerd(herdEntity);
		cowRepository.save(cowEntity);
		return "ok";
	}



	@Override
	public String postCow(XMLGregorianCalendar fechaNacimiento, int electronicId, XMLGregorianCalendar ultimaFechaParto,
			int cantidadPartos, float peso) {
		CowEntity cowEntity = new CowEntity();
		cowEntity.setFechaNacimiento(CowsUtil.getDateFromXmlGregorianCalendar(fechaNacimiento));
		cowEntity.setElectronicID(electronicId);
		cowEntity.setUltimaFechaParto(CowsUtil.getDateFromXmlGregorianCalendar(ultimaFechaParto));
		cowEntity.setCantidadPartos(cantidadPartos);
		cowEntity.setPeso(peso);
		cowRepository.save(cowEntity);
		return "Ok";
	}



	@Override
	public Herd getHerd(int id) {
		Optional<HerdEntity> herdModel = herdRepository.findById(id);
		Set<CowEntity> cowsHerd = herdModel.get().getCows().stream().collect(Collectors.toSet());
		
		Function<HerdEntity,Herd> setHerdDto  = ( herdEntity ) -> { 
			Herd herd = new Herd();
			herd.setId(herdEntity.getId());
			herd.setUbicacion(herdEntity.getLocation());
			List<Cow> cowsHerdDto = cowsHerd.stream().map(setCowDto).collect(Collectors.toList());
			herd.setCows(cowsHerdDto); // agregar el metodo en Herd, no lo genera cuando se crean las clases
			
			Function<Cow,Integer > getCc = (cow) -> {
				return cow.getCowBcs().getCc();
			};
			
			OptionalDouble promedio = cowsHerdDto.stream().map(getCc).mapToInt( a -> a).average();
			herd.setBcsPromedio(promedio.isPresent() ? promedio.getAsDouble() : 0.0);
			
			return herd;
		};
		return setHerdDto.apply(herdModel.get());

	}
	

		

	
}
