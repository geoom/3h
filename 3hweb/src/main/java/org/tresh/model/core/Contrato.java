/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@Table(name = "reserva3h", schema = "3h")
public abstract class Contrato implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva3h")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serv_idservicio", nullable = false)
    private Servicio servicio;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cons_idconsumidor3h", nullable = false)
    private Consumidor consumidor;
    @Temporal(TemporalType.DATE)
    @Column(name = "rese_fecha")
    private Date fecha;
    @Temporal(TemporalType.TIME)
    @Column(name = "rese_hora")
    private Date hora;
    @Column(name = "rese_cantidad")
    private Integer cantidad;
    @Column(name = "rese_precio_estimado", precision = 22, scale = 0)
    private Double precioEstimado;
    @Column(name = "rese_descuento", precision = 22, scale = 0)
    private Double descuento;
    @Column(name = "rese_precio_final", precision = 22, scale = 0)
    private Double precioFinal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioEstimado() {
        return precioEstimado;
    }

    public void setPrecioEstimado(Double precioEstimado) {
        this.precioEstimado = precioEstimado;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }

}
