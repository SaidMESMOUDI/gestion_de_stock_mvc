package com.saidus.gestionstock.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.saidus.gestionstock.entities.Client;

public interface IClientService {
	public Client getById(Long id);
	public List<Client> selectAll();
	public List<Client> selectAll(String sortField, String sort);
	public Client save(Client entity);
	public Client update(Client entity);
	public void remove(Long id);
	public Client findOne(String paramName, Object paramValue);
	public Client findOne(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
	
	
	/* public void savePhoto(Client client, MultipartFile file); */
}
