/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "bandeja", schema = "3h")
public class BandejaNotificacion implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @OneToOne
    @JoinColumn(name="idperfil")
    private Perfil perfil;
    @Column(name = "band_total_msjs")
    private Integer totalMensajes;
    @Column(name = "band_msjs_no_leidos")
    private Integer totalMensajesNoLeidos;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bandeja")
    private List<Notificacion> notificaciones;

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Integer getTotalMensajes() {
        return totalMensajes;
    }

    public void setTotalMensajes(Integer totalMensajes) {
        this.totalMensajes = totalMensajes;
    }

    public Integer getTotalMensajesNoLeidos() {
        return totalMensajesNoLeidos;
    }

    public void setTotalMensajesNoLeidos(Integer totalMensajesNoLeidos) {
        this.totalMensajesNoLeidos = totalMensajesNoLeidos;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }
}
