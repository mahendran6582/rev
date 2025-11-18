package Tc09;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDw1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\yes.xls");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Dynam1");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("mahe1");
		row1.createCell(1).setCellValue("mahe1");
		row1.createCell(2).setCellValue("mahe1");
		
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("net1");
		row2.createCell(1).setCellValue("net1");
		row2.createCell(2).setCellValue("net1");
		
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("yat1");
		row3.createCell(1).setCellValue("yat2");
		row3.createCell(2).setCellValue("yadvik1");
		
		System.out.println("file is created");
		
		workbook.write(file);
	
		workbook.close();
		
		file.close();
		
	}
	
	

}
