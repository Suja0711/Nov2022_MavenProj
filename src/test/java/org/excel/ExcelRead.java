package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Sujatha\\Selenium Testing\\Selenium Testing Course - Green Technology - sep 2022\\eclipse-selenium-workspace\\MavenProj\\src\\main\\resources\\Excelbook.xlsx");
		
		//file --code
		FileInputStream fi = new FileInputStream(f);
		
		//Workbook
		Workbook w = new XSSFWorkbook(fi);
		
		//Sheet
		Sheet s = w.getSheet("Sheet1");
		
		//Row
		Row r = s.getRow(2);
		
		//Cell
		Cell c = r.getCell(6);
		System.out.println(c+" -- type "+c.getCellType());
		System.out.println("\nGet all cell data from workbook\n");
		
		for(int i=1; i<3; i++)
		{
			Row row = s.getRow(i);
			
			for(int j=0; j<row.getPhysicalNumberOfCells(); j++)
			{
				Cell ce = row.getCell(j);
				/*
				System.out.println("Type - "+ce.getCellType());
				System.out.print(ce.toString()+"  ");*/
				if(ce.getCellType() ==1)
				{
					System.out.println(ce);
				}
				else if(ce.getCellType()==0) {
					if(DateUtil.isCellDateFormatted(ce)) {
						Date d = ce.getDateCellValue();
						SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yy");
						String st = sd.format(d);
						System.out.println(st);						
					}
					else {
						double d = ce.getNumericCellValue();
						long l = (long) d;
						String value = String.valueOf(l);
						System.out.println(value);
					}
				}
			}
			System.out.println();
		}
	}
}
