package Sep35;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ddw1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\Dell1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Dynamic1");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Jeans1");
		row1.createCell(1).setCellValue("Jeans1");
		row1.createCell(2).setCellValue("Jeans1");
				
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("RRR1");
		row2.createCell(1).setCellValue("RRR1");
		row2.createCell(2).setCellValue("RRR1");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("XXX1");
		row3.createCell(1).setCellValue("XXX1");
		row3.createCell(2).setCellValue("XXX1");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		
		System.out.println("File is created");

	}

}
