package com.dev.exception;

public class CustomException extends Exception {

	public CustomException() {
		System.out.println("Exception");
	}
	public CustomException(int a) {
		System.out.println("Integer Exception");
	}
	public CustomException(String a) {
		System.out.println("String Exception");
	}
}
