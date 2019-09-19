package com.dev.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		//		s();
		//		System.out.println("Code after Exception");
		try {
			s();
			System.out.println("No Exception for s()");
			int res = divide(10, 0);
			System.out.println("No Exception for divede()");
		} catch (NegativeArraySizeException e) {
			System.err.println("Exception Caught in catch block");
			System.err.println("getMessage() : "+e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("Exception augth in catch block");
			System.err.println("getMessage() : "+e.getMessage());
		}
		finally {
			System.err.println("Finally in red sop with err");			// using err we can print the messages in red color on output console
			System.out.println("Finally block sop with out");
		}

	}

	public static int divide(int i, int j) {
		int res = i/j;
		System.out.println("Result : "+res);
		return 1;
	}



	public static void s() {
		StringBuffer sb = new StringBuffer(1);
	}
}
