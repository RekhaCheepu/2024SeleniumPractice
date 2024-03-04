package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalHrefValues {
static WebDriver driver;
	public static void main(String[] args) {
		
driver=new ChromeDriver();
		
		driver.get("https://www.walmart.com/");
		List<WebElement> hrefList=driver.findElements(By.tagName("a"));
		System.out.println(hrefList.size());
		
		for(WebElement e: hrefList) {
			String href=e.getAttribute("href");
			System.out.println(href);
			
		}
		
		
		
	}

}
