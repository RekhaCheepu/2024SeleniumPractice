package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithAllWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String parentWindowId=driver.getWindowHandle();
		WebElement lnkEle=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement fbEle=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twEle=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement ytkEle=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		lnkEle.click();
		fbEle.click();
		twEle.click();
		ytkEle.click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		while(it.hasNext()) {
			String WindowId=it.next();
			driver.switchTo().window(WindowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1000);
			if(!WindowId.equals(parentWindowId)) {
				driver.close();
				
			}
		}
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
	}

}
