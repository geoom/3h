/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author solriver
 */
@Entity()
@DiscriminatorValue("1")
public class Organizacion extends Entidad {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "enti_direccion", length = 45)
    private String direccion;
    @Column(name = "enti_ruc", unique = true, length = 13)
    private String ruc;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
