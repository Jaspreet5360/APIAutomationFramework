package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgetPassword {

	@Test(description = "Verify if forgot password functionality is working fine")
	public void forgotPasswrodTest() {

		AuthService authService = new AuthService();
		Response response = authService.forgetPassword("jass@gmail.com");

		System.out.println(response.asPrettyString());

	}

}
