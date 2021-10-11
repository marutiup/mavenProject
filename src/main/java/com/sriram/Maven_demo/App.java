package com.sriram.Maven_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
   
	public void frames() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		WebElement element = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']"));
		element.click();
		
		
		
	}
	public static void main(String[] args) {
		App ob=new App();
		ob.frames();
	}
}
