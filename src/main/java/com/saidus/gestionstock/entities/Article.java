package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name="article")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Article implements Serializable{
	@Id
	@GeneratedValue
	private Long idArticle;
	
	private String codeArticle;
	private String designation;
	private BigDecimal prixUnitaireHT;
	private BigDecimal tauxTVA;
	private BigDecimal prixUnitaireTTC;
	private String photo;
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	
}
