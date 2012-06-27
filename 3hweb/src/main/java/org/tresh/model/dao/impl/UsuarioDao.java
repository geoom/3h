package org.tresh.model.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.tresh.model.core.Categoria;
import org.tresh.model.core.Usuario;
import org.tresh.model.dao.IUsuarioDao;

@Repository
public class UsuarioDao extends SpringHibernateDao implements IUsuarioDao {

	@Autowired
	public UsuarioDao(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Transactional(readOnly = true)  
	public Collection getUsuario(String nombreUsuario) {
		return   getHibernateTemplate().
			       findByNamedQuery("buscarUsuarioPorNombre", nombreUsuario);
	}

	@Transactional
	public void guardar(Usuario usuario) {
		getHibernateTemplate().saveOrUpdate(usuario);  		
	}

	@Transactional(readOnly = true)  
	public Collection getUsuario(Integer idUusuario) {
		return   getHibernateTemplate().
			       findByNamedQuery("buscarUsuarioPorId", idUusuario);
	}

	@Transactional(readOnly = true)  
	public Usuario validarUsuario(String nombre, String clave) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("nombre", nombre);
		map.put("clave", clave);
		return (Usuario) this.findSingleResultByNamedQuery("validarUsuario", map);			       
	}
	
}
