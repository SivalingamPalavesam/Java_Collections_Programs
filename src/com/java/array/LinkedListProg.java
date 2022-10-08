package com.java.array;

import java.util.LinkedList;

public class LinkedListProg {

	public static void main(String[] args) {
		
		LinkedList obj = new LinkedList();  // liked list  program object
		
		obj.add("A");
		
		obj.add("B");
		
		obj.addFirst("E");
		
		obj.addLast("D");
		
		obj.add(3, "C");
		
		obj.add("B");
		obj.add("siva");
		obj.add(100);
	
		System.out.println(obj);
		
		obj.remove("B");
		
		System.out.println(obj);
	
		obj.remove(2);
		
		System.out.println(obj);
		
		obj.removeFirst();
		
		System.out.println(obj);
		
		obj.removeLast();
		
		System.out.println(obj);
		
		
		System.out.println(obj.getLast());
		
	}

}
