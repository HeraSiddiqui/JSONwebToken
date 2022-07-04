package com.example.supportportal.domain;

import org.springframework.http.HttpStatus;

public class HttpResponse {
	private int HttpStatusCode; //200,201,400,500
	private HttpStatus httpStatus;
	private String reason;
	private String message;
	
	public HttpResponse() {}
	
	public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String message) {
		super();
		HttpStatusCode = httpStatusCode;
		this.httpStatus = httpStatus;
		this.reason = reason;
		this.message = message;
	}
	public int getHttpStatusCode() {
		return HttpStatusCode;
	}
	public void setHttpStatusCode(int httpStatusCode) {
		HttpStatusCode = httpStatusCode;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
