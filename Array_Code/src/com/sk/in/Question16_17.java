package com.sk.in;

public class Question16_17 {
	public static void main(String[] args) {
		int[] arr = { 23, 74, 84, 93, 5, 65, 8, 56, 12, 67 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		System.out.println("Third highest:: " + arr[2]);
		System.out.println("Second highest:: " + arr[1]);
	}

}
