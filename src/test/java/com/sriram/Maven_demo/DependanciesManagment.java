package com.sriram.Maven_demo;

import org.testng.annotations.Test;

public class DependanciesManagment {
	@Test()
	public void highSchool() {
		System.out.println("High school");
		
	}
	@Test(dependsOnMethods = "highSchool" )
	public void higherSecondary() {
		System.out.println("Higher Secondry");
	}
	@Test(dependsOnMethods = "higherSecondary" , enabled=false)
	public void engineering() {
		System.out.println("Engineering");
		
	}

}
