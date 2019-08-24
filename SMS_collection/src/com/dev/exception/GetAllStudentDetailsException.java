package com.dev.exception;

public class GetAllStudentDetailsException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Get all student operation Failed, since there are no data is present in the database";
	}
}
