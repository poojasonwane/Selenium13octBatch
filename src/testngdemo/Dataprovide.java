package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovide {
	
	@Test(dataProvider="testdata")
	public void TestChrome(String uname,String password)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		
		driver.manage().window().maximize();
		
		// Load application
		
		driver.get("https://lms.fortunecloudindia.com/");
		
		//driver.findElement(By.name("username")).clear();
		
		driver.findElement(By.name("username")).sendKeys(uname);
		
		//driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed()
	{
	
		// Create object array with 2 rows and 2 column- first parameter is row and second is //column
		Object [][] twitterdata=new Object[2][2];
	
		// Enter data to row 0 column 0
		twitterdata[0][0]="username1@gmail.com";
		// Enter data to row 0 column 1
		twitterdata[0][1]="Password1";
		// Enter data to row 1 column 0
		twitterdata[1][0]="username2@gmail.com";
		// Enter data to row 1 column 0
		twitterdata[1][1]="Password2";
		// return arrayobject to testscript
		return twitterdata;
	}
}
