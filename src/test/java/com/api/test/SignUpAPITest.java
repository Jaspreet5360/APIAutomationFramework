package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class SignUpAPITest {

	@Test(description = "Verify if signUp functionality is working fine")

	public void createAccountTest() {

		SignUpRequest signUpRequest = new SignUpRequest.Builder().userName("Jass").password("Jass")
				.email("Jass@email.com").firstName("Jass").lastName("Singh").mobileNumber("1234567890").build();

		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequest);
		System.out.println(response.asPrettyString());

		// Assert.assertEquals(response.asPrettyString(), "User registered
		// successfully!");
	}

}
