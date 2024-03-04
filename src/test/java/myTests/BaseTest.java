package myTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	
	@Parameters({"url","browser"})
	@BeforeMethod
	public void setup(String url,String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		
		}else if(browsername.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			
			
		}else if(browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("please passs the right browser name"+browsername);
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(url);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
