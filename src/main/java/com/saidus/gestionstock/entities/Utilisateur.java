package com.saidus.gestionstock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="utilisateur")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue
	private Long idUtilisateur;
	
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private String mail;
	private String motDePasse;
	private String photo;
}