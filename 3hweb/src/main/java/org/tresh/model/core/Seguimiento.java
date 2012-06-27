/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import java.util.Date;
import javax.persistence.*;

import org.tresh.model.support.SeguimientoId;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "seguimiento", schema = "3h")
public class Seguimiento implements java.io.Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "idConsumidor", column =
        @Column(name = "cons_idconsumidor3h", nullable = false)),
        @AttributeOverride(name = "idProveedor", column =
        @Column(name = "prov_idproveedor3h", nullable = false))})
    private SeguimientoId id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cons_idconsumidor3h", nullable = false, insertable = false, updatable = false)
    private Consumidor consumidor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prov_idproveedor3h", nullable = false, insertable = false, updatable = false)
    private Proveedor proveedor;
    @Column(name = "segu_favorito", nullable = false)
    private boolean favorito;
    @Temporal(TemporalType.DATE)
    @Column(name = "segu_ultima_visita")
    private Date ultimaVisita;

    public SeguimientoId getId() {
        return id;
    }

    public void setId(SeguimientoId id) {
        this.id = id;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public Date getUltimaVisita() {
        return ultimaVisita;
    }

    public void setUltimaVisita(Date ultimaVisita) {
        this.ultimaVisita = ultimaVisita;
    }
}
