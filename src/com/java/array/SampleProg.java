package com.java.array;

import java.util.*;

public class SampleProg {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();// Creating arraylist

		list.add("Ravi"); // Adding object in arraylist

		list.add("Vijay");

		list.add("Ravi");

		list.add("Ajay");

		list.add(1000);

		// Traversing list through Iterator
		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
