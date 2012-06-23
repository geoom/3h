package org.tresh.model.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.tresh.model.core.Usuario;
import org.tresh.model.dao.IUsuarioDao;

@Repository
public class UsuarioDao extends HibernateDaoSupport implements IUsuarioDao {

	@Autowired  
    public UsuarioDao(SessionFactory sessionFactory) {  
        super.setSessionFactory(sessionFactory);  
    }
	
	@Transactional(readOnly = true)  
	public Usuario getUsuario(String nombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void guardar(Usuario usuario) {
		getHibernateTemplate().saveOrUpdate(usuario);  		
	}

}
