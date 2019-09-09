package com.saidus.gestionstock.dao.impl;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.saidus.gestionstock.dao.IUploadFileDao;
import com.saidus.gestionstock.entities.UploadFile;

@Repository
public class UploadFileDaoImpl implements IUploadFileDao {

	//@Autowired
	//private SessionFactory sessionFactory;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	

	public UploadFileDaoImpl() {
	}

	public UploadFileDaoImpl(EntityManager em) { //SessionFactory sessionFactory
		//this.sessionFactory = sessionFactory;
		this.entityManager = em;
	}

	@Override
	@Transactional
	public UploadFile saveUploadFile(UploadFile uploadFile) {
		// sessionFactory.getCurrentSession().save(uploadFile);
		entityManager.persist(uploadFile);
		return uploadFile;
	}
}