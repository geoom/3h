package org.tresh.view.bean;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.tresh.model.core.Usuario;
import org.tresh.model.service.IUsuarioService;

@ManagedBean(name="ctusuario")
@SessionScoped
public class UsuarioBean extends ObjectBean{

	static final Logger log = Logger.getLogger(UsuarioBean.class);
	private Usuario usuarioLogeado;
	
	@Resource(name="usuarioServiceWeb")
	private IUsuarioService usuarioService;

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
		String mensaje = usuarioService.validar(usuarioLogeado);
		log.debug(mensaje);
//		log.debug(usuarioLogeado.getNombre());
	}
}
