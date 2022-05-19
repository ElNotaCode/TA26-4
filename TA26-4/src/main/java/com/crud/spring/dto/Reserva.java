package com.crud.spring.dto;

import javax.persistence.Column;
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
	@Column(name="comienzo")
	private String comienzo;
	@Column(name="fin")
	private String fin;
	
	@ManyToOne
	@JoinColumn(name = "id_equipos")
	Equipo equipo;
	@ManyToOne
	@JoinColumn(name = "id_investigadores")
	Investigador investigador;
	
	public Reserva() {
		
	}

	public Reserva(int id_reserva, String comienzo, String fin, Equipo equipo, Investigador investigador) {
		super();
		this.id_reserva = id_reserva;
		this.comienzo = comienzo;
		this.fin = fin;
		this.equipo = equipo;
		this.investigador = investigador;
	}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public String getComienzo() {
		return comienzo;
	}

	public void setComienzo(String comienzo) {
		this.comienzo = comienzo;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
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
		return "Reserva [id_reserva=" + id_reserva + ", comienzo=" + comienzo + ", fin=" + fin + ", equipo=" + equipo
				+ ", investigador=" + investigador + "]";
	}
	
}
