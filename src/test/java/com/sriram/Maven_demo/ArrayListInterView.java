package com.sriram.Maven_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import com.google.common.base.Function;

public class ArrayListInterView {
	public static <T, U> List<U>
    convertStringListToIntList(List<T> listOfString,
                               Function<T, U> function)
    {
        return listOfString.stream().map(function).collect(null);
            
           
    }

	public static void main(String[] args) {
		

		int count=0;
		List<String> myarrayList= new ArrayList<String>();

		myarrayList.add("1");
		myarrayList.add("2");
		myarrayList.add("3");
		myarrayList.add("four");
		myarrayList.add("7");
		
		
		 for (String string : myarrayList) {
			 if (string.contains("[^a-z]")) {
				 
			 }else
			 {
				 int s=Integer.parseInt(string);
				 count=count+s;
			 }
			
		}System.out.println(count);
		
		
		
	}

}
