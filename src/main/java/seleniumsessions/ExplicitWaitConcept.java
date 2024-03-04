package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
	driver=new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/");
//		By macbook=By.linkText("MacBook");
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//WebElement mac_ele=wait.until(ExpectedConditions.presenceOfElementLocated(macbook));
//mac_ele.click();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	By emilId=By.id("input-email");
	By passWord=By.id("input-password");
	By LoginBtn=By.xpath("//input[@value='Login']");
	
	waitForElementPresence(emilId,10).sendKeys("rekha@gmail.com");
	getElement(passWord).sendKeys("rekha123");
	getElement(LoginBtn).click();

	}
	//An expectation for checking that an element is present on the DOM of a page.
	//This does notnecessarily mean that the element is visible.
	
	public static WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	//An expectation for checking that an element is present on the DOM of a page and visible.
	//Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
	
	public static WebElement waitForElementVisible(By locator,int timeOut) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
