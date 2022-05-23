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
	@Column(name="numero_serie")
	private String numero_serie;
	@Column(name="nombre")
	private String nombre;

	@ManyToOne
	@JoinColumn(name="id_facultad")
	Facultad facultad;
	
	@OneToMany
	@JoinColumn(name="id_equipos")
	List<Reserva> listaReservas;

	public Equipo() {
		
	}

	public Equipo(int id_equipos, String numero_serie, String nombre, Facultad facultad, List<Reserva> listaReservas) {
		super();
		this.id_equipos = id_equipos;
		this.numero_serie = numero_serie;
		this.nombre = nombre;
		this.facultad = facultad;
		this.listaReservas = listaReservas;
	}

	public int getId_equipos() {
		return id_equipos;
	}

	public void setId_equipos(int id_equipos) {
		this.id_equipos = id_equipos;
	}

	public String getNumero_serie() {
		return numero_serie;
	}

	public void setNumero_serie(String numero_serie) {
		this.numero_serie = numero_serie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}

	@Override
	public String toString() {
		return "Equipo [id_equipos=" + id_equipos + ", numero_serie=" + numero_serie + ", nombre=" + nombre
				+ ", facultad=" + facultad + ", listaReservas=" + listaReservas + "]";
	}
	
}
