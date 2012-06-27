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
@Table(name = "fotografia", schema = "3h")
public class Fotografia implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfotografia")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grup_idgruposervicio3h", nullable = false)
    private GrupoServicio grupoServicio;
    @Basic(fetch= FetchType.LAZY) @Lob @Column(name = "foto_imagen", nullable = false)
    private byte[] imagen;
    @Column(name = "foto_descripcion", length = 45)
    private String descripcion;
    @Temporal(TemporalType.DATE)
    @Column(name = "foto_fecha", nullable = false)
    private Date fecha;
    @Temporal(TemporalType.TIME)
    @Column(name = "foto_hora", nullable = false)
    private Date hora;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GrupoServicio getGrupoServicio() {
        return grupoServicio;
    }

    public void setGrupoServicio(GrupoServicio grupoServicio) {
        this.grupoServicio = grupoServicio;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
