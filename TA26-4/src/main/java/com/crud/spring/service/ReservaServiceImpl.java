package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.dao.IReservaDAO;
import com.crud.spring.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService {
	
	@Autowired
	IReservaDAO iReservaDAO;
	
	@Override
	public List<Reserva> listarReservas() {
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva createReserva(Reserva reserva) {
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reserva readReserva(int id) {
		return iReservaDAO.findById(id).get();
	}

	@Override
	public Reserva updateReserva(Reserva reserva) {
		return iReservaDAO.save(reserva);
	}

	@Override
	public void deleteReserva(int id) {
		iReservaDAO.deleteById(id);
	}

}
