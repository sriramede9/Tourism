package com.sri.Tourism.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tour implements Serializable {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String title;

	private String description;

	private String blurb;

	private double price;

	private String duration;

	private String bullets;

	private String keywords;

	@ManyToOne
	private TourPackage tourPackage;

	@Column
	private Difficutlty difficulty;

	@Column
	private Region region;

	public Tour(String title, String description, String blurb, double price, String duration, String bullets,
			String keywords, TourPackage tourPackage, Difficutlty difficulty, Region region) {
		super();
		this.title = title;
		this.description = description;
		this.blurb = blurb;
		this.price = price;
		this.duration = duration;
		this.bullets = bullets;
		this.keywords = keywords;
		this.tourPackage = tourPackage;
		this.difficulty = difficulty;
		this.region = region;
	}
	
	

}
