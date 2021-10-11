package com.sriram.Maven_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Login {

	String [][] data;


	@DataProvider(name="inputData")
	public String [][] loginDataProvider() throws Throwable	{
		data=getExcelData();
		return data;
	}
	public String[][] getExcelData() throws Throwable {

		FileInputStream excel = new FileInputStream("E:\\java\\Book1.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		String getData[][]=new String[rows-1][columns];
		for (int i=1;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				getData[i-1][j] = sheet.getCell(j,i).getContents();
			}
		}
		
		return getData;

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
