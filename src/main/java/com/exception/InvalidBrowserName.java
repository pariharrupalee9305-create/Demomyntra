package com.exception;

public class InvalidBrowserName extends RuntimeException {
	private String broswername;
	
	public  InvalidBrowserName(String browsername){
		this.broswername=browsername;
	}
	
	public String getMessage() {
		System.out.println("Enter valid browserName......!");
		return broswername;
		
	}

}
