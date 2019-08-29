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

	@Override
	public Categorie getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public List<Categorie> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Categorie> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Categorie save(Categorie entity) {
		return dao.save(entity);	
	}

	@Override
	public Categorie update(Categorie entity) {
		return dao.update(entity);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Categorie findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Categorie findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
