package com.sk.in;

public class Question3 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 3, 2, 1, 4, 6, 3, 9, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j]);
				}
			}
		}

	}

}
