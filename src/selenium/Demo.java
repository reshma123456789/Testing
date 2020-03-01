package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement textbox=driver.findElement(By.name("firstName"));
		textbox.sendKeys("Reshma");
		textbox=driver.findElement(By.name("lastName"));
		textbox.sendKeys("Naik");
		textbox=driver.findElement(By.name("phone"));
		textbox.sendKeys("9876543210");
		textbox=driver.findElement(By.name("userName"));
		textbox.sendKeys("reshma@gmail.com");
		textbox=driver.findElement(By.name("address1"));
		textbox.sendKeys("kharadi");
		textbox=driver.findElement(By.name("city"));
		textbox.sendKeys("Pune");
		textbox=driver.findElement(By.name("state"));
		textbox.sendKeys("Maharashtra");
		textbox=driver.findElement(By.name("postalCode"));
		
		//List<WebElement> dropdown=driver.findElements(By.name("country"));
		//dropdown.add(e)
		
		
		textbox.sendKeys("411018");
		textbox=driver.findElement(By.name("email"));
		textbox.sendKeys("Resh");
		textbox=driver.findElement(By.name("password"));
		textbox.sendKeys("Resh@123");
		textbox=driver.findElement(By.name("confirmPassword"));
		textbox.sendKeys("Resh@123");
		
	}

}
