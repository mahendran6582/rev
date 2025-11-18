package Tc01;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ddr1 {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Data1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int noofrows = sheet.getLastRowNum();
		
		int noofcells = sheet.getRow(1).getLastCellNum();
		
		System.out.println(noofrows);
		System.out.println(noofcells);
		
		
		for(int r=0;r<=noofrows;r++)
		{
			XSSFRow row = sheet.getRow(r);
						
			for(int c=0;c<noofcells;c++)
			{
			XSSFCell cell = row.getCell(c);
			System.out.print(cell.toString()+ "\t");
			
			}
			
			System.out.println();
		}
		
		workbook.close();
		file.close();

	}

}
