package com.siddu.java.self;

public class PalindromeByDifferentMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// palindrome

		String str = "GADAG"; // GADAG, ILKAL
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}

		if (str.contentEquals(reverse)) {
			System.out.println("Palindrome");
		}

		else {
			System.out.println("Not a Palindrome");
		}

		// Two pointer approach
		int start = 0;
		int end = str.length() - 1;
		boolean palFlag = true;
		while (start <= end) {

			if (str.charAt(start) != str.charAt(end))
				palFlag = false;

			start++;
			end--;
		}

		if (palFlag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
