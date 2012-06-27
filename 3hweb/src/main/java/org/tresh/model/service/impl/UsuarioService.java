package org.tresh.model.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.tresh.model.core.Categoria;
import org.tresh.model.core.Usuario;
import org.tresh.model.dao.IUsuarioDao;
import org.tresh.model.exception.TreshExcepcion;
import org.tresh.model.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

	@Resource
	private IUsuarioDao dao;

	public Usuario nuevoUsuario(){
		return new Usuario();
	}
	
	@Override
	public void guardar(Usuario usuario) {
		dao.guardar(usuario);
	}

	@Override
	public String validar(String nombre, String clave) {
     Usuario u;
     u=dao.validarUsuario(nombre, clave);
     if(u==null)
      return "-------------No existe";
     else
      return "-------------Existe";	 
	}

}
