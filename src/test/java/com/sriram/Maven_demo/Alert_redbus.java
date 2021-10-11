package com.sriram.Maven_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		Thread.sleep(2000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));

		driver.switchTo().frame(iframe);
		Thread.sleep(2000);

		WebElement input = driver.findElement(By.xpath("//input[@class='IP']"));
		input.sendKeys("8825505849");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//i[@class='icon-close']")).click();











	}

}
