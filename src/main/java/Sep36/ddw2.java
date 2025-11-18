package Sep36;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ddw2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\Samsung.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Sam1");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enterrow");
		int noofrows = sc.nextInt();
		
		
		System.out.println("entercell");
		int noofcell = sc.nextInt();
		
		
		for(int r=0;r<=noofrows;r++)
		{
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<noofcell;c++)
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
