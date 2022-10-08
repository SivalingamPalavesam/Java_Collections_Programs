package com.java.array;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLiistProg {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		
		  list.addAll(list2);
		
		
		Iterator<Integer> xyz = list.descendingIterator();		
		while(xyz.hasNext())
		{
			System.out.print(xyz.next());
		}
		
		//System.out.println(list);
		//System.out.println(list2);
	}

}
