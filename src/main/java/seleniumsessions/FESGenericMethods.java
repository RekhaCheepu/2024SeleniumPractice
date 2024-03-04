package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FESGenericMethods {
static WebDriver driver;
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://www.kohls.com/");
		
		By footerLinks=By.xpath("//div[@class='footer-links']//li");
		List<String> actEleTextList=getElementTextList(footerLinks);
		System.out.println(actEleTextList);
		if(actEleTextList.contains("Kohl's Rewards")) {System.out.println("pass");}
		if(actEleTextList.contains("My Account")) {System.out.println("pass");}
	}
	public static List< WebElement> getElement(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> getElementTextList(By locator) {
		
		List<WebElement> eleList=getElement(locator);
		List<String> eleTextList=new ArrayList<String>();
		for(WebElement e :eleList ) {
			String text=e.getText();
			
			eleTextList.add(text);
			
		}
		return eleTextList;
	}

}
