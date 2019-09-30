package com.ecodeup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
 @Table(name="factura")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int factnumero;
	
	@Column
	private int linumerolineas;
	
	@Column
	private String facvalor;
	

	@Column
	private String facfechaemision;

	private String mensaje;

	
	
	
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getFacfechaemision() {
		return facfechaemision;
	}

	public void setFacfechaemision(String facfechaemision) {
		this.facfechaemision = facfechaemision;
	}
	
	
	public int getFactnumero() {
		return factnumero;
	}

	public void setFactnumero(int factnumero) {
		this.factnumero = factnumero;
	}

	public int getLinumerolineas() {
		return linumerolineas;
	}

	public void setLinumerolineas(int linumerolineas) {
		this.linumerolineas = linumerolineas;
	}

	public String getFacvalor() {
		return facvalor;
	}

	public void setFacvalor(String facvalor) {
		this.facvalor = facvalor;
	}
	

}
