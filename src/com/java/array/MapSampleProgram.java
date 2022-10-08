package com.java.array;

import java.util.*;

public class MapSampleProgram {

	int id;
	String empName;
	String address;

	MapSampleProgram(int id, String empName, String Address) {
		this.id = id;
		this.empName = empName;
		this.address = Address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {

		MapSampleProgram obj = new MapSampleProgram(1, "siva", "sriv");
		MapSampleProgram obj1 = new MapSampleProgram(2, "sri ", "sivakasi");
		MapSampleProgram obj2 = new MapSampleProgram(1, "siva", "ooty");

		List<MapSampleProgram> elist = new ArrayList();

		elist.add(obj);
		elist.add(obj1);
		elist.add(obj2);

		for (int i = 0; i < elist.size(); i++) {
			System.out.println(
					elist.get(i).getId() + "   " + elist.get(i).getEmpName() + "  " + elist.get(i).getaddress());

		}
		System.out.println("****Use in For Each loop****");
		for (MapSampleProgram i : elist) {

			System.out.println(i.getId() + "  " + i.getEmpName() + "  " + i.getaddress());

		}
	}

}
