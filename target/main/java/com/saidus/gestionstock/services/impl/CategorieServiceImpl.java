package com.saidus.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.saidus.gestionstock.dao.ICategorieDao;
import com.saidus.gestionstock.entities.Categorie;
import com.saidus.gestionstock.services.ICategorieService;

@Transactional
public class CategorieServiceImpl implements ICategorieService {

	private ICategorieDao dao;

	public void setDao(ICategorieDao dao) {
		this.dao = dao;
	}

	public Categorie getById(Long id) {
		return dao.getById(id);
	}

	public List<Categorie> selectAll() {
		return dao.selectAll();
	}

	public List<Categorie> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public Categorie save(Categorie entity) {
		return dao.save(entity);
	}

	public Categorie update(Categorie entity) {
		return dao.update(entity);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public Categorie findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public Categorie findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
