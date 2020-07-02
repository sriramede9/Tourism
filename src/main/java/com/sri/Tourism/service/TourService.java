package com.sri.Tourism.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.Tourism.model.Difficutlty;
import com.sri.Tourism.model.Region;
import com.sri.Tourism.model.Tour;
import com.sri.Tourism.model.TourPackage;
import com.sri.Tourism.repository.TourPackageRespository;
import com.sri.Tourism.repository.TourRepository;

@Service
public class TourService {

	@Autowired
	private TourPackageRespository tourPackageRepository;

	@Autowired
	private TourRepository tourRepository;

	public Tour createTour(String title, String description, String blurb, Integer price, String duration,
			String bullets, String keywords, String tourPackageCode, Difficutlty difficulty, Region region) {
		
		TourPackage tourPackage = tourPackageRepository.findByName(tourPackageCode);
		if (tourPackage == null) {
			throw new RuntimeException("Tour package does not exist: " + tourPackageCode);
		}
		Tour tour = new Tour(title, description, blurb, price, duration, bullets, keywords, tourPackage, difficulty,
				region);
		return tourRepository.save(tour);
	}

	public Iterable<Tour> lookup() {
		return tourRepository.findAll();
	}

	public long total() {
		return tourRepository.count();
	}
}
