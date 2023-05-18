package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {
	public static   String  getData(String Sheetname, int rowno, int cellno) throws IOException {
		File file=new File("C:\\Users\\prade\\eclipse-workspace\\Task2\\Excel\\excel task 2.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(Sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		cell.setCellType(CellType.STRING);
		String stringCellValue = cell.getStringCellValue();
		return stringCellValue;
		

	}
	


	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		String data = getData("sheet1", 1, 0);
		firstname.sendKeys(data);
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		String data2 = getData("sheet1", 1, 1);
		lastname.sendKeys(data2);
		WebElement email = driver.findElement(By.id("userEmail"));
		String data3 = getData("sheet1", 1, 2);
		email.sendKeys(data3);
		
		WebElement phoneno = driver.findElement(By.id("userNumber"));
		String data4 = getData("sheet1", 1, 4);
		phoneno.sendKeys(data4);
		
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		String data5 = getData("sheet1", 1, 5);
		address.sendKeys(data5);
		
		
		WebElement subject = driver.findElement(By.id("//*[@id=\'subjectsContainer\']/div/div[1]"));

		String data6 = getData("sheet1", 1, 3);
		
		subject.sendKeys(data6);
		
		

	}

}
