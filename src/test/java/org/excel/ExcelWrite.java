package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Sujatha\\Selenium Testing\\Selenium Testing Course - Green Technology - sep 2022\\eclipse-selenium-workspace\\MavenProj\\src\\main\\resources\\ExcelWriteBook.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sh = wb.getSheet("Amazon");
		Row rw = sh.getRow(1);
		Cell cw = rw.createCell(5);
		cw.setCellValue("Sujatha");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		System.out.println("completed");
	}

}
