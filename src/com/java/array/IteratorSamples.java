package com.java.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorSamples {

	public static void main(String[] args) {
		
		List<String> course = Arrays.asList("C","Java","C#","Spring");
		
		Iterator<String> iterator = course.iterator();
		for (Iterator iterator2 = course.iterator(); iterator2.hasNext();)
		{
			String Value = (String) iterator2.next();
			System.out.println(Value);
		}
		
		
	}

}
