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
@Table(name="fournisseur")
/* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class Fournisseur implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFournisseur;
	
	private String nom;
	private String prenom;
	private String adresse;
	private String mail;
	private String telephone;
	
	@OneToMany(mappedBy="fournisseur")
	private List<CommandeFournisseur> commandeFournisseurs;

	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fournisseur(Long idFournisseur, String nom, String prenom, String adresse, String mail, String telephone,
			List<CommandeFournisseur> commandeFournisseurs) {
		super();
		this.idFournisseur = idFournisseur;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.telephone = telephone;
		this.commandeFournisseurs = commandeFournisseurs;
	}

	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<CommandeFournisseur> getCommandeFournisseurs() {
		return commandeFournisseurs;
	}

	public void setCommandeFournisseurs(List<CommandeFournisseur> commandeFournisseurs) {
		this.commandeFournisseurs = commandeFournisseurs;
	}

	@Override
	public String toString() {
		return "Fournisseur [idFournisseur=" + idFournisseur + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", mail=" + mail + ", telephone=" + telephone + ", commandeFournisseurs="
				+ commandeFournisseurs + "]";
	}
	
	
}