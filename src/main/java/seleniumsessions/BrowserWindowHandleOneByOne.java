package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleOneByOne {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	//1	
		WebElement lnkEle=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		lnkEle.click();
		Set<String> handles1=driver.getWindowHandles();
		Iterator<String> it1=handles1.iterator();
		
		String ParentWindowId=it1.next();
		String childWindowId=it1.next();
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		
		//2
		WebElement fbEle=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		fbEle.click();
		Set<String> handles2=driver.getWindowHandles();
		Iterator<String> it2=handles2.iterator();
		
		 ParentWindowId=it2.next();
		childWindowId=it2.next();
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
	}

}
