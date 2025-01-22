package com.api.base;

import java.util.HashMap;

import io.restassured.response.Response;

public class AuthenticationService extends BaseService {
	private static final String PATH_URI = "auth";

	public Response getToken() {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("username", "admin");
		data.put("password", "password123");
		return getToken(data, PATH_URI);
	}

}
