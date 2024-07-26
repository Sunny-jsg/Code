package com.ai.in;

import java.util.Scanner;

public class DivideString {
	public static void divideString(String str, int n) {
		int strLength = str.length();
		int partSize = strLength / n;

		// Check if the string can be divided into n equal parts
		if (strLength % n != 0) {
			System.out.println("The string cannot be divided into " + n + " equal parts.");
			return;
		}

		for (int i = 0; i < strLength; i += partSize) {
			String part = str.substring(i, i + partSize);
			System.out.println(part);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STRING::");
		String str1 = sc.next();
		System.out.println("ENTER n VALUE::");
		int n = sc.nextInt();
		divideString(str1, n);
	}

}
