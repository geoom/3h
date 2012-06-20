package org.tresh.model.dao;

import org.tresh.model.core.Usuario;

public interface IUsuarioDao {

	Usuario getUsuario(String nombreUsuario);
	
}
