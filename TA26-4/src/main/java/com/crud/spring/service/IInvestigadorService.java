package com.crud.spring.service;

import java.util.List;

import com.crud.spring.dto.Investigador;

public interface IInvestigadorService {

	//listar
	public List<Investigador> listarInvestigadores();
	//C
	public Investigador createInvestigador(Investigador investigador);
	//R
	public Investigador readInvestigador(int id);
	//U
	public Investigador updateInvestigador(Investigador investigador);
	//D
	public void deleteInvestigador(int id);
	
}
