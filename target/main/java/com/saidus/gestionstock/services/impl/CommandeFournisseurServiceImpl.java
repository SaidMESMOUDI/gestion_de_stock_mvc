package com.saidus.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.saidus.gestionstock.dao.ICommandeFournisseurDao;
import com.saidus.gestionstock.entities.CommandeFournisseur;
import com.saidus.gestionstock.services.ICommandeFournisseurService;

@Transactional
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService {

	private ICommandeFournisseurDao dao;

	public void setDao(ICommandeFournisseurDao dao) {
		this.dao = dao;
	}

	public CommandeFournisseur getById(Long id) {
		return dao.getById(id);
	}

	public List<CommandeFournisseur> selectAll() {
		return dao.selectAll();
	}

	public List<CommandeFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public CommandeFournisseur save(CommandeFournisseur entity) {
		return dao.save(entity);
	}

	public CommandeFournisseur update(CommandeFournisseur entity) {
		return dao.update(entity);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public CommandeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
