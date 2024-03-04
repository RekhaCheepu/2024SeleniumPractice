package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayed {
static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
//	boolean flag=	driver.findElement(By.name("search")).isDisplayed();
//	if(flag) {
//		System.out.println("ele is Displayed");
//	}else {
//		System.out.println("ele is not displayed");
//	}
		By search=By.name("search");
		By logo=By.className("img-responsive");
		
		//if(doIsSisplayed(search)) {System.out.println("pass");}
		//if(doIsSisplayed(logo)) {System.out.println("pass");}
	int count=	driver.findElements(search).size();
	if(count==1) {
		System.out.println("element is displayed");
	}
		
}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doIsSisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static boolean isElementExist(By locator) {
		int actCount=getElements(locator).size();
		System.out.println("actual count of element=="+actCount);
		if(actCount==1) {
			return true;
		}
		return  false;
		}
		
	

}

