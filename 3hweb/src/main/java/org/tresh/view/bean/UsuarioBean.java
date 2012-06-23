package org.tresh.view.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.tresh.model.core.Usuario;
import org.tresh.model.service.IUsuarioService;

@Controller
@Scope("session")
public class UsuarioBean extends ObjectBean implements Serializable {

	private static final long serialVersionUID = 1L;
	static final Logger log = Logger.getLogger(UsuarioBean.class);
	private Usuario usuarioLogeado;

	@Resource
	private IUsuarioService usuarioService;

	public void setUsuarioService(IUsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@PostConstruct
	public void init() {
		usuarioLogeado = new Usuario();
	}

	public Usuario getUsuarioLogeado() {
		return usuarioLogeado;
	}

	public void setUsuarioLogeado(Usuario usuarioLogeado) {
		this.usuarioLogeado = usuarioLogeado;
	}

	public void loginAction() {
		String mensaje = usuarioService.validar(usuarioLogeado);
		log.debug(mensaje);
		// log.debug(usuarioLogeado.getNombre());
	}

	public void guardarUsuario() {
		usuarioService.guardar(usuarioLogeado);
		log.info("Se ha guardado el usuario !!");
	}
}
