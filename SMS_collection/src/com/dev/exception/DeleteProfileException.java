package com.dev.exception;

public class DeleteProfileException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Delete Profile Failed";
	}

}
