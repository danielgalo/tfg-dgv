/**
 * 
 */
package com.picasso.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity that represents a client in the database
 */
@Entity
@Table(name = "T_CLIENT")
public class Client extends Person {

	/** Client id */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Coches que compra

	// Coches que vende
}
