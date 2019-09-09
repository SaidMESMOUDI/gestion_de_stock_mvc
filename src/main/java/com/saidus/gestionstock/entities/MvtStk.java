package com.saidus.gestionstock.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "mouvement_stock")
/* @Data @AllArgsConstructor @NoArgsConstructor @ToString */
public class MvtStk implements Serializable {
	public static final int ENTREE = 1;
	public static final int SORTIE = 2;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMvtStk;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;

	private BigDecimal quantite;
	private int typeMvt;

	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	public MvtStk() {
		super();
	}

	public MvtStk(Long idMvtStk, Date dateMvt, BigDecimal quantite, int typeMvt, Article article) {
		super();
		this.idMvtStk = idMvtStk;
		this.dateMvt = dateMvt;
		this.quantite = quantite;
		this.typeMvt = typeMvt;
		this.article = article;
	}

	public Long getIdMvtStk() {
		return idMvtStk;
	}

	public void setIdMvtStk(Long idMvtStk) {
		this.idMvtStk = idMvtStk;
	}

	public Date getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public static int getEntree() {
		return ENTREE;
	}

	public static int getSortie() {
		return SORTIE;
	}

	@Override
	public String toString() {
		return "MvtStk [idMvtStk=" + idMvtStk + ", dateMvt=" + dateMvt + ", quantite=" + quantite + ", typeMvt="
				+ typeMvt + ", article=" + article + "]";
	}

}