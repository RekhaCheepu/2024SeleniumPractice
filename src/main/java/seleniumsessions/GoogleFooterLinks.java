package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {
static WebDriver driver;
	public static void main(String[] args) {
		
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		By footerLocatorLeft=By.xpath("//div[@class='KxwPGc AghGtd']");
		By footerLocatorright=By.xpath("//div[@class='KxwPGc iTjxkf']");
		//doClickOnElement(footerLocatorLeft,"Advertising");
		
		doClickOnElement(footerLocatorright,"Terms");
		
		

	}
	public static void doClickOnElement(By locator,String LinkText) {
	List<WebElement> LinkList=driver.findElements(locator);
	System.out.println("total links:"+LinkList);
	for(WebElement e: LinkList ) {
	String text=e.getText();
	System.out.println(text);
	if(text.contains(LinkText)) {
		e.click();
		break;
	}
	}
	
	}

}
