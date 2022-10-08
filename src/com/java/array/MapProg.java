package com.java.array;

import java.util.*;

public class MapProg {

	public static void main(String[] args) {

		HashMap<Integer, String> obj = new HashMap<>();

		obj.put(01, "siva");

		obj.put(02, "guru");

		obj.put(03, "Raj");

		Set set = obj.entrySet();

		Iterator obj1 = set.iterator();

		while (obj1.hasNext()) {
			Map.Entry obj3 = (Map.Entry) obj1.next();

			System.out.println(obj3.getKey() + "   " + obj3.getValue());

//			obj.remove(obj3);
//			
//			System.out.println(obj3);		
		}

	}

}
