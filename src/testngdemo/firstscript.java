package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {

	public static void main(String[] args) {
		
		// declaration and instantiation of objects/variables  
		System.setProperty("webdriver.chrome.driver","D:\\POOJA SONWANE\\automation testing jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch Website  
		driver.get("https://www.google.com/");
		
		String expectedtitle = "Google";
		
		String actualtitle = driver.getTitle();
		
		//compare expected output and actual output
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
		//Click on the search text box and send value  
		WebElement searchbox = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		
		searchbox.sendKeys("Fortune cloud Technologies");
		
		//Press Enter Key on keyboard
		searchbox.sendKeys(Keys.ENTER);
		
		driver.close();
	}

}
