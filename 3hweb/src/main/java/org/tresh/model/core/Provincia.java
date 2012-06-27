/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;


import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.tresh.model.support.ProvinciaId;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "provincia", catalog = "3h")
public class Provincia implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "ccpp", column =
        @Column(name = "CCPP", nullable = false, length = 2)),
        @AttributeOverride(name = "ccdd", column =
        @Column(name = "CCDD", nullable = false, length = 2))})
    private ProvinciaId id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CCDD", nullable = false, insertable = false, updatable = false)
    private Departamentos departamento;
    @Column(name = "NOMBREPP", length = 45)
    private String nombrepp;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "provincia")
    private List<Distritos> distritos;

    public ProvinciaId getId() {
        return id;
    }

    public void setId(ProvinciaId id) {
        this.id = id;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }

    public String getNombrepp() {
        return nombrepp;
    }

    public void setNombrepp(String nombrepp) {
        this.nombrepp = nombrepp;
    }

    public List<Distritos> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<Distritos> distritos) {
        this.distritos = distritos;
    }
}
