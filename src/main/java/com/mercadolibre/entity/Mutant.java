package com.mercadolibre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MUTANT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mutant {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="dna")
	private String firstName;
	
	@Column(name="mutant")
	private boolean isMutant;
	
	
}
