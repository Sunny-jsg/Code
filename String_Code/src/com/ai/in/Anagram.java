package com.ai.in;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean areAnagram(String str1, String str2) {
		// Remove any whitespace and convert strings to lower case
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// If lengths of strings are not equal, they cannot be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert strings to char arrays
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		// Sort the char arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Compare the sorted char arrays
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST STRING::");
		String str1 = sc.next();
		System.out.println("ENTER SECOND STRING::");
		String str2 = sc.next();
		if (areAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}

}
