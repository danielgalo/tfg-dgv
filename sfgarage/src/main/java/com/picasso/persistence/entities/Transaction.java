package com.picasso.persistence.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity that represents a car related transaction (car sell or car buy)
 */
@Entity
@Table(name = "T_TRANSACTION")
public class Transaction {

	/** Transactions id */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** Transactions type (sell or buy) */
	@Column(name = "transaction_type")
	private String transactionType;

	/** Transactions price */
	@Column(name = "price")
	private Double price;

	/** Transactions date */
	@Column(name = "transaction_date")
	private Date transactionDate;

}
