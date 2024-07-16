package com.sk.in;

public class Question10 {
	public static void main(String[] args) {
		int[] arr = { 23, 74, 84, 93, 5, 65, 8, 56, 12, 67 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);

	}

}
