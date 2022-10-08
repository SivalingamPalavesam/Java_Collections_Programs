package com.java.array;

import java.util.*;

public class StockProg {

	public static void main(String[] args) {

		Stack<String> obj = new Stack<>();

		obj.push("two");

		obj.push("Four");

		obj.push("Three");

		obj.push("one");

		obj.push("Five");

		obj.push("six"); // Add the Value

		System.out.println(obj);

		obj.pop(); // Remove the last Element

		System.out.println(obj);

		System.out.println(obj.peek()); // Top of the element only print
	}
}
