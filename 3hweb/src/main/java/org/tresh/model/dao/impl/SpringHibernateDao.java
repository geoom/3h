package org.tresh.model.dao.impl;

import java.io.Serializable;
import java.util.List;

import net.sf.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.tresh.model.dao.IGenericDao;

@Repository
public class SpringHibernateDao extends HibernateDaoSupport implements IGenericDao{

	@Autowired  
    public SpringHibernateDao(SessionFactory sessionFactory) {  
        super.setSessionFactory(sessionFactory);  
    }  
	
	@Transactional  
    public void persist(Object entity) {  
        getHibernateTemplate().saveOrUpdate(entity);  
    }  
  
    @Transactional  
    public void persist(Object[] entities) {  
        for (int i = 0; i < entities.length; i++) {  
            persist(entities[i]);  
        }  
    }  
  
    @Transactional(readOnly = true)  
    public <T> List<T> find(Class<T> entityClass) {  
        final List<T> entities = getHibernateTemplate().loadAll(entityClass);  
        return entities;  
    }  
  
    @Transactional(readOnly = true)  
    public <T> T load(Class<T> entityClass, Serializable id) {  
        final T entity = (T)getHibernateTemplate().load(entityClass, id);  
        return entity;  
    }  
  
    @Transactional(readOnly = true)  
    public <T> List<T> find(String hql) {  
        final List<T> entities = getHibernateTemplate().find(hql);  
        return entities;  
    }

}
