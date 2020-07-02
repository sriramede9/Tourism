package com.sri.Tourism.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sri.Tourism.model.Tour;

public interface TourRepository extends CrudRepository<Tour, Integer> {
	List<Tour> findByTourPackageCode(String code);

}
