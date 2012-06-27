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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.tresh.model.support.DistritosId;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "distritos", catalog = "3h")
public class Distritos implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "ccdi", column =
        @Column(name = "CCDI", nullable = false, length = 2)),
        @AttributeOverride(name = "ccpp", column =
        @Column(name = "CCPP", nullable = false, length = 2)),
        @AttributeOverride(name = "ccdd", column =
        @Column(name = "CCDD", nullable = false, length = 2))})
    private DistritosId id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "CCPP", referencedColumnName = "CCPP", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "CCDD", referencedColumnName = "CCDD", nullable = false, insertable = false, updatable = false)})
    private Provincia provincia;
    @Column(name = "NOMBREDI", length = 45)
    private String nombredi;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "distrito")
    private List<Ubicacion> ubicaciones;

    public DistritosId getId() {
        return id;
    }

    public void setId(DistritosId id) {
        this.id = id;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getNombredi() {
        return nombredi;
    }

    public void setNombredi(String nombredi) {
        this.nombredi = nombredi;
    }

    public List<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
}
