package com.picasso.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.picasso.persistence.entities.Car;

/**
 * Repository for Car entity
 */
@Repository
public interface CarRepositoryI extends JpaRepository<Car, Long> {

}
