package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		WebElement mainCat=driver.findElement(By.id("headlessui-menu-button-:R5bab6:"));
		Actions act=new Actions(driver);
		act.moveToElement(mainCat).click().build().perform();
		List<WebElement> Level1List=driver.findElements(By.xpath("(//nav[@class='jsx-1259984711 flex text-medium'])[2]//li"));
		
		for(WebElement e1:Level1List ) {
			act.moveToElement(e1).build().perform();
			Thread.sleep(3000);
			System.out.println(e1.getText());

	}

}
}