/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "notificacion", schema = "3h")
public class Notificacion implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnotificacion")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usua_idusuario_emisor", nullable = false)
    private Usuario usuarioEmisor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usua_idusuario_receptor", nullable = false)
    private Usuario usuarioReceptor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "band_idbandeja", nullable = false)
    private BandejaNotificacion bandeja;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "noti_idnotificacion_padre")
    private Notificacion notificacionPadre;
    @Column(name = "noti_mensaje", length = 45)
    private String mensaje;
    @Temporal(TemporalType.DATE)
    @Column(name = "noti_fecha")
    private Date fecha;
    @Temporal(TemporalType.TIME)
    @Column(name = "noti_hora")
    private Date hora;
    @Column(name = "noti_estado")
    private Boolean estado;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "notificacionPadre")
    private List<Notificacion> notificacionesHijas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuarioEmisor() {
        return usuarioEmisor;
    }

    public void setUsuarioEmisor(Usuario usuarioEmisor) {
        this.usuarioEmisor = usuarioEmisor;
    }

    public Usuario getUsuarioReceptor() {
        return usuarioReceptor;
    }

    public void setUsuarioReceptor(Usuario usuarioReceptor) {
        this.usuarioReceptor = usuarioReceptor;
    }

    public BandejaNotificacion getBandeja() {
        return bandeja;
    }

    public void setBandeja(BandejaNotificacion bandeja) {
        this.bandeja = bandeja;
    }

    public Notificacion getNotificacionPadre() {
        return notificacionPadre;
    }

    public void setNotificacionPadre(Notificacion notificacionPadre) {
        this.notificacionPadre = notificacionPadre;
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Notificacion> getNotificacionesHijas() {
        return notificacionesHijas;
    }

    public void setNotificacionesHijas(List<Notificacion> notificacionesHijas) {
        this.notificacionesHijas = notificacionesHijas;
    }
}
