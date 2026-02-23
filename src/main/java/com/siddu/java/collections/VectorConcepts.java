package com.siddu.java.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<String>();

		v.add("Richard");
		v.add("Kevin");
		v.add("Mark");
		v.add("Wilson");

		System.out.println("Vector Elements: " + v);

		for (String s : v) {
			System.out.println("Element: " + s);
		}
		
		for (int i = 0; i < v.size(); i++) {
			String element = v.get(i);
            System.out.println("Element at index " + i + ": " + element);
        }

		// Print the vector
		// Get all the vector elements into enumaeration
		Enumeration<String> e = v.elements();

		// Iterate until the last element
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		
		Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
	}

}
	