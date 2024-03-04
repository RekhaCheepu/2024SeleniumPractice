package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeBrowser {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
