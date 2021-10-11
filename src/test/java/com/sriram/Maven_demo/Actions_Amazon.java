package com.sriram.Maven_demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Amazon {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement electronics = driver.findElement(By.xpath("(//a[normalize-space()='Electronics'])[1]"));
		Actions ac=new Actions(driver);
		ac.contextClick(electronics).perform();
		Robot r=new Robot();
		
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		WebElement mob = driver.findElement(By.xpath("//*[@id=\'nav-xshop\']/a[1]"));
		Actions m=new Actions(driver);
		m.contextClick(mob).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		Set<String> set = driver.getWindowHandles();
		int size = set.size();
		System.out.println(size);
		for (String oneby : set) {
			String title = driver.switchTo().window(oneby).getTitle();
			System.out.println(title);

		}
		String s="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";

		for (String string : set) {
			if(driver.switchTo().window(string).getTitle().equals(s)) {
				System.out.println("done");
				break;
				
			}
			
		}

	}



}
