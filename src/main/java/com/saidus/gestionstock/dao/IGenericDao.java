package com.saidus.gestionstock.dao;

import java.util.List;

public interface IGenericDao<E> {
	public E getById(Long id);
	public List<E> selectAll();
	public List<E> selectAll(String sortField, String sort);
	public E save(E entity);
	public E update(E entity);
	public void remove(Long id);
	public E findOne(String paramName, Object paramValue);
	public E findOne(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
	
	public E saveData(E uploadFile);
	
}
