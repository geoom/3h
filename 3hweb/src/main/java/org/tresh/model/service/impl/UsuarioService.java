package org.tresh.model.service.impl;


import org.springframework.stereotype.Service;
import org.tresh.model.core.Usuario;
import org.tresh.model.exception.TreshExcepcion;
import org.tresh.model.service.IUsuarioService;

@Service("usuarioServiceWeb")
public class UsuarioService implements IUsuarioService {

//	@Resource
//	private IGenericDao dao;

	public Usuario nuevoUsuario(){
		return new Usuario();
	}
	
	@Override
	public Usuario validar(String username, String password)
			throws TreshExcepcion {
		return null;
	}

	@Override
	public void guardar(Usuario usuario) {
//		dao.persist(usuario);
	}

	public String validar(Usuario usuario) {
		String nombreEsperado = "admin";
		String claveEsperada = "123";
		if(usuario.getNombre().equals(nombreEsperado) && usuario.getClave().equals(claveEsperada)){
			return "Login exitoso !!";
		}else{
			return "Login fallido !!";
		}
	}

}
