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

import com.crud.spring.dto.Equipo;
import com.crud.spring.service.EquipoServiceImpl;

@RestController
@RequestMapping("/api")
public class EquipoController {
	
	@Autowired
	EquipoServiceImpl equipoServiceImpl;
	
	//listar
		@GetMapping("/equipos")
		public List<Equipo> listarEquipo(){
			return equipoServiceImpl.listarEquipos();
		}
		//C
		@PostMapping("/equipos")
		public Equipo createEquipo(@RequestBody Equipo equipo) {
			return equipoServiceImpl.createEquipo(equipo);
		}
		
		//R
		@GetMapping("/equipos/{id}")
		public Equipo readEquipo(@PathVariable(name="id")int id) {
			return equipoServiceImpl.readEquipo(id);
		}
		
		//U
		@PutMapping("/equipos/{id}")
		public Equipo updateEquipo(@PathVariable(name="id")int id,@RequestBody Equipo equipo) {
			
			Equipo equipo_seleccionado = new Equipo();
			Equipo equipo_actualizado = new Equipo();
			
			equipo_seleccionado = equipoServiceImpl.readEquipo(id);
			
			equipo_seleccionado.setNumero_serie(equipo.getNumero_serie());
			equipo_seleccionado.setNombre(equipo.getNombre());
			equipo_seleccionado.setFacultad(equipo.getFacultad());
			
			equipo_actualizado = equipoServiceImpl.updateEquipo(equipo_seleccionado);
			
			return equipo_actualizado;
		}
		
		//D
		@DeleteMapping("/equipos/{id}")
		public void deleteEquipo(@PathVariable(name="id") int id) {
			equipoServiceImpl.deleteEquipo(id);
		}

}
