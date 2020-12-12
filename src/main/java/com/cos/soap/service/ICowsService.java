package com.cos.soap.service;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import com.cos.soap.model.dto.Cow;
import com.cos.soap.model.dto.Herd;

@Service
public interface ICowsService {
	
	public abstract Cow getCow(Integer id);

	public abstract String postCowBcs(Integer cowId, Integer condicionCorporal, XMLGregorianCalendar fecha);

	public abstract String postCowHerd(Integer cowId, String location);

	public abstract String postCow(XMLGregorianCalendar fechaNacimiento, int electronicId,
			XMLGregorianCalendar ultimaFechaParto, int cantidadPartos, float peso);

	public abstract Herd getHerd(int id);
	
	

}
