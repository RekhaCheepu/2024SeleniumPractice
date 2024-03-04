package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsudoElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String mand_ele=js.executeScript("return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),"
				+ "'::before').getPropertyValue('content')").toString();
		System.out.println(mand_ele);
		if(mand_ele.contains("*")) {
			System.out.println("this is a mandatory field");
			
		}

	}

}
