package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageLoadTimeOutConcept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Duration time=driver.manage().timeouts().getPageLoadTimeout();driver.get("https://classic.freecrm.com/pricing.html");
		
System.out.println(driver.getTitle());

	}

}
