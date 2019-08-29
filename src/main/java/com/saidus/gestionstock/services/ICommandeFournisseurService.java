package com.saidus.gestionstock.services;

import java.util.List;

import com.saidus.gestionstock.entities.CommandeFournisseur;

public interface ICommandeFournisseurService {
	public CommandeFournisseur getById(Long id);
	public List<CommandeFournisseur> selectAll();
	public List<CommandeFournisseur> selectAll(String sortField, String sort);
	public CommandeFournisseur save(CommandeFournisseur entity);
	public CommandeFournisseur update(CommandeFournisseur entity);
	public void remove(Long id);
	public CommandeFournisseur findOne(String paramName, Object paramValue);
	public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
}
