package com.malaoui.gestiondestock.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;
	
	@CreatedDate
	@Column(name="creationDate",nullable = false)
	@JsonIgnore
	private Instant createDate;
	
	@LastModifiedDate
	@Column(name="lasteModifiedDate")
	@JsonIgnore
	private Instant lastModifiedDate;
	
}
