package com.java.array;

import java.util.Scanner;

public class ArrayProg
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Number   :");

		int n = input.nextInt();

		int number[] = new int[n];

		for(int i = 0 ; i < n ;i++)
		{
			number[i] = input.nextInt();

		}
		for(int i = 0 ; i < n ;i++)
		{
			System.out.println("The all value is  :"+i+"  " +number[i]);

		}
		input.close();
	}

}
