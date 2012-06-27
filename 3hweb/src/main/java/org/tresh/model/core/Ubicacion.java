/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "ubicacion", schema = "3h")
public class Ubicacion implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "idubicacion", unique = true, nullable = false)
    private int idubicacion;
    @Column(name = "direccion", nullable = false, length = 45)
    private String direccion;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "ubicacion")
    private Entidad entidad;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "distritos_CCDI", referencedColumnName = "CCDI", nullable = false),
        @JoinColumn(name = "distritos_CCPP", referencedColumnName = "CCPP", nullable = false),
        @JoinColumn(name = "distritos_CCDD", referencedColumnName = "CCDD", nullable = false)})
    private Distritos distrito;

    public Ubicacion() {
    }

    public Ubicacion(int idubicacion, Distritos distritos, String direccion) {
        this.idubicacion = idubicacion;
        this.distrito = distritos;
        this.direccion = direccion;
    }

    public int getIdubicacion() {
        return this.idubicacion;
    }

    public void setIdubicacion(int idubicacion) {
        this.idubicacion = idubicacion;
    }

    public Distritos getDistrito() {
        return this.distrito;
    }

    public void setDistrito(Distritos distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }
}
