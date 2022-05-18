package com.crud.spring.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reserva")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_reserva;
	
	@ManyToOne
	@JoinColumn(name = "id_equipos")
	Equipo equipo;
	@ManyToOne
	@JoinColumn(name = "id_investigadores")
	Investigador investigador;
	
	public Reserva() {
		
	}
	
	public Reserva(int id_reserva, Equipo equipo, Investigador investigador) {
		//super();
		this.id_reserva = id_reserva;
		this.equipo = equipo;
		this.investigador = investigador;
	}
	
	public int getId_reserva() {
		return id_reserva;
	}
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public Investigador getInvestigador() {
		return investigador;
	}
	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	@Override
	public String toString() {
		return "Reserva [id_reserva=" + id_reserva + ", equipo=" + equipo + ", investigador=" + investigador + "]";
	}
	
}
