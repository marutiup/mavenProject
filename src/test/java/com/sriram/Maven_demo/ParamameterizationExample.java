package com.sriram.Maven_demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamameterizationExample {
	
	
	@Test
	@Parameters("sri")
	public void test01(String s) {
		
		System.out.println("test case 1  "+ s );
		
	}
	@Test
	@Parameters("ram")
	public void test02(String r) {
		
		System.out.println("test case 2  "+r);
	}
	
	
	
	
	

}
