/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tresh.model.core;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author solriver
 */
@Entity
@DiscriminatorValue("0")
public class Persona extends Entidad {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "enti_apellido_paterno", length = 45)
    private String apellidoPaterno;
    @Column(name = "enti_apellido_materno", length = 45)
    private String apellidoMaterno;
    @Column(name = "enti_dni", unique = true, length = 8)
    private String dni;
    @Temporal(TemporalType.DATE)
    @Column(name = "enti_fecha_nacimiento")
    private Date fechaNacimiento;

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
