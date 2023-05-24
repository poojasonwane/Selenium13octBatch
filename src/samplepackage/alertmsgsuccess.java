package samplepackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertmsgsuccess {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver d1 = new ChromeDriver();
		  d1.manage().window().maximize();
		  
		  d1.get("https://lms.fortunecloudindia.com/");	 
		  
		  WebElement username = d1.findElement(By.name("username"));
			username.click();
			username.sendKeys("poojasonwane00@gmail.com");
			
			WebElement password = d1.findElement(By.name("password"));
			password.click();
			password.sendKeys("S9TGXSL");
			
			WebElement  login = d1.findElement(By.name("login"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement alert = d1.findElement(By.xpath("//*[@id=\"subscribe_modal\"]/div/div/div[1]/button/span"));
			alert.click();
			 
			
			WebElement success = d1.findElement(By.xpath("/html/body/script[29]"));
			String text = success.getText();
			System.out.println(text);
			
			
		  

	}

}
