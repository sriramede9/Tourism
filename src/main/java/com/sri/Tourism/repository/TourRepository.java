package com.sri.Tourism.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.sri.Tourism.model.Tour;

public interface TourRepository extends CrudRepository<Tour, Integer> {
	List<Tour> findByTourPackageCode(@Param("code") String code);

	@Override
	@RestResource(exported = false)
	default void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	@RestResource(exported = false)
	default void delete(Tour entity) {
		// TODO Auto-generated method stub

	}

	@Override
	@RestResource(exported = false)

	default void deleteAll(Iterable<? extends Tour> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	@RestResource(exported = false)

	default void deleteAll() {
		// TODO Auto-generated method stub

	}

}
