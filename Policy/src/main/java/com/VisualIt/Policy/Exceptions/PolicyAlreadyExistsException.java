package com.VisualIt.Policy.Exceptions;

import org.springframework.http.HttpStatus;

public class PolicyAlreadyExistsException extends RuntimeException {

	private HttpStatus status;
	private String message;

	public PolicyAlreadyExistsException(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	
	public PolicyAlreadyExistsException() {
		super();
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
