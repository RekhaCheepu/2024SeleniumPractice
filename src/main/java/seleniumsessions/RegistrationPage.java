package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	public static void main(String[] args) {
		

		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.launchBrowser("chrome");
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(br.getPageTitle());
		if(br.getPageTitle().equals("Register Account")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
	
		
	By firstName=	By.id("input-firstname");
	By lastName= By.name("lastname");
	By email=By.cssSelector("#input-email");
	By telephone= By.xpath("//*[@id=\"input-telephone\"]");
	By password=By.id("input-password");
	By confirm =By.id("input-confirm");
	By policy=By.name("agree");
	By continuebtn =By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	
	
	ElementUtil ele=new ElementUtil(driver);
	
	ele.doSendKeys(firstName, "rekha");
	ele.doSendKeys(lastName, "cheepu");
	ele.doSendKeys(email, "rekha@gmail.com");
	ele.doSendKeys(telephone, "1234567890");
	ele.doSendKeys(password, "rekha123");
	ele.doSendKeys(confirm, "rekha123");
	ele.doClick(policy);
	ele.doClick(continuebtn);
//ele.doGetElementText(continuebtn);
	//br.quitBrowser();
	
			

	}

}
