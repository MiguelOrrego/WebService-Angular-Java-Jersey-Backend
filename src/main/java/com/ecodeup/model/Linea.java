package com.ecodeup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="linea")
public class Linea {
	@Id
	@Column
	private int linumerolinea;
	
	@Column
	private String percedula;
	
	@Column
	private String linestado;
	
	@Column
	private String tipo_plan;

	
	
	
	
	public String getPercedula() {
		return percedula;
	}

	public void setPercedula(String percedula) {
		this.percedula = percedula;
	}

	public int getLinumerolinea() {
		return linumerolinea;
	}

	public void setLinumerolinea(int linumerolinea) {
		this.linumerolinea = linumerolinea;
	}

	public String getLinestado() {
		return linestado;
	}

	public void setLinestado(String linestado) {
		this.linestado = linestado;
	}

	public String getTipo_plan() {
		return tipo_plan;
	}

	public void setTipo_plan(String tipo_plan) {
		this.tipo_plan = tipo_plan;
	}
	
	
}