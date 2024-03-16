package com.picasso.persistence.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity that represents a car related maintenance (maintenance, repair,
 * paintjob...)
 */
@Entity
@Table(name = "T_MAINTENANCE")
public class Maintenance {

	/** Maintenance id */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** Type of maintenance */
	@Column(name = "maintenance_type")
	private String maintenanceType;

	/** Description of the maintenance */
	@Column(name = "description")
	private String description;

	/** Type of maintenance */
	@Column(name = "maintenance_price")
	private Double maintenancePrice;

	/** Date of the maintenance */
	@Column(name = "maintenance_date")
	private Date maintenanceDate;

	/** Car to do the maintenance */

	/** Employee that does the maintenance */
}
