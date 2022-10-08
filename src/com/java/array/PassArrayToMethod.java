package com.java.array;

public class PassArrayToMethod {

	static void array(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		array(a);
		array(new int[] { 10, 20, 30 }); // we can declare an array with out name

	}

}
