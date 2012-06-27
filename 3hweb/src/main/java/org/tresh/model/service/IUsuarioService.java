package org.tresh.model.service;

import org.tresh.model.core.Categoria;
import org.tresh.model.core.Usuario;
import org.tresh.model.exception.TreshExcepcion;

public interface IUsuarioService {
	
	String validar(String nombre, String clave);
	void guardar(Usuario usuario);
	
}
