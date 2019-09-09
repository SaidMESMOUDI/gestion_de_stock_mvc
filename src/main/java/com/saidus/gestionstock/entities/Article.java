package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "article")
/* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class Article implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArticle;

	private String codeArticle;
	private String designation;
	private BigDecimal prixUnitaireHT;
	private BigDecimal tauxTVA;
	private BigDecimal prixUnitaireTTC;
	private String photo;
	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie categorie;
	
	public Article() {
		super();
	}
	
	public Article(Long idArticle, String codeArticle, String designation, BigDecimal prixUnitaireHT,
			BigDecimal tauxTVA, BigDecimal prixUnitaireTTC, String photo, Categorie categorie) {
		super();
		this.idArticle = idArticle;
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prixUnitaireHT = prixUnitaireHT;
		this.tauxTVA = tauxTVA;
		this.prixUnitaireTTC = prixUnitaireTTC;
		this.photo = photo;
		this.categorie = categorie;
	}
	public Long getIdArticle() {
		return idArticle;
	}
	
	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}
	public String getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}
	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}
	public BigDecimal getTauxTVA() {
		return tauxTVA;
	}
	public void setTauxTVA(BigDecimal tauxTVA) {
		this.tauxTVA = tauxTVA;
	}
	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}
	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", codeArticle=" + codeArticle + ", designation=" + designation
				+ ", prixUnitaireHT=" + prixUnitaireHT + ", tauxTVA=" + tauxTVA + ", prixUnitaireTTC=" + prixUnitaireTTC
				+ ", photo=" + photo + ", categorie=" + categorie + "]";
	}
	
	

}