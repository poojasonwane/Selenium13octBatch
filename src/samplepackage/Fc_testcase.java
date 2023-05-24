package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fc_testcase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver d1 = new ChromeDriver();
		
		 Thread.sleep(3000);
				
		 d1.get("https://www.instagram.com");
		
		 Thread.sleep(3000);
		WebElement email = d1.findElement(By.name("username"));
		email.click();
		email.sendKeys("pooja_sonwane_8");
		
		
		WebElement pass= d1.findElement(By.name("password"));
		pass.click();
		pass.sendKeys("Poojas@123");
		
		d1.findElement(By.xpath("//div[text()=\"Log in\"]")).click();
		
		
		


	
	}

}
