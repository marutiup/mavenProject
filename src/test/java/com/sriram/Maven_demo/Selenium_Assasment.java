package com.sriram.Maven_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium_Assasment {
	static WebDriver driver;
	
	@Test
	public static void before() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.gettyimages.in");
				
	}
	@Test
	public void navigate_getTitle() {
		driver.navigate().to("https://www.gettyimages.in");
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void register() {
		WebElement userIcon = driver.findElement(By.xpath("//a[text()='SIGN IN']"));
		userIcon.click();
		WebElement registerTab = driver.findElement(By.xpath("//div[text()='REGISTER']"));
		registerTab.click();
		WebElement firstName = driver.findElement(By.id("register_first_name"));
		firstName.sendKeys("sri");
		WebElement lastName = driver.findElement(By.id("register_last_name"));
		lastName.sendKeys("ram");
		WebElement firstDropDown = driver.findElement(By.xpath("(//select[@required='required'])[1]"));

		Select s = new Select(firstDropDown);
		s.selectByValue("10");
		WebElement organization = driver.findElement(By.id("register_organization_name"));
		organization.sendKeys("Soft Crylic");
		WebElement jobTitle = driver.findElement(By.xpath("(//select[@required='required'])[2]"));
		Select s1 = new Select(jobTitle);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s1.selectByValue("47");
		WebElement email = driver.findElement(By.id("register_email"));
		email.sendKeys("ttinuntw@gmail.com");
		WebElement mobileNumber = driver.findElement(By.id("register_telephone"));
		mobileNumber.sendKeys("8825505849");
		WebElement id = driver.findElement(By.id("register_extension"));
		id.sendKeys("11/11/2247");
		WebElement password = driver.findElement(By.id("register_password"));
		password.sendKeys("Soft0910");
		WebElement radioButton = driver.findElement(By.xpath("//input[@checked='checked']"));

		if (radioButton.isEnabled()) {

		} else {
			radioButton.click();

		}
		WebElement register = driver.findElement(By.id("register-button"));
		register.click();	
		
	}
	public void clickCreativeTab() {
		String currentUrl = driver.getCurrentUrl();
		WebElement creativeTab = driver.findElement(By.xpath("(//a[@target='_self'])[1]"));
		creativeTab.click();
		String currentUrl2 = driver.getCurrentUrl();

		boolean check = currentUrl.equals(currentUrl2);
		System.out.println(check);
	}
	public void createNewBoard() {
		WebElement boards = driver.findElement(By.xpath("//div[text()='BOARDS']"));
		boards.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement listel = driver.findElement(By.xpath("//a[@data-nav='nav_Boards_View_All_Boards']"));
		listel.click();
		WebElement addImage = driver.findElement(By.xpath("(//img[@class='ng-scope no-thumbnail'])[1]"));
		addImage.click();
	}
	
}
