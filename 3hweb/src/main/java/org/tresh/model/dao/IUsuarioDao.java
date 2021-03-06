package org.tresh.model.dao;

import java.util.Collection;

import org.tresh.model.core.Categoria;
import org.tresh.model.core.Usuario;

public interface IUsuarioDao {

	Collection getUsuario(String nombreUsuario);
	Collection getUsuario(Integer idUusuario);
	void guardar(Usuario usuario);
	public Usuario validarUsuario(String nombre, String clave);
	
}
