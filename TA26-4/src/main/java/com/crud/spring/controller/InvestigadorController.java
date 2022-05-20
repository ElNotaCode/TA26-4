package com.crud.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.dto.Investigador;
import com.crud.spring.service.InvestigadorServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadorController {
	
	@Autowired
	InvestigadorServiceImpl InvestigadorServiceImpl;
	
	//listar
		@GetMapping("/investigadores")
		public List<Investigador> listarInvestigador(){
			return InvestigadorServiceImpl.listarInvestigadores();
		}
		//C
		@PostMapping("/investigadores")
		public Investigador createInvestigador(@RequestBody Investigador investigador) {
			return InvestigadorServiceImpl.createInvestigador(investigador);
		}
		
		//R
		@GetMapping("/investigadores/{id}")
		public Investigador readInvestigador(@PathVariable(name="id")int id) {
			return InvestigadorServiceImpl.readInvestigador(id);
		}
		
		//U
		@PutMapping("/investigadores/{id}")
		public Investigador updateInvestigador(@PathVariable(name="id")int id,@RequestBody Investigador investigador) {
			
			Investigador investigador_seleccionado = new Investigador();
			Investigador investigador_actualizado = new Investigador();
			
			investigador_seleccionado = InvestigadorServiceImpl.readInvestigador(id);
			
			investigador_seleccionado.setDni(investigador.getDni());
			investigador_seleccionado.setNombre_apellidos(investigador.getNombre_apellidos());
			investigador_seleccionado.setFacultad(investigador.getFacultad());
			
			investigador_actualizado = InvestigadorServiceImpl.updateInvestigador(investigador_seleccionado);

			
			return investigador_actualizado;
		}
		
		//D
		@DeleteMapping("/investigadores/{id}")
		public void deleteInvestigador(@PathVariable(name="id") int id) {
			InvestigadorServiceImpl.deleteInvestigador(id);
		}

}
