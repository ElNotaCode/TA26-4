package com.crud.spring.service;

import java.util.List;

import com.crud.spring.dto.Facultad;

public interface IFacultadService {

	//listar
	public List<Facultad> listarFacultades();
	//C
	public Facultad createFacultad(Facultad facultad);
	//R
	public Facultad readFacultad(int id);
	//U
	public Facultad updateFacultad(Facultad facultad);
	//D
	public void deleteFacultad(int id);
	
}
