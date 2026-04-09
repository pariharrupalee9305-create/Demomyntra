package com.exception;

public class InvalidLocatorType extends RuntimeException {
	private String locatorType;
	public InvalidLocatorType(String locatortype) {
		this.locatorType=locatortype;
	}
	@Override
	public String getMessage() {
		System.out.println("Invalid locator Type....!");
		return locatorType;
	}
}
