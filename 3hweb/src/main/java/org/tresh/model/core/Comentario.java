/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "comentario", schema = "3h")
public class Comentario implements java.io.Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomentario", unique = true, nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cons_idconsumidor3h", nullable = false)
    private Consumidor consumidor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prov_idproveedor3h", nullable = false)
    private Proveedor proveedor;
    @Column(name = "come_mensaje", length = 200)
    private String mensaje;
    @Temporal(TemporalType.DATE)
    @Column(name = "come_fecha")
    private Date fecha;
    @Temporal(TemporalType.TIME)
    @Column(name = "come_hora")
    private Date hora;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
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
}
