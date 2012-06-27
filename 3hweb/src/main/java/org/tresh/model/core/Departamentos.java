/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author solriver
 */
@Entity
@Table(name = "departamentos", catalog = "3h")
public class Departamentos implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "CCDD",length = 2)
    private String ccdd;
    @Column(name = "NOMBREDD", length = 45)
    private String nombredd;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "departamento")
    private List<Provincia> provincias;

    public String getCcdd() {
        return ccdd;
    }

    public void setCcdd(String ccdd) {
        this.ccdd = ccdd;
    }

    public String getNombredd() {
        return nombredd;
    }

    public void setNombredd(String nombredd) {
        this.nombredd = nombredd;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }



}
