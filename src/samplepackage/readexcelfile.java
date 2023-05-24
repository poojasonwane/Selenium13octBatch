package samplepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcelfile {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("D:\\Dataset.xlsx");
		
		FileInputStream inputstream = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		
		
		Sheet sh = wb.getSheetAt(0);	
		
		//first row and cells
		
		Row row1 = sh.getRow(0);
		
		Cell cell1 = row1.getCell(0);
		
		Cell cell2 = row1.getCell(1);
		
		sh.getRow(0).createCell(2).setCellValue("Result");
		
		System.out.println(cell1+"||"+cell2);
		
		//second row and cells
		Row row2 = sh.getRow(1);
		
		Cell c1 = row2.getCell(0);
		
		Cell c2 = row2.getCell(1);
		
		System.out.println(c1+"||"+c2);

	/*	int rowcount = sh.getLastRowNum();
		
		for(int i = 0;i<=rowcount;i++) //row
		{
			int cellcount = sh.getRow(i).getLastCellNum();
			
			for(int j = 0 ;j<cellcount;j++) //cell
			{
				System.out.print(sh.getRow(i).getCell(j)+"||");			
			}
			System.out.println();
			
		}
		*/
		
		
		Row r3 = sh.createRow(2);
		
		r3.createCell(0).setCellValue("Name");
		r3.createCell(1).setCellValue("Address");
			
		
		FileOutputStream fout = new FileOutputStream(file);
		wb.write(fout);
		
		System.out.println("Data Write Sucessfully");
		
		
		
	}

}
