package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.dao.IEquipoDAO;
import com.crud.spring.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService{

	@Autowired
	IEquipoDAO iEquipoDAO;

	@Override
	public List<Equipo> listarEquipos() {
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo createEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public Equipo readEquipo(int id) {
		return iEquipoDAO.findById(id).get();
	}

	@Override
	public Equipo updateEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void deleteEquipo(int id) {
		iEquipoDAO.deleteById(id);
	}
	
}
