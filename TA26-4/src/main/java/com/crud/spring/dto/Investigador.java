package com.crud.spring.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="investigadores")
public class Investigador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_investigadores;
	@Column(name="dni")
	private String dni;
	@Column(name="nombre_apellidos")
	private String nombre_apellidos;
	
	@ManyToOne
	@JoinColumn(name="id_facultad")
	Facultad facultad;
	
	@OneToMany
	@JoinColumn(name="id_investigadores")
	List<Equipo> listaReservas;
	
	public Investigador() {
		
	}

	public Investigador(int id_investigadores, String dni, String nombre_apellidos, Facultad facultad,
			List<Equipo> listaReservas) {
		//super();
		this.id_investigadores = id_investigadores;
		this.dni = dni;
		this.nombre_apellidos = nombre_apellidos;
		this.facultad = facultad;
		this.listaReservas = listaReservas;
	}

	public int getId_investigadores() {
		return id_investigadores;
	}

	public void setId_investigadores(int id_investigadores) {
		this.id_investigadores = id_investigadores;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre_apellidos() {
		return nombre_apellidos;
	}

	public void setNombre_apellidos(String nombre_apellidos) {
		this.nombre_apellidos = nombre_apellidos;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva")
	public List<Equipo> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Equipo> listaReservas) {
		this.listaReservas = listaReservas;
	}

	@Override
	public String toString() {
		return "Investigador [id_investigadores=" + id_investigadores + ", dni=" + dni + ", nombre_apellidos="
				+ nombre_apellidos + ", facultad=" + facultad + ", listaReservas=" + listaReservas + "]";
	}
	
}
