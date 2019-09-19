package com.dev.arrays;

import com.dev.inheritance.*;

public class CreateArray extends GrandFather {
	
	static CreateArray c = new CreateArray();

	public static void main(String[] args) {
		int []intArr;
		char[] charr;					// Declaration
		byte byteArr[];

		intArr = new int[5];
		charr = new char[5];			// Creation
		byteArr = new byte[5];

		intArr[0] = 1;
		intArr[1] = 2;					// Initialization
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;

		charr[0] = 'A';
		charr[1] = 'B';
		charr[2] = 'C';
		charr[3] = 'D';
		charr[4] = 'E';

		byteArr[0] = 1;
		byteArr[1] = 2;
		byteArr[2] = 3;
		byteArr[3] = 4;
		byteArr[4] = 5;

		int res = intArr[1]*3;					// right way
		System.out.println(res);
		System.out.println(intArr[0]*3);
		System.out.println(intArr[1]+3);		// lazy way
		System.out.println(intArr[2]-3);
		System.out.println(intArr[3]/3);
		System.out.println(intArr[4]%3);

		System.out.println("--------------------------------------------");

		int[] arr = new int[5];			// Declaration and Creation


		int[] array = {11,22,33,44,55};			// Declaration, Creation, initialization 
		System.out.println(array[3]);			// since the elements are 5 maximum index is 4,and if we give index more than 4 it will throw ArrayIndexOutOfBound Exception
		
		System.out.println("The length of the array is : "+array.length);		// length will give the size of the array
		
		c.printName();// it is a protected method in GrandFather class in another package 
	}

}
