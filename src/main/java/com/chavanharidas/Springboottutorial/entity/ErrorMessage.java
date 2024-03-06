package com.chavanharidas.Springboottutorial.entity;

import org.springframework.http.HttpStatus;

import lombok.Builder;
@Builder
public class ErrorMessage {
	private HttpStatus status;
	private String message;

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

	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public ErrorMessage() {
		super();
	}

	@Override
	public String toString() {
		return "ErrorMessage [message=" + message + "]";
	}

}
