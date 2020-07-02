package com.sri.Tourism.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.Tourism.model.TourPackage;
import com.sri.Tourism.repository.TourPackageRespository;

@Service
public class TourPackageService {

	@Autowired
	private TourPackageRespository tourPackageRepository;

	public TourPackage createTourPackage(String code, String name) {

		TourPackage savedTourPackage = tourPackageRepository.save(new TourPackage(code, name));

		return savedTourPackage;
	}

	public Iterable<TourPackage> lookup() {
		return tourPackageRepository.findAll();
	}

	public long total() {
		return tourPackageRepository.count();
	}
}
