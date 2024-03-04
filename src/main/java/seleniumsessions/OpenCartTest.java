package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartTest {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.guess.com/us/en/search/?q=Shoe&search-button=&lang=en_US");
		System.out.println(driver.getTitle());
	}

}
