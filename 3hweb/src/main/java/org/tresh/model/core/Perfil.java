/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "perfil", schema = "3h")
public class Perfil implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @OneToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;
    @Column(name = "perf_numero_visitas", nullable = false)
    private int nroVisitas;
    @Column(name = "perf_informacion", length = 45)
    private String informacion;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getNroVisitas() {
        return nroVisitas;
    }

    public void setNroVisitas(int nroVisitas) {
        this.nroVisitas = nroVisitas;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

}
