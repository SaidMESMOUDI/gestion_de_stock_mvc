package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "client") /* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENT")
	private Long idClient;
	@Column(name="NOM_CLIENT", length=100, nullable=false)
	private String nom;
	@Column(name="PRENOM_CLIENT", length=100, nullable=false)
	private String prenom;
	@Column(name="ADRESSE_CLIENT", length=254, nullable=false)
	private String adresse;
	@Column(name="MAIL_CLIENT", length=100, nullable=false)
	private String mail;
	@Column(name="TEL_CLIENT", length=100, nullable=false)
	private String telephone;
	
	@Column(name="UPLOAD_FILES")
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private Set<UploadFile> uploadFiles = new HashSet<UploadFile>();

	public Client() {
		super();
	}

	public Client(Long idClient, String nom, String prenom, String adresse, String mail, String telephone,
			Set<UploadFile> uploadFiles) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.telephone = telephone;
		this.uploadFiles = uploadFiles;
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

	public Set<UploadFile> getUploadFiles() {
		return uploadFiles;
	}

	public void setUploadFiles(Set<UploadFile> uploadFiles) {
		this.uploadFiles = uploadFiles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result + ((uploadFiles == null) ? 0 : uploadFiles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (uploadFiles == null) {
			if (other.uploadFiles != null)
				return false;
		} else if (!uploadFiles.equals(other.uploadFiles))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", mail=" + mail + ", telephone=" + telephone + ", uploadFiles=" + uploadFiles + "]";
	}


}