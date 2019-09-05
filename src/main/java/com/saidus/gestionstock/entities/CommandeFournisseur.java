package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="commande_fournisseur")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class CommandeFournisseur implements Serializable{
	@Id
	@GeneratedValue
	private Long idCommandeFournisseur;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande; 
	
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy="commandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}