package com.java.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class AddValue
{
	
	
	public void add()
	{
		
		
		List obj = new ArrayList<>();
		
		obj.add(20);
	
		obj.add(80);

		obj.add(60);
		
		obj.add(55);
		
		obj.add(50);
		
		System.out.println(obj);
		
		obj.add(1,30);
		
		System.out.println(obj);
		
		List<Integer>  checkVal = new ArrayList<>();
		
		checkVal.add(500);
		
		checkVal.add(1000); 
		
		obj.addAll(checkVal);  // add all value and second obj value added
		
		System.out.println(obj);
		
		System.out.println(obj.contains(900));
		
		System.out.println(obj.contains(50));
		
		System.out.println(obj.size());
		
		System.out.println(obj.isEmpty());
		
		obj.remove(6);
		
		System.out.println(obj);
		
		Collections.sort(obj);
		
		System.out.println(obj);
		
		
		System.out.println("******Iterater ******");
		
		Iterator<Integer> itr  = obj.iterator();
		
		System.out.println(itr.hasNext());
		
		System.out.println(itr.next());
		
		while(itr.hasNext())
		{	
			System.out.println(itr.next());
		}
		
		
		System.out.println("****** List Itr ******");
		
		ListIterator<Integer> listitr  = obj.listIterator(obj.size());
		
		System.out.println(listitr.hasPrevious());
				
		System.out.println(listitr.previousIndex());
	
		System.out.println(listitr.previous());
		
		System.out.println(listitr.nextIndex());
	}
}

public class ListExample {

	public static void main(String[] args) {
			
		AddValue obj1 = new AddValue();
		
		obj1.add();
			
	}

}
