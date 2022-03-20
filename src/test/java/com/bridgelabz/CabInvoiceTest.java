package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		CabInvoice invoiceGenerator = new CabInvoice();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}

	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		CabInvoice invoiceGenerator = new CabInvoice();
		Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
		double fare = invoiceGenerator.calculateFare(rides);
		Assert.assertEquals(62.1, fare, 0.0);
	}
}
