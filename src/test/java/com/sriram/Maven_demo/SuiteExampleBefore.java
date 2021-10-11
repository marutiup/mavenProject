package com.sriram.Maven_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SuiteExampleBefore
{
	@Test
	public void openGoogle() {
		long s = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		
		driver.quit();
		long e = System.currentTimeMillis();
		long totalTime= (e-s) ;
		System.out.println(" Total time is :" + totalTime);
	}
	
	@Test
	public void openBing() {
		long stTime = System.currentTimeMillis();//to calculate the time

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.big.co.in");
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime=endTime-stTime;
		System.out.println(" Total time is :" + totalTime);
		
	}
	@Test
	public void openYahoo() {
		long stTime = System.currentTimeMillis();//to calculate the time

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.yahoo.co.in");
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime=endTime-stTime;
		System.out.println(" Total time is :" + totalTime);
		
	}

}
