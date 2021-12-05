package com.malaoui.gestiondestock.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Article extends AbstractEntity {
	
	@Id
	private Integer id;
	
	@Column(name="codearticle")
	private String codeArticle;
	 
	@Column(name="designation")
	private String designtion;
	
	@Column(name="prixunitaireht")
	private BigDecimal prixUnitaireHt;
	
	@Column(name="tauxtva")
	private BigDecimal tauxTva;
	
	@Column(name="prixunitairettc")
	private BigDecimal prixUnitaireTtc;
	
	@Column(name="photo")
	private String photo;
	
}
