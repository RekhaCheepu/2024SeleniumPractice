package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SamsSVGElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.samsclub.com/");
		String xPath="(//*[name()='svg']//*[name()='path' and@fill-rule='evenodd'])[1]";
	By searchIcon=	By.xpath(xPath);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("dress");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		act.click(driver.findElement(searchIcon)).build().perform();
		System.out.println("-------------------");

	}

}
