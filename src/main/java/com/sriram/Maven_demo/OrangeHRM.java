package com.sriram.Maven_demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SRIRAM\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement key = driver.findElement(By.xpath("//span[normalize-space()='( Username : Admin | Password : admin123 )']"));
		String username = key.getText();
		System.out.println(username);
		CharSequence userName = username.subSequence(13, 18);
		System.out.println(userName);
		CharSequence userPass = username.subSequence(32, 40);
		System.out.println(userPass);
		WebElement name = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		name.sendKeys(userName);
		WebElement pass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pass.sendKeys(userPass);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[7]")).click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='systemUser_userType']"));
		Select se=new Select(dropDown);
		se.selectByValue("2");
		driver.findElement(By.xpath("(//input[contains(@class,'formInputText')])[1]")).sendKeys("David Morris");
		driver.findElement(By.xpath("(//input[contains(@class,'formInputText')])[2]")).sendKeys("sownypraqm70@gmail.com");
		WebElement dropDown2 = driver.findElement(By.xpath("//select[contains(@id,'systemUser_status')]"));
		Select se1=new Select(dropDown2);
		se1.selectByValue("1");
		driver.findElement(By.xpath("(//input[contains(@class,'formInputText')])[3]")).sendKeys("Hai-080191");
		driver.findElement(By.xpath("(//input[contains(@class,'formInputText')])[4]")).sendKeys("Hai-080191");
		driver.findElement(By.xpath("//input[@class='addbutton']")).click();
		Thread.sleep(3000);
		List<WebElement> tabl = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[8]/td[2]/following-sibling::*"));
		//Iterator<WebElement> iterator = tabl.iterator();
		
		for (WebElement wer : tabl) {
			String text = wer.getText();
			System.out.println(text);
		
		}
		//System.out.println(tabl);
		
		
		
		
		
		
	}

}
