package com.siddu.java.self;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArraysTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1D Array initialization

		int[] intArray1 = { 10, 20, 30, 40, 50 };

		int[] intArray2 = new int[5];
		intArray2[0] = 60;
		intArray2[1] = 70;
		intArray2[2] = 80;
		intArray2[3] = 90;
		intArray2[4] = 100;

		int[] intArray3 = { 500, 100, 300, 250, 200 };

		int[] intArray4 = { 1000, 300, 1100, 500, 900 };

		int[] intArray5 = { 2000, 44, 66, 879, 146 };

		System.out.println("Array Elements are : " + Arrays.toString(intArray1));
		System.out.println("Array Elements are : " + Arrays.toString(intArray2));

		System.out.println("Accessing elements in different ways: for loop with index");
		for (int i = 0; i < intArray1.length; i++) {
			System.out.println(intArray1[i]);
		}

		System.out.println("Accessing elements in different ways: for each loop");
		for (int j : intArray2) {
			System.out.println(j);
		}

		// 2D Array initialization

		int[][] twoDArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		System.out.println("No. of 1D Array: " + twoDArray.length);
		System.out.println("No. of 1D Array Elements: " + twoDArray[0].length);

		System.out.println("Array Elements are : " + Arrays.deepToString(twoDArray));

		Arrays.sort(intArray3);
		System.out.println("Sorted Array Elements are : " + Arrays.toString(intArray3));

		// ascending order using streams

		int[] numbers1 = IntStream.of(intArray4).boxed().sorted().mapToInt(i -> i).toArray();
		System.out.println("Sorted Array Elements in ascending order : " + Arrays.toString(numbers1));

		// descending order using streams

		int[] numbers2 = IntStream.of(intArray4).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
		System.out.println("Sorted Array Elements in descending order : " + Arrays.toString(numbers2));

		// Reverse the array
		Arrays.sort(intArray5);
		for (int i = 0; i < intArray5.length / 2; i++) {
			int temp = intArray5[i];
			intArray5[i] = intArray5[intArray5.length - 1 - i];
			intArray5[intArray5.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(intArray5)); // Outp

		// 6 : i ; i < 6/2 ; i < 3: 0,1,2
		// 5: i < 5/2; i < 2: 0, 1

		int[] orgArray = { 289, 23, 100, 7, 4 };

		int left = 0;
		int right = orgArray.length - 1;
		
		// Reverse the array
		Arrays.sort(orgArray);

		System.out.println(Arrays.toString(orgArray));
		
		//Thread.sleep(2000);

		while (left < right) {
			int temp = orgArray[left];
			orgArray[left] = orgArray[right];
			orgArray[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(orgArray));

	}

}
