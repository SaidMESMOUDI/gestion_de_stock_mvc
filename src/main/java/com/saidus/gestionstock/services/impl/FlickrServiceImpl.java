package com.saidus.gestionstock.services.impl;

import java.io.InputStream;

import com.saidus.gestionstock.dao.IFlickrDao;
import com.saidus.gestionstock.services.IFlickrService;

public class FlickrServiceImpl implements IFlickrService{

	private IFlickrDao dao;
	
	
	public void setDao(IFlickrDao dao) {
		this.dao = dao;
	}


	@Override
	public String savePhoto(InputStream photo, String title) throws Exception {
		return dao.savePhoto(photo, title);
	}

}
