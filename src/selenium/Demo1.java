package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;



public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Reshma");
		driver.findElement(By.id("lastname")).sendKeys("Naik");
		List<WebElement> list=driver.findElements(By.name("sex"));
		System.out.println(list);
		list.get(1).click();
		
		List<WebElement> yrOfExp=driver.findElements(By.name("exp"));
		yrOfExp.get(5).click();
		
		List<WebElement> profession=driver.findElements(By.name("profession"));
		/*for (WebElement webElement : profession) {   //To checkmark all the checkboxes
			webElement.click();
			System.out.println(webElement.getAttribute("value"));
			
		}*/
		///////////type1-----selection/////////////
		for (WebElement webElement1 : profession) {
			if(webElement1.getAttribute("value").contains("Automation Tester")) {
				webElement1.click();
			}
		}
//			WebElement continent=driver.findElement(By.id("continents"));
//			continent.select
//			System.out.println(continent);
			///////////////TYPE-2----Selection///////////

			List<WebElement> autotool=driver.findElements(By.name("tool"));
			//autotool.get(0).click();
			//OR
			
			System.out.println(autotool.size());
			
			for (WebElement webElement : autotool) {
				
				if(webElement.getAttribute("value").equals("Selenium IDE")) {
					webElement.click();
					System.out.println("clicked");
				}
				else if(webElement.getAttribute("value").equals("Selenium Webdriver")) {
						webElement.click();
					
				}
			
			}
			
			
		    Select dropdown=new Select(driver.findElement(By.id("continents")));
			dropdown.selectByVisibleText("Australia");
			
			Select selectionList=new Select(driver.findElement(By.id("continentsmultiple")));
			selectionList.selectByValue("SA");
			
			Select selCommands=new Select(driver.findElement(By.id("selenium_commands")));
			selCommands.selectByVisibleText("Navigation Commands"); 
	}

}
