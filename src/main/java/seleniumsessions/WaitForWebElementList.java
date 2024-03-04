package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWebElementList {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
	By foooterLinks=	By.xpath("(//div[contains (@class,'hFnGrz')])[1]//li");
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				List<WebElement> footerList=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(foooterLinks));
				System.out.println(footerList.size());
				
				
		

	}

}
