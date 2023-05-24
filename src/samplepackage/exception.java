package samplepackage;



import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exception {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://www.fortunecloudindia.com/");
		
		
		
		try
		{
		WebElement home = d1.findElement(By.xpath("//a[text()=\"Home1\"]"));
		home.click();
		
		System.out.println("home page open");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		WebElement services = d1.findElement(By.xpath("(//a[text()=\"Services\"])[1]"));
		
		Actions act = new Actions(d1);
		act.moveToElement(services).perform();
		
		WebElement s = d1.findElement(By.xpath("(//a[text()=\"Staffing & Recruitment\"])[1]"));
		s.click();
		
		System.out.println("services page  open");
		
		
	}	
	

}
/*
arrayoutofboundindex
nullpointerexception
IoException
StringoutofboundException
ArithmeticException


NoSuchElementException
NoSuchWindowException
NoSuchAlertException
*/

