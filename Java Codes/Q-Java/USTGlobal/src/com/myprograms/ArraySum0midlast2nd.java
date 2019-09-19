package com.myprograms;

public class ArraySum0midlast2nd {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		String[] s = { "prak", "pali" };

		int mid = arr.length / 2;
		int sum = arr[0] + arr[mid] + arr[arr.length - 2];
		System.out.println("Sum : " + sum);
		System.out.println(s[0]);
		Addtion.main(s);
	}

	

}

final class Addtion {
	public static void main(String[] args) {
		System.out.println("Final Class");
		System.out.println("String : " + args);
	}
}