package org.tresh.model.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario3h")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -117741043194830120L;

	@Id
	@Column(name = "usua_idusuario")
	@GeneratedValue
	private Integer id;
	
	@Column(name = "usua_nombre")
	private String nombre;
	
	@Column(name = "usua_clave")
	private String clave;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
}
