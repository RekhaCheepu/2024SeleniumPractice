package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailId=By.id("input-email");
		By passWord=By.id("input-password");
		By login=By.xpath("//input[@value='Login']");
//		Actions act=new Actions(driver);
//		act.sendKeys(driver.findElement(emailId), "rekha@gmail.com").build().perform();
//		act.sendKeys(driver.findElement(passWord), "rekha@123").build().perform();
//		act.click(driver.findElement(login)).build().perform();
//		
		doActionsSendKeys(emailId,"rekha@gmail.com");
		doActionsSendKeys(passWord,"rekha123");
		doActionsClick(login);
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionsSendKeys(By locator,String value) {
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
public static void doActionsClick(By locator) {
	Actions act=new Actions(driver);
	act.click(getElement(locator)).build().perform();
}
}