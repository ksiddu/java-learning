package com.siddu.java.self;

import java.util.Arrays;

public class ReverseANumberUsingStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		char[] str = String.valueOf(1234).toCharArray();
		//String new
		
		for(char c: String.valueOf(1234).toCharArray()) {
			
		}
		
		for(int i = 0; i < str.length/2;  i++) {
			
			char temp = str[str.length - 1 - i];
			
			str[str.length - 1 - i] = str[i];
			
			str[i] = temp;
				
			
		}
		System.out.println("Sorted array: " + Arrays.toString(str));

	}

}
