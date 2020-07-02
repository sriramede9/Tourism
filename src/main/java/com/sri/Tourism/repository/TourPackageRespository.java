package com.sri.Tourism.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sri.Tourism.model.TourPackage;

public interface TourPackageRespository extends CrudRepository<TourPackage, String> {
	TourPackage findByName(String name);
}
