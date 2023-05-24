package samplepackage;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;



public class fortunecloud {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://www.fortunecloudindia.com/");
		
		d1.manage().window().maximize();
		
		Thread.sleep(3000);
	
		WebElement home = d1.findElement(By.xpath("(//a[text()=\"Home\"])[1]"));
		home.click();
		
		Thread.sleep(3000);
		
		WebElement services = d1.findElement(By.xpath("(//a[text()=\"Services\"])[1]"));
		
		Actions act = new Actions(d1);
		act.moveToElement(services).perform();
		
		WebElement s = d1.findElement(By.xpath("(//a[text()=\"Staffing & Recruitment\"])[1]"));
		s.click();
		
	
		
		WebElement studlogin = d1.findElement(By.xpath("//b[text()=\" Student Login\"]"));
		studlogin.click();
		
		ArrayList<String> browsertabs = new ArrayList<String>(d1.getWindowHandles());
		d1.switchTo().window(browsertabs.get(1));	
		
		String expectedurl = "https://lms.fortunecloudindia.com/";
		
		String actualurl = d1.getCurrentUrl();
		
		System.out.println("Current url = "+actualurl);
		
		if(expectedurl.equalsIgnoreCase(actualurl))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
		//d1.close();
		//d1.quit();
		
		WebElement username = d1.findElement(By.name("username"));
		username.click();
		username.sendKeys("poojasonwane00@gmail.com");
		
		WebElement password = d1.findElement(By.name("password"));
		password.click();
		password.sendKeys("S9TGXSL");
		
		WebElement  login = d1.findElement(By.name("login"));
		login.click();
		
		 //WebElement alertnotification = d1.findElement(By.linkText(""));
		 //alertnotification.click();
		 Thread.sleep(4000);
		 WebElement alert = d1.findElement(By.xpath("//*[@id=\"subscribe_modal\"]/div/div/div[1]/button/span"));
		 alert.click();
		 
		 Thread.sleep(5000);
		/*
		 
		if(d1.findElement(By.linkText("Logout")).isDisplayed())
		{
			System.out.println("Successfully login ");
		}
		else
		{
			System.out.println("login failed");
		}
		*/
		/*WebElement profile = d1.findElement(By.xpath("(//a[text()=\"Profile\"])[1]"));
		profile.click();
		
		String eurl = " https://lms.fortunecloudindia.com/profile/";
		String aurl = d1.getCurrentUrl();
		
		System.out.println("profile page :"+aurl);
		if(eurl.equals(aurl))
		{
			System.out.println("Profile page is open");
		}
		else
		{
			System.out.println("Profile page is not open");
		}
		
		 */
		 Thread.sleep(5000);
		 
		 WebElement c = d1.findElement(By.xpath("/html/body/div[1]/div[2]/section/div/div/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/img"));
		 c.click();
		 	
		 WebElement v = d1.findElement(By.xpath("//*[@id=\"cbody\"]/div/div[1]/a/img"));
		 v.click();

		 Thread.sleep(4000);
		 WebElement alert1 = d1.findElement(By.xpath("//*[@id=\"subscribe_modal\"]/div/div/div[1]/button/span"));
		 alert1.click();
		 
		 Thread.sleep(3000);
		 
		 Screen s1 = new Screen();
		// s1.find("pause.jpg"); //identify pause button
		// s1.click("pause.jpg"); //click pause button
		 //System.out.println("pause button clicked");
		 
		 s1.find("///C:/Users/Admin/eclipse-workspace/Testing_13octbatch/images/play.jpg"); //identify play button
		 s1.click("///C:/Users/Admin/eclipse-workspace/Testing_13octbatch/images/play.jpg");
		 System.out.println("play buttton clicked");	
		 
		 Thread.sleep(3000);
		 
	}

}
