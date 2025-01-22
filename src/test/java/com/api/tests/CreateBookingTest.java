package com.api.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.api.base.BookingService;
import com.api.model.request.CreateBookingRequest;

import io.restassured.response.Response;

public class CreateBookingTest {

	@Test(description = "Verify the create Booking functionality API....")
	public void createBookingTest() {
		List<String> dates = new ArrayList<String>();
		dates.add("2025-01-25");
		dates.add("2026-01-27");
		BookingService reqBooking = new BookingService();
		Response response = reqBooking
				.createBooking(new CreateBookingRequest("Jim", "Brown", 123, true, dates, "Breakfast"));
		System.out.println(response.asPrettyString());
	}

}
