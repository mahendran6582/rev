package Sep18;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDwrite1 {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row1= sheet.createRow(0); 
		row1.createCell(0).setCellValue("Selenium");
		row1.createCell(1).setCellValue("Appium");
		row1.createCell(2).setCellValue("Java");
		
		
		
		XSSFRow row2= sheet.createRow(1);
		row2.createCell(0).setCellValue("V1.1");
		row2.createCell(1).setCellValue("V1.2");
		row2.createCell(2).setCellValue("V1.3");
		
		XSSFRow row3= sheet.createRow(2);
		row3.createCell(0).setCellValue("book1");
		row3.createCell(1).setCellValue("book2");
		row3.createCell(2).setCellValue("book3");
		
		
		workbook.write(file);
		workbook.close();
		file.close();

		System.out.println("File is created");
	}

}
