package testngdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");                   
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.fortunecloudindia.com/");
		
		TakesScreenshot scrshot = (TakesScreenshot) (driver);
		
		File  scrFile = scrshot.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("D:\\bugscreenshot10-11-2022.png");
		
		FileUtils.copyFile(scrFile, destFile);
		
		driver.quit();

	}

}
