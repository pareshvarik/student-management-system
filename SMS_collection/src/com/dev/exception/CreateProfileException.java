package com.dev.exception;

public class CreateProfileException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Profile Creation Failed";
	}

}
