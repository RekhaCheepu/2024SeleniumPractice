package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTopCastingOptions {
static WebDriver driver;
	public static void main(String[] args) {
		String browser="edge";
		
		if(browser.equals("chrome")) {
			
			driver=new ChromeDriver();
			
		}
		 else if (browser.equals("firefox")) {
			 driver=new FirefoxDriver();
		 }
		 else if(browser.equals("edge")) {
			 driver=new EdgeDriver();
		 }
		 else {
			 System.out.println("please pass the right browser");
		 }
driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		if (title.equals("Google")){
			System.out.println("correct title");
		}
			else {
				System.out.println("incorrect title");
				
				}
		driver.quit();
			
		

	}

}
