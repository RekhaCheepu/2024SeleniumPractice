package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
WebElement LnkdEle=driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));

LnkdEle.click();

Set<String>handles=driver.getWindowHandles();

Iterator<String> it=handles.iterator();

String ParentWindowId=it.next();
System.out.println("parent window id is:"+ParentWindowId);
String childWindowId=it.next();
System.out.println("child window id is:"+childWindowId);

driver.switchTo().window(childWindowId);
System.out.println("child window url is:"+driver.getCurrentUrl());
driver.close();

driver.switchTo().window(ParentWindowId);
System.out.println("parent window url is"+driver.getCurrentUrl());
driver.quit();
	}

}
