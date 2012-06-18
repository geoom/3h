package org.tresh.model.service;

import org.tresh.model.core.Usuario;
import org.tresh.model.exception.TreshExcepcion;

public interface UsuarioService {
	
	Usuario validar(String username, String password) throws TreshExcepcion;
	
}
