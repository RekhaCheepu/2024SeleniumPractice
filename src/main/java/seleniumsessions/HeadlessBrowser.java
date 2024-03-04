package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		//co.set("headless") is depricated.in jan 2023
		
		//co.addArguments("--headless");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
