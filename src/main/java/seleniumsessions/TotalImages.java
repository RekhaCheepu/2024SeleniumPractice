package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.navigate().to("https://naveenautomationlabs.com/opencart/");
	List<WebElement> imgList=driver.findElements(By.tagName("img"));
		System.out.println("images list="+imgList.size());
		
		for(WebElement e: imgList) {
			String srcval=e.getAttribute("src");
			String altval=e.getAttribute("alt");
			String classval=e.getAttribute("class");
			System.out.println(srcval+"="+altval+"="+classval);

	}

}
}