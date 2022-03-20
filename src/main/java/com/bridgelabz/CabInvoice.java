package com.bridgelabz;

public class CabInvoice {
	private static final double MINIMUM_COST_PER_KM = 10.0;
	private static final int COST_PER_TIME = 1;
	private static final int MINIMUM_FARE = 5;

	/*
	 * @purpose: Calculate Fare Given distance and time, the invoice generator
	 * should return the total fare for the journey.
	 */
	public double calculateFare(double distance, double time) {
		double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
		if (totalFare < MINIMUM_FARE)
			return MINIMUM_FARE;
		else
			return totalFare;
	}

	/*
	 * @purpose: Multiple Rides The invoice generator should now take in multiple
	 * rides, and calculate the aggregate total for all.
	 */
	public double calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return totalFare;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Cab Invoice Generator...");
	}
}
