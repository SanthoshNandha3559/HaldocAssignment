package com.api.tests;


import org.testng.annotations.Test;

import com.api.base.BookingService;
import com.api.model.request.BookingDates;
import com.api.model.request.CreateBookingRequest;

import io.restassured.response.Response;

public class CreateBookingTest {

	@Test(description = "Verify the create Booking functionality API....")
	public void createBookingTest() {
		BookingDates bookingDates = new BookingDates();
		bookingDates.setCheckin("2018-01-01");
		bookingDates.setCheckout("2019-01-01");
		BookingService reqBooking = new BookingService();
		Response response = reqBooking
				.createBooking(new CreateBookingRequest("Jim", "Brown", 123, true, bookingDates, "Breakfast"));
		System.out.println(response.asPrettyString());
	}

}
