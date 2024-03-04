package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(br.getPageTitle());
		
		By emailId=By.id("input-email");
		By password=By.id("input-password");
		
		ElementUtil ele=new ElementUtil(driver);
		
		ele.doSendKeys(emailId, "rekha@gmail.com");
		ele.doSendKeys(password, "rekha123");
		
		br.quitBrowser();
		

	}

}
