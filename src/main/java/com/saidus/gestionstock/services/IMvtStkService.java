package com.saidus.gestionstock.services;

import java.util.List;

import com.saidus.gestionstock.entities.MvtStk;

public interface IMvtStkService {
	public MvtStk getById(Long id);
	public List<MvtStk> selectAll();
	public List<MvtStk> selectAll(String sortField, String sort);
	public MvtStk save(MvtStk entity);
	public MvtStk update(MvtStk entity);
	public void remove(Long id);
	public MvtStk findOne(String paramName, Object paramValue);
	public MvtStk findOne(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
}
