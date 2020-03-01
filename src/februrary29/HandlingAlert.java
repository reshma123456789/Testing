package februrary29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click me!')]")).click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
		alert.sendKeys("Hello World");
		Thread.sleep(3000);
		alert.accept();
		
		
	}

}
