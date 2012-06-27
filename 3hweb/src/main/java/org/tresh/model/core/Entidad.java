package org.tresh.model.core;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "enti_tipo", discriminatorType = DiscriminatorType.INTEGER)
@Table(name = "entidad", schema = "3h", uniqueConstraints = {
    @UniqueConstraint(columnNames = "enti_ruc"),
    @UniqueConstraint(columnNames = "enti_dni")})
public abstract class Entidad implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identidad", unique = true, nullable = false)
    private Integer id;
    @Column(name = "enti_nombre", nullable = false, length = 20)
    private String nombre;
    @Column(name = "enti_descripcion", length = 45)
    private String descripcion;
    @Column(name = "enti_email", length = 30)
    private String email;
    @Column(name = "enti_web", length = 45)
    private String web;
    @OneToOne(mappedBy="entidad")
    private Proveedor proveedor;
    @OneToOne(mappedBy="entidad")
    private Consumidor consumidor;
    @OneToOne(mappedBy="entidad")
    private Usuario usuario;
    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="ubic_idubicacion",unique=true,nullable=true)
    private Ubicacion ubicacion;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "entidad")
    private List<Telefono> telefonos;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
}
