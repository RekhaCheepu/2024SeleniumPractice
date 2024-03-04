package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionWithFEAndFES {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");
		
//		List<WebElement>linkList=driver.findElements(By.xpath("//div[@class='list-group11']"));
//		System.out.println(linkList.size());

		List<WebElement>linkList=driver.findElements(By.xpath("///div[@@@class='list-group11']"));
		System.out.println(linkList.size());
	}

}
