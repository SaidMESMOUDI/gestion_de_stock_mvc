package com.saidus.gestionstock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
/* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class LigneCommandeClient implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLigneCommaneClient;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private CommandeClient commandeClient;

	public LigneCommandeClient() {
		super();
	}

	public LigneCommandeClient(Long idLigneCommaneClient, Article article, CommandeClient commandeClient) {
		super();
		this.idLigneCommaneClient = idLigneCommaneClient;
		this.article = article;
		this.commandeClient = commandeClient;
	}

	public Long getIdLigneCommaneClient() {
		return idLigneCommaneClient;
	}

	public void setIdLigneCommaneClient(Long idLigneCommaneClient) {
		this.idLigneCommaneClient = idLigneCommaneClient;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	@Override
	public String toString() {
		return "LigneCommandeClient [idLigneCommaneClient=" + idLigneCommaneClient + ", article=" + article
				+ ", commandeClient=" + commandeClient + "]";
	}
	
	
}