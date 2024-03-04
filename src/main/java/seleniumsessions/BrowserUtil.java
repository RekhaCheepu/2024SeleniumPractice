package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	WebDriver driver;
	public WebDriver launchBrowser(String browserName) {
		System.out.println("browser nameis:"+browserName);
		
		switch (browserName) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		
default:
	System.out.println("please pass the right browser:"+browserName);
			break;
		}
		return driver;
	}
	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("url is null");
			throw new FrameworkException("URLISNULL");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new FrameworkException("URLISBLANK or URLISEMPTY");
		}

		// https://wwww.gogle.com
		if (url.indexOf("http") != 0 && url.indexOf("https") != 0) {
			System.out.println("http(s) is mising in the URL");
			throw new FrameworkException("HTTP(S) is missing");
		}
		
		driver.get(url);
	}
	public void LaunchUrl(URL url) {
		String newUrl=String.valueOf(url);
		if (url == null) {
			System.out.println("url is null");
			throw new FrameworkException("URLISNULL");
		}

		if (newUrl.length() == 0) {
			System.out.println("url is blank");
			throw new FrameworkException("URLISBLANK or URLISEMPTY");
		}

		// https://wwww.gogle.com
		if (newUrl.indexOf("http") != 0 && newUrl.indexOf("https") != 0) {
			System.out.println("http(s) is mising in the URL");
			throw new FrameworkException("HTTP(S) is missing");
		}
		driver.navigate().to(url);
		
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	public void closeBrowser() {
		 driver.close();
	}
	
	

}
