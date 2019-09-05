package com.saidus.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.saidus.gestionstock.dao.ILigneCommandeFournisseurDao;
import com.saidus.gestionstock.entities.LigneCommandeFournisseur;
import com.saidus.gestionstock.services.ILigneCommandeFournisseurService;

@Transactional
public class LigneCommandeFournisseurServiceImpl implements ILigneCommandeFournisseurService {

	private ILigneCommandeFournisseurDao dao;

	public void setDao(ILigneCommandeFournisseurDao dao) {
		this.dao = dao;
	}

	public LigneCommandeFournisseur getById(Long id) {
		return dao.getById(id);
	}

	public List<LigneCommandeFournisseur> selectAll() {
		return dao.selectAll();
	}

	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity) {
		return dao.save(entity);
	}

	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity) {
		return dao.update(entity);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public LigneCommandeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public LigneCommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
