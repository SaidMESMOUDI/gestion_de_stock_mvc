package com.saidus.gestionstock.services;

import java.util.List;

import com.saidus.gestionstock.entities.Article;

public interface IArticleService {
	public Article getById(Long id);
	public List<Article> selectAll();
	public List<Article> selectAll(String sortField, String sort);
	public Article save(Article entity);
	public Article update(Article entity);
	public void remove(Long id);
	public Article findOne(String paramName, Object paramValue);
	public Article findOne(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
}
