package model;
/**************************************************************
* Name        : Week 4 Assessment - Servlets/JSP
* Author      : Luis Cabral
* Created     : 09/24/2020
* Course      : CIS 175 Java 2
* Version     : 1.0
* Description : This class contains the logic that converts the users input
* 				into gallons or liters.
***************************************************************/
public class GallonConversion {
	private double gallons;
	private double liters;
	
	/**
	 * Default no argument constructor.
	 */
	public GallonConversion() {
		
	}
	
	/**
	 * Constructor with an int argument for gallons.
	 * @param gallons - Amount of gallons that will be converted to liters.
	 */
	public GallonConversion(int gallons) {
		super();
		this.gallons = gallons;
		convertToLiters(gallons);
	}
	
	/**
	 * Constructor with a double argument for liters.
	 * @param liters - liters to be converted to gallons.
	 */
	public GallonConversion(double liters) {
		super();
		this.liters = liters;
		convertToGallons(liters);
	}

	/**
	 * @return the gallons
	 */
	public double getGallons() {
		return gallons;
	}

	/**
	 * @param gallons the gallons to set
	 */
	public void setGallons(double gallons) {
		this.gallons = gallons;
		convertToLiters(gallons);
	}

	/**
	 * @return the liters
	 */
	public double getLiters() {
		return liters;
	}

	/**
	 * @param liters the liters to set
	 */
	public void setLiters(double liters) {
		this.liters = liters;
		convertToGallons(liters);
	}

	/**
	 * Takes in a double argument representing liters and converts it to gallons.
	 * @param liters2 - amount of liters to convert
	 */
	private void convertToGallons(double liters2) {
		this.gallons = liters2 * 0.26417205236;
	}
	
	/**
	 * Takes in a double argument of gallons to convert to liters.
	 * @param gallons2 - Amount of gallons to convert.
	 */
	private void convertToLiters(double gallons2) {
		this.liters = gallons2 * 3.78541;
	}
	
	/**
	 * Prints the amount of gallons in the given liters.
	 * @return String holding the amount of gallons in given liters.
	 */
	public String gallonsToString() {
		return liters + " liters is " + gallons + " gallons";
	}
	
	/**
	 * Prints the amount of liters in gallons.
	 * @return String holding the amount of liters in gallons.
	 */
	public String litersToString() {
		return gallons + " gallon is " + liters + " liters";
	}
}
