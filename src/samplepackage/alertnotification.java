package samplepackage;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertnotification {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1 = new ChromeDriver();
		
		d1.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		d1.manage().window().maximize();
		
		WebElement alertbox = d1.findElement(By.xpath("//button[@name=\"alertbox\"]"));
		alertbox.click();
		
		Alert alt = d1.switchTo().alert();
		alt.accept();
		
		WebElement confirm = d1.findElement(By.name("confirmalertbox"));
		confirm.click();
		
		Thread.sleep(3000);
		
		d1.switchTo().alert().dismiss();
		
		
		WebElement prompt = d1.findElement(By.name("promptalertbox1234"));
		prompt.click();
		
		Thread.sleep(5000);
		
		Alert p = d1.switchTo().alert();
		p.sendKeys("yes");
		p.accept();
		
		WebElement output = d1.findElement(By.id("demoone"));
		String msg = output.getText();
		System.out.println("Text msg : "+msg);
	}

}
