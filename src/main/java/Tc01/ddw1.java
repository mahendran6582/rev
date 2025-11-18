package Tc01;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ddw1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\Dytna1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Dsheet1");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Daily1");
		row1.createCell(1).setCellValue("Daily1");
		row1.createCell(2).setCellValue("Daily1");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Lotion1");
		row2.createCell(1).setCellValue("Lotion1");
		row2.createCell(2).setCellValue("Lotion1");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("Body1");
		row3.createCell(1).setCellValue("Body1");
		row3.createCell(2).setCellValue("Body1");
		
		
		
		workbook.write(file);
		workbook.close();	
		file.close();
		
		System.out.println("File is Created");

	}

}
