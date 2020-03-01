package februray23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com//test//basic-select-dropdown-demo.html");
		
		Select dropdown=new Select(driver.findElement(By.id("select-demo")));
		dropdown.selectByVisibleText("Friday");
		
		Select multipleSelect=new Select(driver.findElement(By.id("multi-select")));
		multipleSelect.selectByIndex(0);
		multipleSelect.selectByValue("New York");
		multipleSelect.selectByVisibleText("Texas");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
				
	}

}
