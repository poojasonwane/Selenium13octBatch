package samplepackage;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\POOJA SONWANE\\automation testing jar files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fortunecloudindia.com/");
		
		driver.manage().window().maximize();
		
		// Create object of Action class
		Robot robot = new Robot();
		 
		// Scroll MouseWheel
		robot.mouseWheel(5);


		
		

	}

}
