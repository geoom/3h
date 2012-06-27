package org.tresh.model.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.tresh.model.core.Contrato;

/**
 *
 * @author solriver
 */
@Entity
public class Reserva3h extends Contrato implements java.io.Serializable{

    @Temporal(TemporalType.DATE)
    @Column(name = "rese_fecha_llegada")
    private Date fechaLlegada;
    @Temporal(TemporalType.TIME)
    @Column(name = "rese_hora_llegada")
    private Date horaLlegada;
    @Temporal(TemporalType.DATE)
    @Column(name = "rese_fecha_salida")
    private Date fechaSalida;
    @Temporal(TemporalType.TIME)
    @Column(name = "rese_hora_salida")
    private Date horaSalida;

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }
}
