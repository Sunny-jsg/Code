package com.sk.in;

public class Question15 {
	public static void main(String[] args) {
		int[] arr = { 12, 2, 23, 45, 56, 1, 5, 7, 8, 4, 9, 6 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

}
