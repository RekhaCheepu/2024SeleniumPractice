package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://www.macys.com/");
		
//	WebElement ele=	driver.findElement(By.className("header-logo__image"));
//	
//	String area=ele.getAttribute("aria-label");
//	System.out.println(area);
//	String hrefval=ele.getAttribute("href");
//	System.out.println(hrefval);
	
	By logo=By.className("header-logo__image");
	String hrefvalue=dogetAttribute(logo,"href");
	String aria=dogetAttribute(logo,"aria-label");
	System.out.println(hrefvalue);
	System.out.println(aria);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
		
	}
	
	public static String dogetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
		
	}

}
