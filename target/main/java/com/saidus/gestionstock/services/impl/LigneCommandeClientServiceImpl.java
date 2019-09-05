package com.saidus.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.saidus.gestionstock.dao.ILigneCommandeClientDao;
import com.saidus.gestionstock.entities.LigneCommandeClient;
import com.saidus.gestionstock.services.ILigneCommandeClientService;

@Transactional
public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService {

	private ILigneCommandeClientDao dao;

	public void setDao(ILigneCommandeClientDao dao) {
		this.dao = dao;
	}

	public LigneCommandeClient getById(Long id) {
		return dao.getById(id);
	}

	public List<LigneCommandeClient> selectAll() {
		return dao.selectAll();
	}

	public List<LigneCommandeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public LigneCommandeClient save(LigneCommandeClient entity) {
		return dao.save(entity);
	}

	public LigneCommandeClient update(LigneCommandeClient entity) {
		return dao.update(entity);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public LigneCommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public LigneCommandeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
