package com.sriram.Maven_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Example_Program {
	String [][] data;
	
	@DataProvider(name="inputData")
	public String [][] inputData() throws Throwable {
		data=getExcelData();
		
		return data;
		
	}
	
	public String[][] getExcelData() throws Throwable {
		FileInputStream stream = new FileInputStream("E:\\java\\Book1.xls");
		Workbook wb = Workbook.getWorkbook(stream);
		Sheet sheet = wb.getSheet(0);
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		String getDtat[][]=new String [rows	][columns];
		for(int i=1;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				getDtat[i-1	][j] = sheet.getCell(j, i).getContents();
			}
		}
		return getDtat;
	}
	@Test
	public void logIN() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		
	}
	
	

}
