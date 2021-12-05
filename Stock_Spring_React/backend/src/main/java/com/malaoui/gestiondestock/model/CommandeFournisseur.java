package com.malaoui.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CommandeFournisseur extends AbstractEntity {

	@Id
	private Integer id;
}
