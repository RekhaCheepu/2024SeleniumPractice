package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementToBeClicked {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://classic.freecrm.com/index.html?e=1");
By forgotPwd=By.linkText("Forgot Password?11");

//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofMillis(1000));

wait.until(ExpectedConditions.elementToBeClickable(forgotPwd)).click();
	}

}
