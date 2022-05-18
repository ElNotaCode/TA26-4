package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.dao.IFacultadDAO;
import com.crud.spring.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService{
	
	@Autowired
	IFacultadDAO iFacultadDAO;
	
	@Override
	public List<Facultad> listarFacultades() {
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad createFacultad(Facultad facultad) {
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad readFacultad(int id) {
		return iFacultadDAO.findById(id).get();
	}

	@Override
	public Facultad updateFacultad(Facultad facultad) {
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void deleteFacultad(int id) {
		iFacultadDAO.deleteById(id);
	}

}
