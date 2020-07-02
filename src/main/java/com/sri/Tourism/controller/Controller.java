package com.sri.Tourism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sri.Tourism.model.Difficutlty;
import com.sri.Tourism.model.Region;
import com.sri.Tourism.model.Tour;
import com.sri.Tourism.service.TourPackageService;
import com.sri.Tourism.service.TourService;

@RestController
public class Controller {

	@Autowired
	private TourPackageService tourPackageService;

	@Autowired
	private TourService tourService;

	@GetMapping("/createTourPackages")
	public void createToursim() {
		tourPackageService.createTourPackage("BC", "Backpack Cal");
		tourPackageService.createTourPackage("CC", "California Calm");
		tourPackageService.createTourPackage("CH", "California Hot springs");
		tourPackageService.createTourPackage("CY", "Cycle California");
		tourPackageService.createTourPackage("DS", "From Desert to Sea");
		tourPackageService.createTourPackage("KC", "Kids California");
		tourPackageService.createTourPackage("NW", "Nature Watch");
		tourPackageService.createTourPackage("SC", "Snowboard Cali");
		tourPackageService.createTourPackage("TC", "Taste of California");
		System.out.println("Number of tours packages = " + tourPackageService.total());
	}

	@PostMapping("/createTour")
	public Tour createTour() {

		Tour createTour = tourService.createTour("title", "Description", "blurb", 12, "Duration", "bullets", "keywords",
				"Backpack Cal", Difficutlty.Medium, Region.Central_Coast);

//		System.out.println(Difficutlty.valueOf());

		return createTour;

	}

	@GetMapping("/all")
	public Iterable<Tour> getTourbyId() {
		return tourService.lookup();
	}
}
