package com.saidus.gestionstock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.saidus.gestionstock.dao.IMvtStkDao;
import com.saidus.gestionstock.entities.MvtStk;
import com.saidus.gestionstock.services.IMvtStkService;

@Transactional
public class MvtStkServiceImpl implements IMvtStkService {

	private IMvtStkDao dao;

	public void setDao(IMvtStkDao dao) {
		this.dao = dao;
	}

	public MvtStk getById(Long id) {
		return dao.getById(id);
	}

	public List<MvtStk> selectAll() {
		return dao.selectAll();
	}

	public List<MvtStk> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	public MvtStk save(MvtStk entity) {
		return dao.save(entity);
	}

	public MvtStk update(MvtStk entity) {
		return dao.update(entity);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public MvtStk findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	public MvtStk findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
