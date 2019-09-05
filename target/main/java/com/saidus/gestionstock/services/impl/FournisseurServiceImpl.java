package com.saidus.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.saidus.gestionstock.dao.IFournisseurDao;
import com.saidus.gestionstock.entities.Fournisseur;
import com.saidus.gestionstock.services.IFournisseurService;

@Transactional
public class FournisseurServiceImpl implements IFournisseurService {

	private IFournisseurDao dao;

	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}

	public Fournisseur getById(Long id) {
		return dao.getById(id);
	}

	public List<Fournisseur> selectAll() {
		return dao.selectAll();
	}

	public List<Fournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public Fournisseur save(Fournisseur entity) {
		return dao.save(entity);
	}

	public Fournisseur update(Fournisseur entity) {
		return dao.update(entity);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public Fournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public Fournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
