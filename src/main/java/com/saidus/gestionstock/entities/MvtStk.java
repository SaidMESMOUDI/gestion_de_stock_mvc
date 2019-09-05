package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="mouvement_stock")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class MvtStk implements Serializable{
	public static final int ENTREE = 1;
	public static final int SORTIE = 2;
	
	@Id
	@GeneratedValue
	private Long idMvtStk;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	
	private BigDecimal quantite;
	private int typeMvt;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
}