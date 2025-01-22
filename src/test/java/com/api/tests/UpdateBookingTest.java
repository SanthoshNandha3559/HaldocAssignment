package com.api.tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.base.BookingService;
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
		List<String> dates = new ArrayList<String>();
		dates.add("2025-01-25");
		dates.add("2025-01-27");
		BookingService reqBooking = new BookingService();
		response = reqBooking.updateBooking(
				new CreateBookingRequest("Santhosh", "Nandha", 123, true, dates, "Breakfast"), authresponse.getToken(),
				"1679");
		System.out.println(response.asPrettyString());
	}

}
