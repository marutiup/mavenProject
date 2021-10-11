package com.sriram.Maven_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) {

		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.gettyimages.in");
			String title = driver.getTitle();
			System.out.println(title);
			
		
			
			
			
			
			
			
		
	}

}
