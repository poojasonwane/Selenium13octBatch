package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registrationform {

	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://nxtgenaiacademy.com/demo-site/");
		
		d1.manage().window().maximize();
		
		Thread.sleep(3000);
	
		WebElement fname = d1.findElement(By.name("vfb-5"));
		fname.click();
		fname.sendKeys("pooja");
		
		WebElement lname = d1.findElement(By.name("vfb-7"));
		lname.click();
		lname.sendKeys("sonwane");
		
		WebElement gender = d1.findElement(By.id("vfb-8-2"));
		gender.click();
		
		
		WebElement address = d1.findElement(By.name("vfb-13[address]"));
		address.click();
		address.sendKeys("Mahanagar palika ,pune");
		
		WebElement state = d1.findElement(By.name("vfb-13[state]"));
		state.click();
		state.sendKeys("maharashtra");
		
		WebElement country = d1.findElement(By.name("vfb-13[country]"));
		country.click();
		
		Select s1 = new Select(country);
		s1.selectByVisibleText("India");
		
		WebElement email = d1.findElement(By.name("vfb-14"));
		email.click();
		email.sendKeys("abc123@gmail.com");
		
		WebElement date = d1.findElement(By.name("vfb-18"));
		date.click();
		date.sendKeys("21-10-2022");
		
		WebElement h = d1.findElement(By.name("vfb-16[hour]"));
		h.click();
		
		Select s2 = new Select(h);
		s2.selectByIndex(1);
		
		WebElement m = d1.findElement(By.name("vfb-16[min]"));
		m.click();
		
		Select s3 = new Select(m);
		s3.selectByIndex(1);
		
		
		
		
		
		
		
		
	}

}
