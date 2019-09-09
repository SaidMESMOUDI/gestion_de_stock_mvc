package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name="commande_fournisseur")
/* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class CommandeFournisseur implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommandeFournisseur;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande; 
	
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy="commandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

	public CommandeFournisseur() {
		super();
	}

	public CommandeFournisseur(Long idCommandeFournisseur, String code, Date dateCommande, Fournisseur fournisseur,
			List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		super();
		this.idCommandeFournisseur = idCommandeFournisseur;
		this.code = code;
		this.dateCommande = dateCommande;
		this.fournisseur = fournisseur;
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}

	public Long getIdCommandeFournisseur() {
		return idCommandeFournisseur;
	}

	public void setIdCommandeFournisseur(Long idCommandeFournisseur) {
		this.idCommandeFournisseur = idCommandeFournisseur;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}

	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}

	@Override
	public String toString() {
		return "CommandeFournisseur [idCommandeFournisseur=" + idCommandeFournisseur + ", code=" + code
				+ ", dateCommande=" + dateCommande + ", fournisseur=" + fournisseur + ", ligneCommandeFournisseurs="
				+ ligneCommandeFournisseurs + "]";
	}
	
	
}