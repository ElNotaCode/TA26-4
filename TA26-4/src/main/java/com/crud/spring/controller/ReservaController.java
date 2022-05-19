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

import com.crud.spring.dto.Reserva;
import com.crud.spring.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	//listar
			@GetMapping("/reservas")
			public List<Reserva> listarReserva(){
				return reservaServiceImpl.listarReservas();
			}
			//C
			@PostMapping("/reservas")
			public Reserva createReserva(@RequestBody Reserva reserva) {
				return reservaServiceImpl.createReserva(reserva);
			}
			
			//R
			@GetMapping("/reservas/{id}")
			public Reserva readReserva(@PathVariable(name="id")int id) {
				return reservaServiceImpl.readReserva(id);
			}
			
			//U
			@PutMapping("/reservas/{id}")
			public Reserva updateReserva(@PathVariable(name="id")int id,@RequestBody Reserva reserva) {
				
				Reserva reserva_seleccionada = new Reserva();
				Reserva reserva_actualizada = new Reserva();
				
				reserva_seleccionada.setComienzo(reserva.getComienzo());
				reserva_seleccionada.setFin(reserva.getFin());
				reserva_seleccionada.setEquipo(reserva.getEquipo());
				reserva_seleccionada.setInvestigador(reserva.getInvestigador());
				
				
				reserva_actualizada = reservaServiceImpl.updateReserva(reserva_seleccionada);
				
				return reserva_actualizada;
			}
			
			//D
			@DeleteMapping("/reservas/{id}")
			public void deleteReserva(@PathVariable(name="id") int id) {
				reservaServiceImpl.deleteReserva(id);
			}
	
}
