package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiuser_FCT {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://lms.fortunecloudindia.com/");
		
		String arr[][]= { {"user1@test.com","user2@test.com"} , {"Test@123","Test@123"} };
		
		for(int i=0; i<arr.length-1 ; i++){

			for(int j=0;j<arr.length;j++) { 

			//Find Login button     
			//d1.findElement(By.xpath("xpath")).click();

			d1.findElement(By.name("username")).sendKeys(arr[i][j]);

			d1.findElement(By.name("password")).sendKeys(arr[i+1][j]);

			//Click on Submit button
			d1.findElement(By.name("login")).click();
			
			

			//Add your code
			//Log out
			//driver.findElement(By.xpath("xpath")).click();           
			        }    
			    }

		/*WebElement username = d1.findElement(By.name("username"));
		username.click();
		username.sendKeys("poojasonwane00@gmail.com");
		
		WebElement password = d1.findElement(By.name("password"));
		password.click();
		password.sendKeys("S9TGXSL");
		
		WebElement  login = d1.findElement(By.name("login"));
		login.click();
		*/

	}

}
