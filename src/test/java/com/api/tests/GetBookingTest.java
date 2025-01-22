package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.BookingService;

import io.restassured.response.Response;

public class GetBookingTest {
	@Test(description = "Verify the Get Booking functionality API....")
	public void getBookingTest() {
		BookingService reqBooking = new BookingService();
		Response response = reqBooking.getBooking(1);
		System.out.println(response.asPrettyString());
	}

}
