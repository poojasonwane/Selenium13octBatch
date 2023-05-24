package samplepackage;




import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class buzz_register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://cravitaindia.com/buzz/");
		
		d1.manage().window().maximize();
		
	
		d1.findElement(By.xpath("//a[text()=\"REGISTER\"]")).click();
		
		WebElement id = d1.findElement(By.xpath("//input[@name=\"user_id\"]"));
		id.click();
		id.sendKeys("EMP0018");
		
		Thread.sleep(2000);
		
		WebElement email = d1.findElement(By.name("username"));
		email.click();
		email.sendKeys("poojasonwane00@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement name= d1.findElement(By.name("name"));
		name.click();
		name.sendKeys("pooja sonwane");
		
		WebElement pass= d1.findElement(By.name("password"));
		pass.click();
		pass.sendKeys("pooja@123");
		
		WebElement cpass= d1.findElement(By.name("cpassword"));
		cpass.click();
		cpass.sendKeys("pooja@123");
		
		
		Thread.sleep(2000);
		
		WebElement profile = d1.findElement(By.name("profile"));
		profile.click();
		
		
		
		Select s1 = new Select(profile);
		s1.selectByValue("HR MANAGER");
		
	
		
		List<WebElement> option = d1.findElements((By.xpath("/html/body/div/div/div[1]/div/div/div[2]/div/div[2]/form/div[4]/div/div/select/option[1]")));

		ArrayList a = new ArrayList();

		        for (WebElement str: option)
		        {
		           String s =  str.getText();
		           if(!s.equals("option")) {
		               a.add(s);
		         }
		           else {
		               continue;
		           }
		        }

		System.out.println("The Output is: "+ a);
		
		Thread.sleep(2000);
		
		WebElement jdate = d1.findElement(By.name("j_date"));
		jdate.click();
		jdate.sendKeys("17012023");
		
		WebElement contact = d1.findElement(By.name("contact"));
		contact.click();
		contact.sendKeys("9370729896");
		
		Thread.sleep(2000);
		
		d1.findElement(By.name("submit")).click();
		
		
		
		
		
		

	}

}
