package org.tresh.model.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

import org.tresh.model.core.Proveedor;



/**
 *
 * @author solriver
 */
@Entity
public class Proveedor3h extends Proveedor {

    @Temporal(TemporalType.DATE)
    @Column(name = "prov_ultima_reserva")
    private Date ultimaReserva;
    @Column(name = "prov_tipo", nullable = false)
    private byte tipo;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "proveedor3h")
    private List<Referencia> referencias;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "proveedor3h")
    private List<Atraccion> atracciones;

    public Date getUltimaReserva() {
        return ultimaReserva;
    }

    public void setUltimaReserva(Date ultimaReserva) {
        this.ultimaReserva = ultimaReserva;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    public List<Referencia> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<Referencia> referencias) {
        this.referencias = referencias;
    }

    public List<Atraccion> getAtracciones() {
        return atracciones;
    }

    public void setAtracciones(List<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }
}