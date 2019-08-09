package org.cts.test.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Seet {
	public static void main(String[] args) throws Throwable {
		File loc=new File("C:\\Users\\babu\\eclipse-workspace\\Maven\\testdata\\Book2.xlsx ");
		 FileInputStream stream =new FileInputStream(loc);
		  
		 Workbook w=new XSSFWorkbook(stream);
		 Sheet s = w.getSheet("sheet2");
		Row r=s.getRow(2);
		Cell c=r.getCell(1);
		int g=c.getCellType();
	String sa=	c.getStringCellValue();
	if(sa.equals("podaa"));
		c.setCellValue("getLost");
		FileOutputStream fl=new FileOutputStream(loc);
		w.write(fl);
	
	}}
