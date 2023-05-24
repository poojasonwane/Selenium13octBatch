package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firsttestngprog {
	
	WebDriver obj;
  @BeforeTest
  public void setup() {
	  
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		obj = new ChromeDriver();
		
		obj.manage().window().maximize();
  }
  @Test
  public void google_testcase() {
	  
	  obj.get("https://www.google.com/");
	  String title = obj.getTitle();
	  
	  String exp = "Google";
	  if(exp.equalsIgnoreCase(title))
	  {
		  System.out.println("test case pass");
	  }
	  else
	  {
		  System.out.println("test case fail");
	  }
  }
  @AfterTest
  public void fortune_testcase()
  {
	obj.get("https://www.fortunecloudindia.com/");
	WebElement stud = obj.findElement(By.xpath("//b[text()=\" Student Login\"]"));
	stud.click();
	 
  }
  
 /*  public void close() {
	  obj.close();
  }*/
}
