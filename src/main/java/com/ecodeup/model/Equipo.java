package com.ecodeup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipo")
public class Equipo {
	
	@Id
	@Column
	private int equserial;
	
	@Column
	private String linumerolinea;
	
	@Column
	private String equmarca;
	
	@Column
	private String equdescripcion;
	
	@Column
	private String equestado;

	public int getEquserial() {
		return equserial;
	}

	public void setEquserial(int equserial) {
		this.equserial = equserial;
	}

	public String getLinumerolinea() {
		return linumerolinea;
	}

	public void setLinumerolinea(String linumerolinea) {
		this.linumerolinea = linumerolinea;
	}

	public String getEqumarca() {
		return equmarca;
	}

	public void setEqumarca(String equmarca) {
		this.equmarca = equmarca;
	}

	public String getEqudescripcion() {
		return equdescripcion;
	}

	public void setEqudescripcion(String equdescripcion) {
		this.equdescripcion = equdescripcion;
	}

	public String getEquestado() {
		return equestado;
	}

	public void setEquestado(String equestado) {
		this.equestado = equestado;
	}

	
}
