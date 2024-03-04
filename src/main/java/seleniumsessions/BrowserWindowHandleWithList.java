package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement lnkEle=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		lnkEle.click();
		Set<String> handles=driver.getWindowHandles();
		List<String> handlesList=new ArrayList<String>(handles);
		
		String ParentWID=handlesList.get(0);

		String ChildWID=handlesList.get(1);
		
		driver.switchTo().window(ChildWID);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(ParentWID);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}
