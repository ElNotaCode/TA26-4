package com.crud.spring.service;

import java.util.List;

import com.crud.spring.dto.Reserva;

public interface IReservaService {

	//listar
	public List<Reserva> listarReservas();
	//C
	public Reserva createReserva(Reserva reserva);
	//R
	public Reserva readReserva(int id);
	//U
	public Reserva updateReserva(Reserva reserva);
	//D
	public void deleteReserva(int id);
	
}
