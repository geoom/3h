/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "servicio", schema = "3h")
public class Servicio implements java.io.Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idservicio")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grup_idgruposervicio3h", nullable = false)
    private GrupoServicio grupoServicio;
    @Column(name = "serv_nombre", nullable = false, length = 45)
    private String nombre;
    @Column(name = "serv_descripcion", length = 45)
    private String descripcion;
    @Column(name = "serv_precio_normal", nullable = false, precision = 22, scale = 0)
    private double precioNormal;
    @Column(name = "serv_precio_oferta", precision = 22, scale = 0)
    private Double precioOferta;
    @Column(name = "serv_estado")
    private Boolean estado;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "servicio")
    private List<Contrato> reserva3hs;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    public Double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(Double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Contrato> getReserva3hs() {
        return reserva3hs;
    }

    public void setReserva3hs(List<Contrato> reserva3hs) {
        this.reserva3hs = reserva3hs;
    }


    
}
