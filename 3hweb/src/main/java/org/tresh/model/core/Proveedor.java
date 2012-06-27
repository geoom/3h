package org.tresh.model.core;


import java.util.List;
import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "proveedor3h", schema = "3h", uniqueConstraints =
@UniqueConstraint(columnNames = "enti_identidad"))
public abstract class Proveedor implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproveedor3h", unique = true, nullable = false)
    private Integer id;
    @Column(name = "prov_nro_calificaciones", nullable = false)
    private int nroDeCalificaciones;
    @Column(name = "prov_calificacion_final", nullable = false)
    private int calificacionFinal;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enti_identidad", unique = true, nullable = false)
    private Entidad entidad;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "proveedor")
    private List<GrupoServicio> gruposDeServicios;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "proveedor")
    private List<Seguimiento> seguimientos;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "proveedor")
    private List<Comentario> comentarios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }

    public int getNroDeCalificaciones() {
        return nroDeCalificaciones;
    }

    public void setNroDeCalificaciones(int nroDeCalificaciones) {
        this.nroDeCalificaciones = nroDeCalificaciones;
    }

    public int getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(int calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }

    public List<GrupoServicio> getGruposDeServicios() {
        return gruposDeServicios;
    }

    public void setGruposDeServicios(List<GrupoServicio> gruposDeServicios) {
        this.gruposDeServicios = gruposDeServicios;
    }

    public List<Seguimiento> getSeguimientos() {
        return seguimientos;
    }

    public void setSeguimientos(List<Seguimiento> seguimientos) {
        this.seguimientos = seguimientos;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
