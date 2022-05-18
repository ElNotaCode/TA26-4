package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.dao.IInvestigadorDAO;
import com.crud.spring.dto.Investigador;

@Service
public class InvestigadorServiceImpl implements IInvestigadorService{
	
	@Autowired
	IInvestigadorDAO iInvestigadorDAO;
	
	@Override
	public List<Investigador> listarInvestigadores() {
		return iInvestigadorDAO.findAll();
	}

	@Override
	public Investigador createInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public Investigador readInvestigador(int id) {
		return iInvestigadorDAO.findById(id).get();
	}

	@Override
	public Investigador updateInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public void deleteInvestigador(int id) {
		iInvestigadorDAO.deleteById(id);
	}
	
}
