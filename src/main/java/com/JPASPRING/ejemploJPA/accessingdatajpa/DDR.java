package com.JPASPRING.ejemploJPA.accessingdatajpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "ddr")
public class DDR {
	@Id
	private Long codigo;
	@Column(name = "denominacion", nullable = false)
	private String denominacion;
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	@Column(name = "año", nullable = false)
	private int año;
	@Column(name = "posesion", nullable = false)
	private int posesion;
  
  
  
public DDR() {	
}



public DDR(Long codigo, String denominacion, String descripcion, int año, int posesion) {
	this.codigo = codigo;
	this.denominacion = denominacion;
	this.descripcion = descripcion;
	this.año = año;
	this.posesion = posesion;
}



@Override
public String toString() {
	return "DDR [codigo=" + codigo + ", denominacion=" + denominacion + ", descripcion=" + descripcion + ", año=" + año
			+ ", posesion=" + posesion + "]";
}



public Long getCodigo() {
	return codigo;
}

public void setCodigo(Long codigo) {
	this.codigo = codigo;
}

public String getDenominacion() {
	return denominacion;
}

public void setDenominacion(String denominacion) {
	this.denominacion = denominacion;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public int getAño() {
	return año;
}

public void setAño(int año) {
	this.año = año;
}

public int getPosesion() {
	return posesion;
}

public void setPosesion(int posesion) {
	this.posesion = posesion;
}


}