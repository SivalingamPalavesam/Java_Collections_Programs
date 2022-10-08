package com.java.array;

import java.util.Scanner;

public class ArrayForeachloop {

	public static void main(String[] args) {
			
		int n = 5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number  :");
		 
		int a[] = new int[n];
		
		for(int e : a)
		{
			e =input.nextInt();
			System.out.println("siva "+e);		

		}
		input.close();
		
	}

}
