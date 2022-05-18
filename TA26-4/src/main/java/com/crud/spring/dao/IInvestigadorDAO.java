package com.crud.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.dto.Investigador;

public interface IInvestigadorDAO extends JpaRepository<Investigador, Integer>{

}
