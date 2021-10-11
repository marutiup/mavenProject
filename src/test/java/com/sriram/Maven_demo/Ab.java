package com.sriram.Maven_demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.asynchttpclient.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBodyData;
import io.restassured.specification.RequestSpecification;

public class Ab {

	@Test
	public void javaB() {

		int count = 0;
		List<String> myarray = new ArrayList<String>();
		// Q - print the number of times the word "the" present in str1

		String str1 = "This is the story about the boy in london.";
		String[] split = str1.split(" ");
		for (String string : split) {

			if (string.equals("the")) {
				count++;
			}
		}
		System.out.println(count);

		// Q - Assert that str2 and str3 are equal or not regardless to the spaces and
		// the case

		String str2 = " cAllFortheDay";
		String str3 = "CALLFortheDay      ";
		boolean equalsIgnoreCase = str2.trim().equalsIgnoreCase(str3.trim());
		System.out.println(equalsIgnoreCase);

		// Q-Treat the str4 and str5 as Integers , and print the result of adding them
		// together

		String str4 = "10 ";
		String str5 = " 20";

		int s1 = Integer.parseInt(str4.trim());
		int s2 = Integer.parseInt(str5.trim());
		int s3 = s1 + s2;
		System.out.println(s3);

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
			} else {
				int data = Integer.parseInt(values);

				value = value + data;
			}

		}
		System.out.println(value);

		// Q5- Using enhanced for loop Print the elements available the 'myarrayList'

		for (String string : myarrayList) {
			System.out.println(string);

		}
		// Q6-Print the size of 'myarrayList'

		int size = myarrayList.size();
		System.out.println(size);

		// Q4- Find the 'Opera' in the ArrayList, if not found print 'Opera is not
		// present in the arrayList' in console
		for (String string : myarrayList) {

			if (myarrayList.equals("Opera")) {

				System.out.println("Opera is present");
			}

			else {
				System.out.println("'Opera is not present in the arrayList");
				break;
			}

		}

		// Q4-Find the sum of the numbers stored in the arraylist

		// Q-Add the following items to the hashset

		Set<String> se = new HashSet<>();
		se.add("Windows");
		se.add("Os X");
		se.add("Ubuntu");
		se.add("Windows");
		// Q-print the size of the hashSet
		int size2 = se.size();
		System.out.println(size2);

		// Q-Iterate the elements in the hashmap and print them in console
		Iterator<String> iterator = se.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}

		// Q-remove 'Windows' from hashSet. And print the size of the hashSet
		se.remove("Windows");
		System.out.println(se);
		int size3 = se.size();
		System.out.println(size3);
	}

	@Test
	public void forHashMapTest() {
		// Q-Create the new Hashmap to store the Integer, String pairs
		Map<Integer, String> hm = new HashMap<>();
		// Q-Add the following pairs into HashMap
		hm.put(1, "Windows");
		hm.put(2, "Ubuntu");
		hm.put(3, "OsX");
		hm.put(4, "NewOperatingSystem");
		hm.put(4, "NewOperatingSystem1");
		// Q-Print the size of the Hashmap
		int size4 = hm.size();
		System.out.println(size4);
		// Q-print the keys stored in the hashmap
		Set<Integer> keySet = hm.keySet();
		System.out.println(keySet);
		// Q-remove the pairs from the hashmap which contains the value
		// "OperatingSystem".
		// A-null (
		String remove = hm.remove(hm.containsValue("NewOperatingSystem"));
		System.out.println(remove);

	}

	@Test
	public void forExceptionsTest() {

		String url = null;
		String url1 = "Windows";
		// Q-Compare the Given above string with any other valid string
		// Q-Handle the Specific Exception
		boolean equals;

		try {
			equals = url.equals(url1);
		} catch (NullPointerException e) {

			e.printStackTrace();
		}

		System.out.println("end");

	}


	@Test
	public void forRestApiTest() {

		RestAssured.baseURI ="http://api.geonames.org/";

		RequestSpecification request = RestAssured.given();

		Response response = (Response) request.get(
				"citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo"
				);

		String res = ((ResponseBodyData) response).asString();

		System.out.println("Response :" +res);

		int statuscode = response.getStatusCode();

		System.out.println("Status code: "+statuscode);

		Assert.assertEquals(200, statuscode);

		System.out.println("Successful");

	}



}


