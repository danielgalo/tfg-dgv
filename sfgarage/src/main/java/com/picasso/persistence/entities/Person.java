package com.picasso.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * Abstract class that represents a person with common attributes like name,
 * DNI, and surnames
 */
@MappedSuperclass
public abstract class Person {

	/** Person DNI */
	@Column(name = "dni", unique = true, nullable = false)
	private String dni;

	/** Person name */
	@Column(name = "name")
	private String name;

	/** Person surnames */
	@Column(name = "surnames")
	private String surnames;

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surnames
	 */
	public String getSurnames() {
		return surnames;
	}

	/**
	 * @param surnames the surnames to set
	 */
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

}
