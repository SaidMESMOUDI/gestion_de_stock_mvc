package com.saidus.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.saidus.gestionstock.dao.IUtilisateurDao;
import com.saidus.gestionstock.entities.Utilisateur;
import com.saidus.gestionstock.services.IUtilisateurService;

@Transactional
public class UtilisateurServiceImpl implements IUtilisateurService {

	private IUtilisateurDao dao;

	public void setDao(IUtilisateurDao dao) {
		this.dao = dao;
	}

	public Utilisateur getById(Long id) {
		return dao.getById(id);
	}

	public List<Utilisateur> selectAll() {
		return dao.selectAll();
	}

	public List<Utilisateur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public Utilisateur save(Utilisateur entity) {
		return dao.save(entity);
	}

	public Utilisateur update(Utilisateur entity) {
		return dao.update(entity);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public Utilisateur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public Utilisateur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
