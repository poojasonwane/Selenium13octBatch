package samplepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cravitaindia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://fortunecloudindia.com/projects/2022/jobs/");
		
		d1.manage().window().maximize();
		
		Thread.sleep(3000);
	
		WebElement register = d1.findElement(By.xpath("//a[text()=\" Register\"]"));
		register.click();
		
		String expresult = "https://fortunecloudindia.com/projects/2022/jobs/register";
		
		String actresult = d1.getCurrentUrl();
		
		System.out.println(actresult);
		
		if(expresult.equals(actresult))
		{
			System.out.println("Test case is pass");
			
			WebElement fname = d1.findElement(By.name("first_name"));
			fname.click();
			fname.sendKeys("pooja");
			
			WebElement lname = d1.findElement(By.name("last_name"));
			lname.click();
			lname.sendKeys("sonwane");
			
			WebElement contact = d1.findElement(By.name("contact"));
			contact.click();
			contact.sendKeys("9370729896");
			
			WebElement emailid = d1.findElement(By.name("email"));
			emailid.click();
			emailid.sendKeys("poojasonwane00@gmail.com");
			
			Thread.sleep(5000);
			
			WebElement state = d1.findElement(By.name("state"));
			state.click();
			
			Select select =new Select(state); 
			select.selectByVisibleText("Goa");
			
			Thread.sleep(5000);
			
			WebElement city = d1.findElement(By.id("cand_city"));
			city.click();
			
			List<WebElement> lst = select.getOptions();
			
			for(WebElement options: lst)
				System.out.println(options.getText());
			
			Select select1 =new Select(city); 
			select1.selectByVisibleText("Panaji");
			
			System.out.println("selected city is :"+select1.getFirstSelectedOption().getText());
			
			WebElement qua = d1.findElement(By.name("course"));
			qua.click();
			
			Select select2 = new Select(qua);
			select2.selectByIndex(3);
			System.out.println("Selected course is :"+select2.getFirstSelectedOption().getText());
			
			WebElement spe = d1.findElement(By.name("specialization"));
			spe.click();
			
			Select select3 = new Select(spe);
			select3.selectByIndex(0);
			System.out.println("Selected  specialization is :"+select3.getFirstSelectedOption().getText());
			
			WebElement pass= d1.findElement(By.name("pass"));
			pass.click();
			pass.sendKeys("pooja@123");
			
			
			WebElement conpass = d1.findElement(By.name("cpass"));
			conpass.click();
			conpass.sendKeys("pooja@123");
			
			WebElement submit = d1.findElement(By.xpath("//button[text()=\"register\"]"));
			submit.click();
			
	
			//System.out.println("Text:"+d1);

	}
	}

}
