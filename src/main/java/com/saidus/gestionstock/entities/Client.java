package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="client")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Client implements Serializable{
	@Id
	@GeneratedValue
	private Long idClient;
	
	private String nom;
	private String prenom;
	private String adresse;
	private String mail;
	private String telephone;
	
	@OneToMany(mappedBy="client")
	private List<CommandeClient> commandeClients;
}
