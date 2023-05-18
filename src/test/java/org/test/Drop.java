package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.formula.SheetRangeAndWorkbookIndexFormatter;
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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		WebElement dropdown = driver.findElement(By.id("continents"));
		
		File file =new File("C:\\Users\\prade\\eclipse-workspace\\Task2\\Excel\\naveen.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(stream);
		Sheet sheet = book.getSheetAt(0);
		
		Select s=new Select(dropdown);
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			WebElement el = options.get(i);
			String text = el.getText();
			System.out.println(text);
			
              Row createRow = sheet.createRow(i);
              Cell createCell = createRow.createCell(0);
              createCell.setCellValue(text);
		}
			FileOutputStream st=new  FileOutputStream(file);
			book.write(st);
			
			
		}

			
		
		
		  
		  
		  
		  
		  
		  
		
		
		
		
		
		
		
	

	}

}
