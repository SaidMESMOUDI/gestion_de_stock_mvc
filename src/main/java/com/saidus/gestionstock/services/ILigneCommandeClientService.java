package com.saidus.gestionstock.services;

import java.util.List;

import com.saidus.gestionstock.entities.LigneCommandeClient;

public interface ILigneCommandeClientService {
	public LigneCommandeClient getById(Long id);
	public List<LigneCommandeClient> selectAll();
	public List<LigneCommandeClient> selectAll(String sortField, String sort);
	public LigneCommandeClient save(LigneCommandeClient entity);
	public LigneCommandeClient update(LigneCommandeClient entity);
	public void remove(Long id);
	public LigneCommandeClient findOne(String paramName, Object paramValue);
	public LigneCommandeClient findOne(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
}
