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

import com.crud.spring.dto.Facultad;
import com.crud.spring.service.FacultadServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultadController {
	
	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	//listar testeado OK
		@GetMapping("/facultades")
		public List<Facultad> listarFacultad(){
			return facultadServiceImpl.listarFacultades();
		}
		//C testeado OK
		@PostMapping("/facultades")
		public Facultad createFacultad(@RequestBody Facultad facultad) {
			return facultadServiceImpl.createFacultad(facultad);
		}
		
		//R testeado OK
		@GetMapping("/facultades/{id}")
		public Facultad readFacultad(@PathVariable(name="id")int id) {
			return facultadServiceImpl.readFacultad(id);
		}
		
		//U  resteado OK
		@PutMapping("/facultades/{id}")
		public Facultad updateFacultad(@PathVariable(name="id")int id,@RequestBody Facultad facultad) {
			
			Facultad facultad_seleccionada = new Facultad();
			Facultad facultad_actualizada = new Facultad();
			
			facultad_seleccionada = facultadServiceImpl.readFacultad(id);
			
			facultad_seleccionada.setNombre(facultad.getNombre());
			
			facultad_actualizada = facultadServiceImpl.updateFacultad(facultad_seleccionada);
			
			return facultad_actualizada;
		}
		
		//D testeado OK
		@DeleteMapping("/facultades/{id}")
		public void deleteFacultad(@PathVariable(name="id") int id) {
			facultadServiceImpl.deleteFacultad(id);
		}

}
