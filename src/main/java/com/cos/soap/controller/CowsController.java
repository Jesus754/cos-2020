package com.cos.soap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cos.soap.model.dto.Cow;
import com.cos.soap.model.dto.GetCowRequest;
import com.cos.soap.model.dto.GetCowResponse;
import com.cos.soap.model.dto.GetHerdRequest;
import com.cos.soap.model.dto.GetHerdResponse;
import com.cos.soap.model.dto.Herd;
import com.cos.soap.model.dto.PostCowBcsRequest;
import com.cos.soap.model.dto.PostCowHerdRequest;
import com.cos.soap.model.dto.PostCowRequest;
import com.cos.soap.model.dto.StatusResponse;
import com.cos.soap.service.ICowsService;





@Endpoint
public class CowsController {
	
	private static final String NAMESPACE_URI = "http://com/cos/soap/model/dto";
	
	@Autowired
	private ICowsService cowsService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCowRequest")
	@ResponsePayload
	public GetCowResponse getCow(@RequestPayload GetCowRequest request ) {
		Cow cow = cowsService.getCow(request.getId().intValue());
		GetCowResponse response = new GetCowResponse();
		response.setCow(cow);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "postCowRequest")
	@ResponsePayload
	public StatusResponse postCow(@RequestPayload PostCowRequest request ) {
		String estado = cowsService.postCow(request.getFechaNacimiento(),request.getElectronicId(),request.getUltimaFechaParto(),request.getCantidadPartos(),request.getPeso());
		StatusResponse response = new StatusResponse();
		response.setEstado(estado);
		return response;
	}
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "postCowBcsRequest")
	@ResponsePayload
	public StatusResponse postCowBcs(@RequestPayload PostCowBcsRequest request ) {
		String estado = cowsService.postCowBcs(request.getCowId().intValue(),request.getCondicionCorporal().intValue(),request.getFecha());
		StatusResponse response = new StatusResponse();
		response.setEstado(estado);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "postCowHerdRequest")
	@ResponsePayload
	public StatusResponse postCowHerd(@RequestPayload PostCowHerdRequest request ) {
		String estado = cowsService.postCowHerd(request.getCowId().intValue(),request.getLocation());
		StatusResponse response = new StatusResponse();
		response.setEstado(estado);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHerdRequest")
	@ResponsePayload
	public GetHerdResponse getHerdRequest(@RequestPayload GetHerdRequest request ) {
		Herd herd = cowsService.getHerd(request.getId().intValue());
		GetHerdResponse getHerdResponse = new GetHerdResponse();
		getHerdResponse.setId(herd.getId());
		getHerdResponse.setCow(herd.getCows());
		getHerdResponse.setBcsPromedio(herd.getBcsPromedio());
		getHerdResponse.setLocation(herd.getUbicacion());
		return getHerdResponse;
	}
	
	
}
