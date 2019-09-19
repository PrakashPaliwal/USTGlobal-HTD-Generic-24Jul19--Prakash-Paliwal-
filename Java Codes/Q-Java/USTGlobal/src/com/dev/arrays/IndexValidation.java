package com.dev.arrays;

public class IndexValidation {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		int index = 3;
		if(index>arr.length) {
			System.out.println("The index is not valid");
		}
		else {
			System.out.println("The index is valid");
			for(int i=0;i<=index;i++) {
				System.out.println(arr[i]);
			}
		}
		int mid = (arr.length-1)/2;
		System.out.println("mid element is : "+arr[mid]);

	}

}
