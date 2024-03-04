package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		WebElement mainCat=driver.findElement(By.id("headlessui-menu-button-:R5bab6:"));
		Actions act=new Actions(driver);
		act.moveToElement(mainCat).click().build().perform();
		List<WebElement> Level1List=driver.findElements(By.xpath("(//ul[contains(@class,'text-silverSurfer')])[2]//li"));
		
		for(WebElement e1:Level1List ) {
			act.moveToElement(e1).build().perform();
			System.out.println(e1.getText());
			
			List<WebElement>Level2List =driver.findElements(By.xpath("(//ul[contains(@class,'bg-silverSurfer')])[2]//li"));
			for(WebElement e2:Level2List) {
			act.moveToElement(e2).build().perform();
			System.out.println(e2.getText());
			
			List<WebElement>Level3List =driver.findElements(By.xpath("(//ul[contains(@class,'bg-white')])[2]//li"));
			for(WebElement e3:Level2List) {
			act.moveToElement(e3).build().perform();
			System.out.println(e3.getText());
			
		
		 
			}
			
		}
	}

}
}