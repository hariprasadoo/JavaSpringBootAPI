package com.hari.rest.webservices.restfulwebservices.helloworld;

public class HelloWroldHari {
	

    private String message;

	public HelloWroldHari(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWroldHari [message=" + message + "]";
	}
	

}
