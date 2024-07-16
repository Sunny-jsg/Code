package com.sk.in;

public class Question9 {
	public static void main(String[] args) {
		int[] arr = { 23, 74, 84, 93, 25, 65, 34, 56, 89, 67 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println(max);
	}

}
