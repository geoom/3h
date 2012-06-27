/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "telefono", schema = "3h")
public class Telefono implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idtelefono")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enti_identidad", nullable = false)
    private Entidad entidad;
    @Column(name = "tele_numero", length = 45)
    private String numero;

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
