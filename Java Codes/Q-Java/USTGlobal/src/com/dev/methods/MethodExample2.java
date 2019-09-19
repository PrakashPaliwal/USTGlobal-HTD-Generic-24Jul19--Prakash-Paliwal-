package com.dev.methods;

public class MethodExample2 {

	public static void main(String[] args) {
		
		MethodExample me = new MethodExample();				// Object of MethodExample class
		
		int area = MethodExample.squareArea(6);
		System.out.println("Area is :"+area);

		
		area = me.rectArea(5, 7);							// since the rectArea() is a non-static member we need an object to access it
		System.out.println("Area of rectangle is : "+area);
	}

}
