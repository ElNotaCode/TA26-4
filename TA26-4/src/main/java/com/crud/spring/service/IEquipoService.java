package com.crud.spring.service;

import java.util.List;

import com.crud.spring.dto.Equipo;

public interface IEquipoService {

	//listar
	public List<Equipo> listarEquipos();
	//C
	public Equipo createEquipo(Equipo equipo);
	//R
	public Equipo readEquipo(int id);
	//U
	public Equipo updateEquipo(Equipo equipo);
	//D
	public void deleteEquipo(int id);
}
