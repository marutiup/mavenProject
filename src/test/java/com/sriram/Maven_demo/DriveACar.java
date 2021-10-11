package com.sriram.Maven_demo;

import org.testng.annotations.Test;

public class DriveACar {
	@Test(priority=5)
	public void startTheCar() {
		System.out.println("Start the Car");
		
	}
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("first gear");

		
	}
	@Test(priority=2)
	public void putsecondGear() {
		System.out.println("second gear");

		
	}
	@Test(priority=3)
	public void putThreadGear() {
		System.out.println("thread gear");

		
	}
	@Test(priority=4)
	public void putFourthGear() {
		System.out.println("fourth gear");

		
	}
	

}
