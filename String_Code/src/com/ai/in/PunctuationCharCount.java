package com.ai.in;

import java.util.Scanner;

public class PunctuationCharCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = sc.next();
		int count = countPunctuationChar(str);
		System.out.println("Total punctuation characters: " + count);
	}

	public static int countPunctuationChar(String s) {
		int count = 0;
		String str = ".,;:!?\"'()-[]{}<>/"; 
		for (int i = 0; i < s.length(); i++) {
			if (str.indexOf(s.charAt(i)) != -1) {
				count++;
			}
		}
		return count;
	}
}
