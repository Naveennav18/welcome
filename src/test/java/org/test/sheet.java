package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sheet {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\prade\\eclipse-workspace\\Task2\\Excel\\excel task3.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook book=new XSSFWorkbook(stream);
		
		XSSFSheet createSheet = book.getSheetAt(0);
		
		Object[][] studetails= {{"stuid","stuname","studep"},
				{100,"nav","Cse"},
				{200,"dinesh","Ece"},
				{300,"ajay","IT"},
				{400,"jack","Eee"}};
		
		int row = studetails.length;
		int cell = studetails[0].length;
		
		for (int i = 0; i < row; i++) {
			XSSFRow createRow = createSheet.createRow(i);
			for (int j = 0; j < cell; j++) {
				XSSFCell createCell = createRow.createCell(j);
				
				
				Object obj=studetails[i][j];
				if (obj instanceof String) {
					createCell.setCellValue((String)obj);
					
				} else  if (obj instanceof Integer) {
					createCell.setCellValue((Integer)obj);
					
				}else if (obj instanceof Boolean) {
					createCell.setCellValue((Boolean) obj);
					
				}

				}
					
					
			
			
			
		
		}
		FileOutputStream str=new FileOutputStream(file);
		book.write(str);
		stream.close();
		str.close();
		book.close();
		 
		System.out.println("student details");	

		}
		
	
		
		
		
		
		
	}


