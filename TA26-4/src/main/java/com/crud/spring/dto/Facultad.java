package com.crud.spring.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="facultad")
public class Facultad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_facultad;
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany
	//@JoinColumn(name="id_investigadores")
	@JoinColumn(name="id_facultad")
	List<Investigador> listaInvestigador;
	
	@OneToMany
	//@JoinColumn(name="id_equipos")
	@JoinColumn(name="id_facultad")
	List<Equipo> listaEquipo;
	
	public Facultad() {
		
	}
	
	public Facultad(int id_facultad, String nombre, List<Investigador> listaInvestigador, List<Equipo> listaEquipo) {
		//super();
		this.id_facultad = id_facultad;
		this.nombre = nombre;
		this.listaInvestigador = listaInvestigador;
		this.listaEquipo = listaEquipo;
	}

	public int getId_facultad() {
		return id_facultad;
	}

	public void setId_facultad(int id_facultad) {
		this.id_facultad = id_facultad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "investigadores")
	public List<Investigador> getListaInvestigador() {
		return listaInvestigador;
	}

	public void setListaInvestigador(List<Investigador> listaInvestigador) {
		this.listaInvestigador = listaInvestigador;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipos")
	public List<Equipo> getListaEquipo() {
		return listaEquipo;
	}

	public void setListaEquipo(List<Equipo> listaEquipo) {
		this.listaEquipo = listaEquipo;
	}

	@Override
	public String toString() {
		return "Facultad [id_facultad=" + id_facultad + ", nombre=" + nombre + ", listaInvestigador="
				+ listaInvestigador + ", listaEquipo=" + listaEquipo + "]";
	}
	
}
