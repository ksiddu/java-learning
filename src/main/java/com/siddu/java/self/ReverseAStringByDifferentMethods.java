package com.siddu.java.self;

public class ReverseAStringByDifferentMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String str = "Singapore";

		// 1: using reverse method of StringBuilder class

		String str = "Siddu";

		StringBuilder sb = new StringBuilder(str);
		String reversedString = sb.reverse().toString();

		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversedString);

		// 2: using StringBuilder append method
		StringBuilder sb1 = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb1.append(str.charAt(i));
		}

		String reversedString1 = sb1.toString();

		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversedString1);

		// 3: using String concat append method
		String reversedString2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString2 += str.charAt(i);
		}

		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversedString2);

		// 4: using charArray traversing from end to start

		char[] charArray = str.toCharArray();

		int length = charArray.length;

		char[] revArray = new char[charArray.length];

		for (int i = 0, j = length - 1; i < length && j >= 0; i++, j--) {

			revArray[i] = charArray[j];
		}

		String reversedString3 = new String(revArray);

		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversedString3);

		// 5: swapping characters from both ends, then converting the array back to a
		// string

		String originalString = "Java Programming";
		char[] charArray1 = originalString.toCharArray();
		int left = 0;
		int right = charArray1.length - 1;

		while (left < right) {
			char temp = charArray1[left];
			charArray1[left] = charArray1[right];
			charArray1[right] = temp;
			left++;
			right--;
		}

		String reversedString4 = new String(charArray1);
		System.out.println("Original: " + originalString);
		System.out.println("Reversed: " + reversedString4);
		
		//6: using getBytes
		
		String s = "Geeks";

        // getBytes() method to convert string
        // into bytes[].
        byte[] arr = s.getBytes();

        byte[] res = new byte[arr.length];

        // Store result in reverse order into the
        // res byte[]
        for (int i = 0; i < arr.length; i++)
            res[i] = arr[arr.length - i - 1];

        System.out.println(new String(res));

	}

}
