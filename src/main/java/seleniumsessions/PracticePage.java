package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.samsclub.com/");
		
		By Search=By.id("Search");
		WebElement search_ele=driver.findElement(Search);
		
		search_ele.sendKeys("Milk");
		Thread.sleep(10000);
		
		search_ele.sendKeys(Keys.ENTER);
		
		System.out.println(driver.getTitle());
		
		
		

	}

}
