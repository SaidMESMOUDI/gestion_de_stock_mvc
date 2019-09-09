package com.saidus.gestionstock.services.impl;

import org.springframework.stereotype.Repository;

import com.saidus.gestionstock.dao.IUploadFileDao;
import com.saidus.gestionstock.entities.UploadFile;
import com.saidus.gestionstock.services.IUploadFileService;

@Repository
public class UploadFileServiceImpl implements IUploadFileService {

	private IUploadFileDao dao;

	public void setDao(IUploadFileDao dao) {
		this.dao = dao;
	}

	@Override
	public void saveUploadFile(UploadFile uploadFile) {
		dao.saveUploadFile(uploadFile);
	}

}