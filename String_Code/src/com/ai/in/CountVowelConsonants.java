package com.ai.in;

import java.util.Scanner;

public class CountVowelConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = sc.next();
		count(str);
	}

	public static void count(String s) {
		int VowelCount = 0;
		int ConsonantsCount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				VowelCount++;
			} else if ((ch >= 'a' && ch <= 'z')) {
				ConsonantsCount++;
			}
		}
		System.out.println("Number of vowels: " + VowelCount);
		System.out.println("Number of consonants: " + ConsonantsCount);
	}
}
