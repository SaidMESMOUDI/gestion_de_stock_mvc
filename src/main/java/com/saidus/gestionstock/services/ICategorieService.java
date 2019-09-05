package com.saidus.gestionstock.services;

import java.util.List;

import com.saidus.gestionstock.entities.Categorie;

public interface ICategorieService {
	public Categorie getById(Long id);
	public List<Categorie> selectAll();
	public List<Categorie> selectAll(String sortField, String sort);
	public Categorie save(Categorie entity);
	public Categorie update(Categorie entity);
	public void remove(Long id);
	public Categorie findOne(String paramName, Object paramValue);
	public Categorie findOne(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
}
