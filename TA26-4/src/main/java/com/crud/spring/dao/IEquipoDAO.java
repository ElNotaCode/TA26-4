package com.crud.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.dto.Equipo;

public interface IEquipoDAO extends JpaRepository<Equipo, Integer> {

}
