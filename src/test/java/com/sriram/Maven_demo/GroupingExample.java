package com.sriram.Maven_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupingExample {
	WebDriver driver;
	@BeforeSuite(groups= {"driver"})
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
		
		 driver=new ChromeDriver();		
		
	}
	
	@Test(groups= {"Apple"})
	public void apple6s() {
		
		driver.get("https://www.flipkart.com/apple-iphone-6s-space-grey-32-gb/p/itmen2yyjfzpspyg");
		
	}
	@Test(groups= {"Apple"})
	public void apple10s() {
		driver.get("https://www.flipkart.com/search?q=iphone%2010&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
	}
	@Test(groups= {"Apple"})
	public void apple13Pro() {
		driver.get("https://www.flipkart.com/search?q=iphone+13+pro&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_9_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_2_9_na_na_ps&as-pos=2&as-type=RECENT&suggestionId=iphone+13+pro%7CMobiles&requestId=fd5f19e1-46d9-4293-acd9-bfdd273e58b1&as-backfill=on");
		
			
	}
	@Test(groups= {"Vivo"})
	public void vivoZ1Pro() {
		driver.get("https://www.flipkart.com/search?q=z1+pro&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_ps&as-pos=1&as-type=RECENT&suggestionId=z1+pro%7CMobiles&requestId=4049e75b-5208-4dd4-a021-3164c7dfb7fb&as-searchtext=z1");
		
		
	}
	@Test(groups= {"Vivo"})
	public void vivoY13() {
		driver.get("https://www.flipkart.com/search?q=vivo+y21&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_6_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_2_6_na_na_ps&as-pos=2&as-type=RECENT&suggestionId=vivo+y21%7CMobiles&requestId=6aa7d249-6806-43b1-af7c-a9b179aafa76&as-backfill=on");
		
		
	}
	@Test(groups= {"Moto"})
	public void moto6() {
		driver.get("https://www.flipkart.com/search?q=vivo+y21&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_6_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_2_6_na_na_ps&as-pos=2&as-type=RECENT&suggestionId=vivo+y21%7CMobiles&requestId=6aa7d249-6806-43b1-af7c-a9b179aafa76&as-backfill=on");
		
		
	}
	@Test(groups= {"Moto"})
	public void motoZ() {
		driver.get("https://www.flipkart.com/search?q=motorola+edge+plus+mobile&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_7_14_na_na_ps&otracker1=AS_Query_OrganicAutoSuggest_7_14_na_na_ps&as-pos=7&as-type=RECENT&suggestionId=motorola+edge+plus+mobile&requestId=b43a0b68-4e62-4171-9670-42523187c7e9&as-backfill=on");
		
		
	}
	@AfterSuite(groups= {"driver"})
	public void after() {
		driver.quit();
	}

}
