package com.java.array;

import java.util.*;

public class SortedSetPrg {

	public static void main(String[] args) {

		TreeSet<String> obj = new TreeSet<>();

		obj.add("siva");

		obj.add("Raj");

		obj.add("Guru");

		obj.add("Janu");

		obj.add("Ruthu");

		obj.add("Mani");

		obj.add("siva");

		System.out.println(obj);

		obj.pollFirst();

		System.out.println(obj);

		obj.pollLast();

		System.out.println(obj);

		obj.tailSet("Ruthu");

		System.out.println(obj);

		obj.headSet("Ruthu");

		System.out.println(obj);

	}

}
