package org.adact;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AdactExcel {

	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\prade\\eclipse-workspace\\Junit\\Excel\\AdactExcel.xlsx");
		FileInputStream stream =new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(stream);
		XSSFSheet sheet = book.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		
	
		
		
	}
	
}
