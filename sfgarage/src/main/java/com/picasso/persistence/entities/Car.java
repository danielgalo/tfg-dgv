package com.picasso.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity that represents a car in the database
 */
@Entity
@Table(name = "T_CAR")
public class Car {

	/** Car id */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** Car license plate */
	@Column(name = "license_plate", unique = true, nullable = false)
	private String licensePlate;

	/** Car brand */
	@Column(name = "brand", nullable = false)
	private String brand;

	/** Car model */
	@Column(name = "model")
	private String model;

	/** Car fuel type */
	@Column(name = "fuel_type")
	private String fuelType;

	/** Car transmissionType */
	@Column(name = "transmission_type")
	private String transmissionType;

	/** Car horsepower */
	@Column(name = "horsepower")
	private Integer horsePower;

	/** Car number of doors */
	@Column(name = "number_doors")
	private Integer numberDoors;

	/** Car mileage (kilometers) */
	@Column(name = "kilometers")
	private Integer kilometers;

	/** Car year */
	@Column(name = "year")
	private Integer year;

	/** Car number of seats */
	@Column(name = "seats")
	private Integer seats;

}
