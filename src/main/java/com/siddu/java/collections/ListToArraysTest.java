package com.siddu.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		// 1st method: using toArray(T[] a]

		Integer[] array1 = list1.toArray(Integer[]::new);
		System.out.println("array1 : " + Arrays.toString(array1));

		// 2nd method: using toArray(T[] a] and the stream()

		List<Integer> list2 = new ArrayList<Integer>();

		list2.add(60);
		list2.add(70);
		list2.add(80);
		list2.add(90);
		list2.add(100);

		Integer[] array2 = list2.stream().toArray(Integer[]::new);
		System.out.println("array2 : " + Arrays.toString(array2));

		// 3rd method: using toArray(T[] a] and temp array

		List<Integer> list3 = new ArrayList<Integer>();

		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);

		Integer[] newArray = new Integer[list3.size()];
		list3.toArray(newArray);

		System.out.println("array3 : " + Arrays.toString(newArray));

		// 4th method: using stream().mapToInt(i -> i).toArray(); primitive array

		List<Integer> list4 = new ArrayList<Integer>();

		list4.add(11);
		list4.add(22);
		list4.add(33);
		list4.add(44);
		list4.add(55);

		int[] primitiveArray = list4.stream().mapToInt(i -> i).toArray();

		System.out.println("array4 : " + Arrays.toString(primitiveArray));

	}

}

// ref: https://www.geeksforgeeks.org/java/arraylist-array-conversion-java-toarray-methods/
