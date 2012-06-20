package org.tresh.view.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.tresh.model.core.Usuario;

@ManagedBean(name ="ctusuario")
@SessionScoped
public class UsuarioBean extends ObjectBean{

	static final Logger log = Logger.getLogger(UsuarioBean.class);
	private Usuario usuarioLogeado;

	@PostConstruct
	public void init(){
		usuarioLogeado = new Usuario();
	}
	
	public Usuario getUsuarioLogeado() {
		return usuarioLogeado;
	}

	public void setUsuarioLogeado(Usuario usuarioLogeado) {
		this.usuarioLogeado = usuarioLogeado;
	}
	
	public void loginAction(){
		log.debug("nombre: "+ usuarioLogeado.getNombre());
		log.debug("clave: "+ usuarioLogeado.getClave());		
	}
	
}
