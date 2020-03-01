package februray23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Reshma");
		
		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
