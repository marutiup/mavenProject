package com.sriram.Maven_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingString {
	
	String [][] data= {
			{"Admin", "admin123"},
			{"Admin", "sri"},
			{"Admin1","admin123"},
			{"Admin1","sri"}
	};
	
	@DataProvider(name="inputData")
	public String [][] loginDataProvider()
	{
	
	return data;
		}
	@Test(dataProvider = "inputData")
	public void loginWebsite(String name , String pass) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(name);
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
		
		
}

}
