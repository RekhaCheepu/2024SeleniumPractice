package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleLevelParentChild {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		WebElement CategoryL1=driver.findElement(By.id("headlessui-menu-button-:R5bab6:"));
		CategoryL1.click();
		WebElement beveragesL2=driver.findElement(By.xpath("(//a[text()='Beverages'])[2]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(beveragesL2).build().perform();
		Thread.sleep(2000);
		WebElement teaL3=driver.findElement(By.xpath("//a[text()='Tea']"));
		act.moveToElement(teaL3).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Tea Bags']")).click();
		
		
		
		
		

	}

}
