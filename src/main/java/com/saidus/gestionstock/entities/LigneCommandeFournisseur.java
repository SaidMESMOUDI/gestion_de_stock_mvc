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
@Table(name="ligne_commande_fournisseur")
/* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class LigneCommandeFournisseur implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneCommandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;

	public LigneCommandeFournisseur() {
		super();
	}

	public LigneCommandeFournisseur(Long idLigneCommandeFournisseur, Article article,
			CommandeFournisseur commandeFournisseur) {
		super();
		this.idLigneCommandeFournisseur = idLigneCommandeFournisseur;
		this.article = article;
		this.commandeFournisseur = commandeFournisseur;
	}

	public Long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}

	public void setIdLigneCommandeFournisseur(Long idLigneCommandeFournisseur) {
		this.idLigneCommandeFournisseur = idLigneCommandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	@Override
	public String toString() {
		return "LigneCommandeFournisseur [idLigneCommandeFournisseur=" + idLigneCommandeFournisseur + ", article="
				+ article + ", commandeFournisseur=" + commandeFournisseur + "]";
	}
	
	
}