package com.siddu.arrays;

import java.util.Arrays;

public class Array1DCopyMethodTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5 };

		int length = array.length;

		int[] destArray = new int[length];

		// System.arraycopy method
		System.arraycopy(array, 0, destArray, 0, length);

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(destArray));
		
		// reverse array
		
		int low = 0;
		int high = length - 1;
		
		while(low < high) {
			
			int temp = array[low];
			array[low] = array[high];
			array[high] = temp;
			low++;
			high--;
		}
		
		System.out.println("After reverse using low and high");
		
		System.out.println(Arrays.toString(array));
		
		for(int i = 0; i < length/2; i++) {
			
			int temp = destArray[i];
			destArray[i] = destArray[length - 1 - i];
			destArray[length - 1 - i] = temp;
			
		}
		
        System.out.println("After reverse using length - 1 - i");
		
		System.out.println(Arrays.toString(destArray));

	}

}
