package com.saidus.gestionstock.services;

import java.util.List;

import com.saidus.gestionstock.entities.CommandeClient;

public interface ICommandeClientService {
	public CommandeClient getById(Long id);
	public List<CommandeClient> selectAll();
	public List<CommandeClient> selectAll(String sortField, String sort);
	public CommandeClient save(CommandeClient entity);
	public CommandeClient update(CommandeClient entity);
	public void remove(Long id);
	public CommandeClient findOne(String paramName, Object paramValue);
	public CommandeClient findOne(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
}
