package testngdemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lms {
	
	WebDriver d1;
 @BeforeClass
  public void setup() {
	  
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
  }
  @BeforeMethod
  public void openbrowser()
  {
	  d1.get("https://www.fortunecloudindia.com/");
	  d1.findElement(By.xpath("//b[text()=\" Student Login\"]")).click();
	  
	  List<String> browsertabs = new ArrayList<String>(d1.getWindowHandles());
	  d1.switchTo().window(browsertabs.get(1));	
	  
	  
	  System.out.println("We are currently on the  following url "+d1.getCurrentUrl());
	  
  }
  
  @Test
  public void login()
  {
	  d1.findElement(By.name("username")).sendKeys("username");
	  d1.findElement(By.name("password")).sendKeys("password");
	  d1.findElement(By.name("login")).click();
	  
  }
  
  @AfterMethod
  public void afterlogin()
  {
	  System.out.println(d1.getCurrentUrl());
  }
  
  @AfterClass
  public void quit()
  {
	  d1.quit();
  }
}
