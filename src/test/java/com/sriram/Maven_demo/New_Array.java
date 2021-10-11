package com.sriram.Maven_demo;

import java.util.ArrayList;
import java.util.List;

public class New_Array {

	public static void main(String[] args) {
		List<String> myarrayList = new ArrayList<String>();

		int value = 0;

		// Q4-Include the following items in the 'myarrayList'

		myarrayList.add("1");
		myarrayList.add("2");
		myarrayList.add("3");
		myarrayList.add("four");
		myarrayList.add("7");

		for (String values : myarrayList) {	

			if (values.contains("four")) {
			}
			else 
			{				
				int data = Integer.parseInt(values);

				value = value + data;			
			}

		}System.out.println(value);

	}
}