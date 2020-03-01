package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		WebElement textbox=driver.findElement(By.name("first_name"));
		textbox.sendKeys("Reshma");
		textbox=driver.findElement(By.name("last_name"));
		textbox.sendKeys("Naik");
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Selenium Easy")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
