package com.saidus.gestionstock.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.saidus.gestionstock.dao.IGenericDao;
 
@SuppressWarnings("unchecked")
public class GenericDaoImpl<E> implements IGenericDao<E>{
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Class<E> type;


	public Class<E> getType() {
		return type;
	}

	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<E>) pt.getActualTypeArguments()[0];
	}

	@Override
	public E getById(Long id) {
		return entityManager.find(type, id);
	}

	@Override
	public List<E> selectAll() {
		Query query = entityManager.createQuery("select t from " + type.getSimpleName() + " t");
		return query.getResultList();
	}

	@Override
	public List<E> selectAll(String sortField, String sort) {
		Query query = entityManager.createQuery("select t from " + type.getSimpleName() + " t order by " + sortField + " " + sort);
		return query.getResultList();
	}

	@Override
	public E save(E entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		return entityManager.merge(entity);
	}

	@Override
	public void remove(Long id) {
		E tab = entityManager.getReference(type, id);
		entityManager.remove(tab);
	}

	@Override
	public E findOne(String paramName, Object paramValue) {
		Query query = entityManager.createQuery("select t from " + type.getSimpleName() + " t where " + paramName + " = :x");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
	}

	@Override
	public E findOne(String[] paramNames, Object[] paramValues) {
		if (paramNames.length != paramValues.length) {
			return null;
		}
		
		int len = paramNames.length;
		String queryString = "select e from " + type.getSimpleName() + " e where ";
		
		for (int i = 0; i < len; i++) {
			queryString += " e. " + paramNames[i] + " = :x" + i;
			if ((i+1) < len) {
				queryString += " and ";
			}
		}
		
		Query query = entityManager.createQuery(queryString);
		
		for (int i = 0; i < paramValues.length; i++) {
			query.setParameter("x" + i, paramValues[i]);
		}
		
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		Query query = entityManager.createQuery("select t from " + type.getSimpleName() + " t where " + paramName + " = :x");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size() > 0 ? ((Long) query.getSingleResult()).intValue() : 0;
	}

	@Override
	public E saveData(E uploadFile) {
		sessionFactory.getCurrentSession().save(uploadFile);
		return uploadFile;
	}

}
