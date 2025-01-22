package com.api.base;

import com.api.model.request.CreateBookingRequest;

import io.restassured.response.Response;

public class BookingService extends BaseService {
	private static final String PATH_URI = "booking/";
	private static final String PATH_URI2="/booking/{id}";

	public Response createBooking(CreateBookingRequest requestPayload) {
		return postRequest(requestPayload, PATH_URI);

	}

	public Response updateBooking(CreateBookingRequest requestPayload, String token, int id) {
		return putRequest(requestPayload, PATH_URI2, token,id);
	}

	public Response getBooking(int id) {
		return getRequest(PATH_URI2,id);
	}

}
