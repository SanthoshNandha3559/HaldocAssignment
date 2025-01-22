package com.api.base;

import com.api.model.request.CreateBookingRequest;

import io.restassured.response.Response;

public class BookingService extends BaseService {
	private static final String PATH_URI = "booking/";

	public Response createBooking(CreateBookingRequest requestPayload) {
		return postRequest(requestPayload, PATH_URI);

	}

	public Response updateBooking(CreateBookingRequest requestPayload, String token, String id) {
		return putRequest(requestPayload, PATH_URI + id, token);
	}

	public Response getBooking(int id) {
		return getRequest(PATH_URI + ":" + id);
	}

}
