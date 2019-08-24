package com.dev.exception;

public class UpdateEmailException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Email updation Failed";
	}

}
