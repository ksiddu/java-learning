package com.siddu.arrays;

import java.util.Arrays;

public class Array2DCopyMethodOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// An iterative or brute force approach

		int[][] source = { { 1, 2, 3, 4 }, { 5, 6 }, { 0, 2, 42, -4, 5 } };

		int[][] destination = new int[source.length][];

		System.out.println("Singel 1D src array count: " + source.length);

		System.out.println("Singel 1D des array count: " + destination.length);

		// loop through all 1D array
		for (int i = 0; i < destination.length; i++) {

			// construct each 1D array in 2D array
			destination[i] = new int[source[i].length];

			for (int j = 0; j < destination[i].length; j++) {
				destination[i][j] = source[i][j];
			}

		}

		System.out.println(Arrays.deepToString(destination));

	}

}
