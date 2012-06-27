package org.tresh.model.core;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "categoria", schema = "3h")
public class Categoria implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria")
    private Integer id;
    @Column(name = "cate_nombre", nullable = false, length = 45)
    private String nombre;
    @Column(name = "cate_descripcion", length = 45)
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoria")
    private List<GrupoServicio> gruposDeServicios;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<GrupoServicio> getGruposDeServicios() {
        return gruposDeServicios;
    }

    public void setGruposDeServicios(List<GrupoServicio> gruposDeServicios) {
        this.gruposDeServicios = gruposDeServicios;
    }
    
}
