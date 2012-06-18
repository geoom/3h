package org.tresh.model.core;

import java.util.List;

/**
 * 
 * @author GEORGE MEJIA
 *
 */
public class Entidad {
	
	private String descripcion;
	private String email;
	private String web;
	private List<String> telefono;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public List<String> getTelefono() {
		return telefono;
	}
	public void setTelefono(List<String> telefono) {
		this.telefono = telefono;
	}


}
