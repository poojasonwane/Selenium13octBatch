package samplepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cravitausingdatadriven {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\\\Dataset.xlsx");
		
		FileInputStream input = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(input);
		
		XSSFSheet sheet = wb.getSheetAt(1);
		
		Row r1 = sheet.getRow(0);
		
		System.setProperty("webdriver.chrome.driver","D:\\POOJA SONWANE\\automation testing jar files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://jobs.cravitaindia.com/register");
		
		d1.manage().window().maximize();
		
		WebElement fname = d1.findElement(By.name("first_name"));
		fname.click();
		
		fname.sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		
		WebElement lname = d1.findElement(By.name("last_name"));
		lname.click();
		
		lname.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
		
		
		WebElement contactno = d1.findElement(By.name("contact"));
		contactno.click();
		
		long data  = (long) sheet.getRow(0).getCell(2).getNumericCellValue();
		
		contactno.sendKeys(String.valueOf(data));
		
		System.out.println(data);
		
	// Task: Write a script to take a bug screenshot using automation testing 
	
		
		
		
		
		
		

	}

}
