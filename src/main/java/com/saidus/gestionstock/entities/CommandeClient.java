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
@Table(name="commande_client")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class CommandeClient implements Serializable{
	@Id
	@GeneratedValue
	private Long idCommandeClient;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande; 
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@OneToMany(mappedBy="commandeClient")
	private List<LigneCommandeClient> ligneCommandeClients;
	
}