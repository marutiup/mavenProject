package com.sriram.Maven_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imag_Demo97 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.gettyimages.in/");
		
		List<WebElement> all_Images = driver
				.findElements(By.xpath("//div[@class='square-grid-item__contributor-name']"));
		
		System.out.println("Before");
		
		for (WebElement images : all_Images) {
			
			System.out.println("Title : "+images.getText());
			
			
		}
		
		
	}

}
