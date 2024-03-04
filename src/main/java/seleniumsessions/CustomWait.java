package seleniumsessions;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement retryingElement(By locator,int timeOut) {
		WebElement element=null;
		int attempts=0;
		while(attempts<timeOut) {
			try {
			element=getElement(locator);
			System.out.println("element is found in attempts:"+attempts);
			break;
			}catch(NoSuchElementException e) {
				System.out.println("ele is not found in attempts:"+attempts+"for"+locator);
				
				TimeUtil.mediumWait();//timeUtil class
			}
		attempts++;
		
			}
		if (element==null) {
			System.out.println("element is not found ...tried for:"+timeOut+"sec"+"with the intervel of 500 milliseconds");
			throw new FrameworkException("TimeOutException");
		}
		return element;
	}
	
	
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		By firstName=By.name("first_name11");
		retryingElement(firstName,20).sendKeys("rekha");
		
		
		

	}

}