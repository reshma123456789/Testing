package februray23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("I know the path");
		
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
		Thread.sleep(4000);
		driver.close();
		
	}

}
