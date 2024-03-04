package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MacysMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.macys.com/");
		List<WebElement> MenuItems=driver.findElements(By.xpath("//div[@class='redesign-header-fobs-container animated-hide']//li"));
		
		Actions act=new Actions(driver);
		for(WebElement e:MenuItems ) {
		act.moveToElement(e).click().build().perform();
		Thread.sleep(3000);
		System.out.println("---------------");
		System.out.println(e.getText());
		
		

	}

}
}