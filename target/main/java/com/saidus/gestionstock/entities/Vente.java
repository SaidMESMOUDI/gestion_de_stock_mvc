package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "vente")
/* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class Vente implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVente;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente;

	@OneToMany(mappedBy = "vente")
	private List<LigneVente> ligneVentes;

	public Vente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vente(Long idVente, String code, Date dateVente, List<LigneVente> ligneVentes) {
		super();
		this.idVente = idVente;
		this.code = code;
		this.dateVente = dateVente;
		this.ligneVentes = ligneVentes;
	}

	public Long getIdVente() {
		return idVente;
	}

	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}

	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}

	@Override
	public String toString() {
		return "Vente [idVente=" + idVente + ", code=" + code + ", dateVente=" + dateVente + ", ligneVentes="
				+ ligneVentes + "]";
	}

}