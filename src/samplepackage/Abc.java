package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Abc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://www.fortunecloudindia.com/");
		
		d1.manage().window().maximize();
		
		Thread.sleep(3000);
		
		try
		{
	
			WebElement home = d1.findElement(By.xpath("(//a[text()=\"Home\"])1"));
			home.click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		Thread.sleep(3000);
		
		WebElement services = d1.findElement(By.xpath("(//a[text()=\"Services\"])[1]"));
		
		Actions act = new Actions(d1);
		act.moveToElement(services).perform();
		
		WebElement s = d1.findElement(By.xpath("(//a[text()=\"Staffing & Recruitment\"])[1]"));
		s.click();
		

	}

}
