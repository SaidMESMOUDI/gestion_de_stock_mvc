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
@Table(name="categorie")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Categorie implements Serializable{
	@Id
	@GeneratedValue
	private Long idCategorie;
	
	private String code;
	private String designation;
	
	@OneToMany(mappedBy="categorie")
	private List<Article> articles;  
	
	
}
