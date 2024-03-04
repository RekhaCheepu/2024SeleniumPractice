package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementHW {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		WebElement components=	driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(components).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();

	}

}
