package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="categorie")
/* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class Categorie implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	
	private String code;
	private String designation;
	
	@OneToMany(mappedBy="categorie")
	private List<Article> articles;

	public Categorie() {
		super();
	}

	public Categorie(Long idCategorie, String code, String designation, List<Article> articles) {
		super();
		this.idCategorie = idCategorie;
		this.code = code;
		this.designation = designation;
		this.articles = articles;
	}

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", code=" + code + ", designation=" + designation
				+ ", articles=" + articles + "]";
	}  
		
	
}