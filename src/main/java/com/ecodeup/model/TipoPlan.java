package com.ecodeup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="precioplan")
public class TipoPlan {
	
	@Id
	private int tipo_plan;
	
	@Column
	private double precio;

	public int getTipo_plan() {
		return tipo_plan;
	}

	public void setTipo_plan(int tipo_plan) {
		this.tipo_plan = tipo_plan;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
