package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class secondtestngprog {
	
	WebDriver d1;
  @BeforeTest
  public void setup() {
	  
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
  }
  @Test
  public void cravita_testcase()
  {
	  d1.get("https://jobs.cravitaindia.com/");
	  String title = d1.getTitle();
	  
	  String exp = "The Easiest Way to Get Your New Job\n";
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
  public void close()
  {
	  d1.close();
  }
}
