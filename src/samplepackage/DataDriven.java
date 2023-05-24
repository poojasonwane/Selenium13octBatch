package samplepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		File file = new File("D:\\Dataset.xlsx");
		
		FileInputStream inputstream = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		
		
		Sheet sh = wb.getSheetAt(0);
		
		//Row r1 = sh.getRow(2);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://lms.fortunecloudindia.com/");
		
		d1.manage().window().maximize();
		
		
		
		int rowcount = sh.getLastRowNum();
		for(int i = 0;i<=rowcount;i++)
		{
			
			WebElement username= d1.findElement(By.name("username"));
			WebElement password= d1.findElement(By.name("password"));
			
			WebElement login= d1.findElement(By.name("login"));
			
			
			
		username.sendKeys(sh.getRow(i+1).getCell(0).getStringCellValue());
		
		password.sendKeys(sh.getRow(i+1).getCell(1).getStringCellValue());
		
		
		login.click();
		
		String eurl="https://lms.fortunecloudindia.com/index/";
		
		String aurl=d1.getCurrentUrl();
		
		if(eurl.equalsIgnoreCase(aurl))
		{
			
			Thread.sleep(3000);
			WebElement alert = d1.findElement(By.xpath("//*[@id=\"subscribe_modal\"]/div/div/div[1]/button/span"));
			alert.click();
			
			
			sh.getRow(i+1).createCell(2).setCellValue("TestCase Pass");
			
			
			
			d1.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[8]/a/p/i")).click();
			Thread.sleep(3000);
			d1.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[4]/div/div/nav/ul/li[8]/ul/li[2]/a/i")).click();
			
			
		}
		else
		{
			sh.getRow(i+1).createCell(2).setCellValue("TestCase fail");
		}
		
		FileOutputStream fout = new FileOutputStream(file);
		wb.write(fout);
		
		
		}
		
		

	}

}
