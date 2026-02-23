package com.siddu.java.self;

public class ReverseStringRecursion {
	public static String reverseString(String str) {
		if (str == null || str.isEmpty() || str.length() == 1) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String originalString = "Recursive";
		String reversedString = reverseString(originalString);
		System.out.println("Original: " + originalString);
		System.out.println("Reversed: " + reversedString);
	}
}
