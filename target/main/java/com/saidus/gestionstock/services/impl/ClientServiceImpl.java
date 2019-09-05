package com.saidus.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.saidus.gestionstock.dao.IClientDao;
import com.saidus.gestionstock.entities.Client;
import com.saidus.gestionstock.services.IClientService;

@Transactional
public class ClientServiceImpl implements IClientService {

	private IClientDao dao;

	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	public Client getById(Long id) {
		return dao.getById(id);
	}

	public List<Client> selectAll() {
		return dao.selectAll();
	}

	public List<Client> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public Client save(Client entity) {
		return dao.save(entity);
	}

	public Client update(Client entity) {
		return dao.update(entity);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public Client findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public Client findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

	/*
	 * @Override public void savePhoto(Client client, MultipartFile file) {
	 * dao.savePhoto(client, file);
	 * 
	 * }
	 */

}
