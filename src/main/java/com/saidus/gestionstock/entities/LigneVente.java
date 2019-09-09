package com.saidus.gestionstock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ligne_vente")
/* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class LigneVente implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneVente;

	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	@ManyToOne
	@JoinColumn(name = "idVente")
	private Vente vente;

	public LigneVente() {
		super();
	}

	public LigneVente(Long idLigneVente, Article article, Vente vente) {
		super();
		this.idLigneVente = idLigneVente;
		this.article = article;
		this.vente = vente;
	}

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	@Override
	public String toString() {
		return "LigneVente [idLigneVente=" + idLigneVente + ", article=" + article + ", vente=" + vente + "]";
	}

}