package org.tresh.model.domain;

import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "referencia", schema = "3h")
public class Referencia implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreferencia")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prov_idproveedor3h", nullable = false)
    private Proveedor3h proveedor3h;
    @Column(name = "refe_nombre", length = 45)
    private String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Proveedor3h getProveedor3h() {
        return proveedor3h;
    }

    public void setProveedor3h(Proveedor3h proveedor3h) {
        this.proveedor3h = proveedor3h;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
