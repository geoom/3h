package org.tresh.model.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.tresh.model.core.Consumidor;

/**
 *
 * @author solriver
 */
@Entity
public class Consumidor3h extends Consumidor implements java.io.Serializable {

    @Temporal(TemporalType.DATE)
    @Column(name = "cons_ultima_reserva")
    private Date ultimaReserva;

    public Date getUltimaReserva() {
        return ultimaReserva;
    }

    public void setUltimaReserva(Date ultimaReserva) {
        this.ultimaReserva = ultimaReserva;
    }
}
