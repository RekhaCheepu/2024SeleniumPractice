package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OpenCartTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
		@Test(description="opencart title test",priority=1)
		public void titleTest()  {
			String title=driver.getTitle();
			System.out.println("page title is:"+title);
			Assert.assertEquals(title, "Account Login","...opencart loginpage title test is incorrect...");
			
		}
		@Test(description="opencart logo test")
		public void logoTest() {
			boolean flag =driver.findElement(By.cssSelector("div#logo img")).isDisplayed();
			Assert.assertEquals(flag, true,"...logo is not present");
			
			flag=driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
			Assert.assertEquals(flag, true,".....forgot password link is not present...");
			
			}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		
		
	}
	
