package com.dev.methods;

public class MethodExample {
	

	static MethodExample me = new MethodExample();				// Objects creation of MethodExample class
	
	static int j = 0;										// static variable
	int v = 20 ;
	
	public static void main(String[] args) {

		
		j = squareArea(6);									
		System.out.println(" the area of the square is : "+j);
		
		int area1 = me.rectArea(5, 7);									// Accessing the non-static method using the created object
		System.out.println("Area of Rectangle of 5 x 7 is : "+area1);

		System.out.println(me.v); 										// we need an object to access non-static variables
	}

	public static int squareArea(int side) {
		int area = side*side;
		int n = me.rectArea(4,7);
		System.out.println("Area of rectangle is : "+n);
		return area;
	}
	public int rectArea(int a, int b) {				// Public 
		int area = a*b;
		return area;
	}
	
	protected int rectArea1(int a, int b) {			//Protected
		int area = a*b;
		return area;
	}
	
	int rectArea2(int a, int b) {					//Default
		int area = a*b;
		return area;
	}
	
}
