package com.saidus.gestionstock.dao.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

import com.saidus.gestionstock.dao.IClientDao;
import com.saidus.gestionstock.entities.Client;

public class ClientDaoImpl extends GenericDaoImpl<Client> implements IClientDao{

	/*
	 * @Override public void savePhoto(Client client, MultipartFile file) {
	 * 
	 * byte[] byteArr = new byte[1024]; InputStream inputStream; try { byteArr =
	 * file.getBytes(); inputStream = new ByteArrayInputStream(byteArr);
	 * inputStream.read(byteArr); inputStream.close(); } catch (IOException e) {
	 * e.printStackTrace(); }
	 * 
	 * client.setPhoto(byteArr);
	 * 
	 * }
	 */
	
	
}
