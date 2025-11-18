package Tc01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ddw2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\Fatima.xls");
		
		XSSFWorkbook workbook = new  XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Fsheet1");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("noofrows");
		int rows = sc.nextInt();
		
		System.out.println("noofcells");
		int cells = sc.nextInt();

		for(int r=0;r<=rows;r++)
		{
			XSSFRow row = sheet.createRow(r);
						
			for(int c=0;c<cells;c++)
			{
				XSSFCell cell = row.createCell(c);
				cell.setCellValue(sc.next());				
				
			}
		}
		
	workbook.write(file);		
	workbook.close();
	file.close();
	
	System.out.println("File is created");
		

	}

}
