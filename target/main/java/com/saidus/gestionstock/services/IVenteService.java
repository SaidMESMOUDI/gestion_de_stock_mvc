package com.saidus.gestionstock.services;

import java.util.List;

import com.saidus.gestionstock.entities.Vente;

public interface IVenteService {
	public Vente getById(Long id);
	public List<Vente> selectAll();
	public List<Vente> selectAll(String sortField, String sort);
	public Vente save(Vente entity);
	public Vente update(Vente entity);
	public void remove(Long id);
	public Vente findOne(String paramName, Object paramValue);
	public Vente findOne(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
}
