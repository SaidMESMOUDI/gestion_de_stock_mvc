package com.saidus.gestionstock.services;

import java.util.List;

import com.saidus.gestionstock.entities.LigneVente;

public interface ILigneVenteService {
	public LigneVente getById(Long id);
	public List<LigneVente> selectAll();
	public List<LigneVente> selectAll(String sortField, String sort);
	public LigneVente save(LigneVente entity);
	public LigneVente update(LigneVente entity);
	public void remove(Long id);
	public LigneVente findOne(String paramName, Object paramValue);
	public LigneVente findOne(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
}
