package com.api.base;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	RequestSpecification requestSpecification;
	private static final String BASE_URI = "https://restful-booker.herokuapp.com/";

	public BaseService() {
		requestSpecification = given().baseUri(BASE_URI);
	}

	public Response getToken(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).headers("Content-Type", "application/json")
				.body(payload).post(endpoint);
	}

	public Response postRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).header("Content-Type", "application/json")
				.header("Accept", "application/json").body(payload).post(endpoint);
	}

	public Response putRequest(Object payload, String endpoint, String token) {
		return requestSpecification.contentType(ContentType.JSON).header("Content-Type", "application/json")
				.header("Cookie", "token=" + token).header("Accept", "application/json").body(payload).put(endpoint);
	}

	public Response getRequest(String endpoint) {
		return requestSpecification.get(endpoint);
	}
}
