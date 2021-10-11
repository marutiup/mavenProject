package com.sriram.Maven_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExampleAfter {
	
	WebDriver driver;
	long s;
	long e;
	

	@BeforeSuite
	public void beforeStart() {

		 s = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");

		 driver=new ChromeDriver();
	}


	@Test
	public void openGoogle() {


		driver.get("http://www.google.co.in");
	}



		@Test
		public void openBing() {

			driver.get("https://www.bing.com/");


		}
		@Test
		public void openYahoo() {

			driver.get("http://www.yahoo.co.in");


		}
		@AfterSuite
		public void afterStart() {
			driver.quit();
			 e = System.currentTimeMillis();
			long totalTime=e-s;
			System.out.println(" Total time is :" + totalTime);


		}

	}
