package februray23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));//fetches all 'a' tags
		System.out.println(allLinks);
		
		for (WebElement link : allLinks) {
		//gettext()-->fetches text of link & getAttribute-->fetches attributes	
		System.out.println(link.getText()+"===>>"+link.getAttribute("href"));
			
		}
	}

}
