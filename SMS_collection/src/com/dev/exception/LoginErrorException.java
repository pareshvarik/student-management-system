package com.dev.exception;

public class LoginErrorException extends RuntimeException
{
	@Override
	public String getMessage() {
		return "Login Unsucessfull due to mismatch in the password or id";
	}


}
