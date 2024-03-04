package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch {

	public static void main(String[] args) {
		WebDriver driver1=new ChromeDriver();
		WebDriver driver2=new ChromeDriver();
		WebDriver driver3=new ChromeDriver();
		driver1.get("https://www.google.com");
		driver2.get("https://www.amazon.com");
		driver3.get("https://www.target.com");
		
		driver1=driver2;
		
		driver2.quit();
		

	}

}
