package com.crud.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.dto.Facultad;

public interface IFacultadDAO extends JpaRepository<Facultad, Integer> {

}
