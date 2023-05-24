package samplepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadrivenFramework {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	File file = new File("D:\\Dataset.xlsx");
	
	FileInputStream input = new FileInputStream(file);
	
	XSSFWorkbook wb = new XSSFWorkbook(input);
	
	XSSFSheet sheet = wb.getSheetAt(0);

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver d1 = new ChromeDriver();
	
	d1.get("https://lms.fortunecloudindia.com/");
	
	d1.manage().window().maximize();
	
	int rowcount = sheet.getLastRowNum();
	for(int i = 0;i<=rowcount;i++) //row
	{
	
	WebElement  username= d1.findElement(By.name("username"));
	WebElement password = d1.findElement(By.name("password"));
	
	WebElement login = d1.findElement(By.name("login"));
	
	username.sendKeys(sheet.getRow(i+1).getCell(0).getStringCellValue());
	
	password.sendKeys(sheet.getRow(i+1).getCell(1).getStringCellValue());
	
	login.click();
	
	
	String eurl = "https://lms.fortunecloudindia.com/index/";
	
	String aurl = d1.getCurrentUrl();
	
	if(eurl.equalsIgnoreCase(aurl))
	{
		Thread.sleep(3000);
		WebElement alert = d1.findElement(By.xpath("//*[@id=\"subscribe_modal\"]/div/div/div[1]/button/span"));
		alert.click();
		
		
		//System.out.println("Testcase pass");
		sheet.getRow(i+1).createCell(2).setCellValue("Testcase pass");
		
		d1.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[8]/a/p/i")).click();
		Thread.sleep(3000);
		d1.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[8]/ul/li[2]/a/p")).click();
	}
	else
	{
		//System.out.println("Testcase fail");
		sheet.getRow(i+1).createCell(2).setCellValue("Testcase fail");
	}
	
	FileOutputStream out = new FileOutputStream(file);
	wb.write(out);	

	}
	}

}
