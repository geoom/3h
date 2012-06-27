package org.tresh.model.core;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import java.util.List;

/**
*
* @author solriver
*/
@NamedQuery(name = "validarUsuario",
query = "SELECT u FROM Usuario u "
+ "WHERE u.nombre=:nombre AND u.clave=:clave")
@Entity
@Table(name = "usuario", catalog = "3h", uniqueConstraints =
@UniqueConstraint(columnNames = "enti_identidad"))
public class Usuario implements java.io.Serializable {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
   @Id	
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idusuario")
   private Integer id;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "enti_identidad", unique = true, nullable = false)
   private Entidad entidad;
   @Column(name = "usua_nombre", length = 45, nullable = false)
   private String nombre;
   @Column(name = "usua_clave", length = 45, nullable = false)
   private String clave;
   @Column(name = "usua_estado")
   private Boolean estado;
   @Temporal(TemporalType.DATE)
   @Column(name = "usua_ultimo_ingreso")
   private Date ultimoIngreso;
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usuarioEmisor")
   private List<Notificacion> notificacionesEmitidas;
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usuarioReceptor")
   private List<Notificacion> notificacionesRecibidas;

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

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public String getClave() {
       return clave;
   }

   public void setClave(String clave) {
       this.clave = clave;
   }

   public Boolean getEstado() {
       return estado;
   }

   public void setEstado(Boolean estado) {
       this.estado = estado;
   }

   public Date getUltimoIngreso() {
       return ultimoIngreso;
   }

   public void setUltimoIngreso(Date ultimoIngreso) {
       this.ultimoIngreso = ultimoIngreso;
   }

   public List<Notificacion> getNotificacionesEmitidas() {
       return notificacionesEmitidas;
   }

   public void setNotificacionesEmitidas(List<Notificacion> notificacionesEmitidas) {
       this.notificacionesEmitidas = notificacionesEmitidas;
   }

   public List<Notificacion> getNotificacionesRecibidas() {
       return notificacionesRecibidas;
   }

   public void setNotificacionesRecibidas(List<Notificacion> notificacionesRecibidas) {
       this.notificacionesRecibidas = notificacionesRecibidas;
   }

}
