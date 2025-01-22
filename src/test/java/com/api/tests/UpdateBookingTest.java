package com.api.tests;


import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.base.BookingService;
import com.api.model.request.BookingDates;
import com.api.model.request.CreateBookingRequest;
import com.api.model.response.AuthResponse;

import io.restassured.response.Response;

public class UpdateBookingTest {
	@Test(description = "Verify the update Booking functionality API....")
	public void updateBookingTest() {
		AuthenticationService authService = new AuthenticationService();
		Response response = authService.getToken();
		AuthResponse authresponse = response.as(AuthResponse.class);
		System.out.println(authresponse.getToken());
		BookingDates bookingDates = new BookingDates();
		bookingDates.setCheckin("2018-01-01");
		bookingDates.setCheckout("2019-01-07");
		BookingService reqBooking = new BookingService();
		response = reqBooking.updateBooking(
				new CreateBookingRequest("Santhu", "Nandha", 123, true, bookingDates, "Breakfast"),
				authresponse.getToken(), 1116);
		System.out.println(response.asPrettyString());
	}

}
