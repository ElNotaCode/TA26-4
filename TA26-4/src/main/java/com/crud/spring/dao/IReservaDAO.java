package com.crud.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Integer> {

}
