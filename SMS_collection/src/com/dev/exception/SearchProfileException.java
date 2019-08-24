package com.dev.exception;

public class SearchProfileException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Search profile operation Failed";
	}

}
