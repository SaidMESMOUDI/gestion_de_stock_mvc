package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.sql.Blob;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="client")
/* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class Client implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String mail;
	private String telephone;
	
	@Lob
	private Blob photo;
	/*
	 * @Lob
	 * @Basic(fetch = FetchType.LAZY) private byte[] photo;
	 */
	
	//private String photo;
	
	@OneToMany(mappedBy="client")
	private List<CommandeClient> commandeClients;
	
	public Client() {
		super();
	}

	public Client(Long idClient, String nom, String prenom, String adresse, String mail, String telephone, Blob photo,
			List<CommandeClient> commandeClients) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.telephone = telephone;
		this.photo = photo;
		this.commandeClients = commandeClients;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public List<CommandeClient> getCommandeClients() {
		return commandeClients;
	}

	public void setCommandeClients(List<CommandeClient> commandeClients) {
		this.commandeClients = commandeClients;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", mail=" + mail + ", telephone=" + telephone + ", photo=" + photo + ", commandeClients="
				+ commandeClients + "]";
	}

		
}
