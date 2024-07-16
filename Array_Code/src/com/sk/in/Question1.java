package com.sk.in;

public class Question1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] anotherArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			anotherArray[i] = arr[i];
		}
		System.out.println("AnotherArray:");

		for (int i = 0; i < anotherArray.length; i++) {
			System.out.print(anotherArray[i] + " ");

		}

	}

}
