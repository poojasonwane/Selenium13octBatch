package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buzz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://cravitaindia.com/buzz/");
		
		d1.manage().window().maximize();
		
		WebElement email = d1.findElement(By.name("username"));
		email.click();
		email.sendKeys("pooja.sonwane@fortunecloudindia.com");
		
		WebElement pass = d1.findElement(By.name("password"));
		pass.click();
		pass.sendKeys("Pooja@123");

		WebElement  login = d1.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div[2]/div/div[2]/form/button"));
		login.click();
		
		Thread.sleep(1000);
		
		WebElement search = d1.findElement(By.name("search_field"));
		search.click();
		search.sendKeys("9370729896");
		
		WebElement icon = d1.findElement(By.xpath("/html/body/div/div[3]/nav/div/div[2]/form/button/i"));
		icon.click();
		
		
	}

}
