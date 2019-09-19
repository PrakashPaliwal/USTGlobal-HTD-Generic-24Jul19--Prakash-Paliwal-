package com.dev.search;

public class UnorderedLinearSearch {
	
	/* Linear Search has the Big-O notation as O(n) */
	
	static public boolean linearSearch (int[] a, int key) {			
		for(int i=0; i<a.length; i++) {
			if(a[i]==key) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {12, 21, 34, 10, 2, 5};
		boolean res = linearSearch(arr, 34);
		System.out.println("Result : "+res);
	}
	
	public static int[] createSortedArray(int size) {
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i*2;
		}
		return arr;
	}

}
