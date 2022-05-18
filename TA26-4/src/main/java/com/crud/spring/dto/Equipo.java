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
@Table(name="equipos")
public class Equipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_equipos;
	@Column(name="nombre_apellidos")
	private String nombre_apellidos;

	@ManyToOne
	@JoinColumn(name="id_facultad")
	Facultad facultad;
	
	@OneToMany
	@JoinColumn(name="id_equipos")
	List<Equipo> listaReservas;

	public Equipo() {
		
	}
	
	public Equipo(int id_equipos, String nombre_apellidos, Facultad facultad, List<Equipo> listaReservas) {
		//super();
		this.id_equipos = id_equipos;
		this.nombre_apellidos = nombre_apellidos;
		this.facultad = facultad;
		this.listaReservas = listaReservas;
	}

	public int getId_equipos() {
		return id_equipos;
	}

	public void setId_equipos(int id_equipos) {
		this.id_equipos = id_equipos;
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
		return "Equipo [id_equipos=" + id_equipos + ", nombre_apellidos=" + nombre_apellidos + ", facultad=" + facultad
				+ ", listaReservas=" + listaReservas + "]";
	}
	
}
