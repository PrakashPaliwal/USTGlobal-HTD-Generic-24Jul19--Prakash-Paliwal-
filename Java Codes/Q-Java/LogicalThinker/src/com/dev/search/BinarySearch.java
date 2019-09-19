package com.dev.search;

public class BinarySearch {

	/*
	 * The input array should be in sorted order ie., Increasing or Ascending order
	 * The method will return true or false depending on weather the value is
	 * present or not ie., if the key value is present the it returns true else if
	 * returns false
	 */
	static public boolean binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == key) { // mid position is being compared
				return true;
			}
			if (arr[mid] > key) {
				end = mid - 1; // mid-1 since the mid position is already being compared
			} else {
				start = mid + 1; // mid+1 since the mid position is already being compared
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 12, 21, 34, 44, 50, 59 }; // Ascending order array
		boolean res = binarySearch(arr, 5);
		System.out.println("Result : " + res);
		res = binarySearchRecursion(arr,0,arr.length,59);
		System.out.println("Recursion : "+res);
	}

	static public boolean binarySearchRecursion(int[] arr, int low, int high, int data) {
		int mid = low + (high-low)/ 2;
		if(low <= high) {
			if(arr[mid]==data) {
				return true;
			}else if(arr[mid]<data) {
				return binarySearchRecursion(arr,mid+1,low,data);
			}else {
				return binarySearchRecursion(arr,high,mid-1,data);
			}
		}
		return false;
	}
	
}
