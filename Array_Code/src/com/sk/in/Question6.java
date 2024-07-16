package com.sk.in;

public class Question6 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 6, 9, 5, 8 };
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

}
