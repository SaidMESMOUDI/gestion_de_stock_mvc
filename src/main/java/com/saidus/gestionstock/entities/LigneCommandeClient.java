package com.saidus.gestionstock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="ligne_commande_client")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class LigneCommandeClient implements Serializable{
	@Id
	@GeneratedValue
	private Long idLigneCommaneClient;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private CommandeClient commandeClient;
	
}