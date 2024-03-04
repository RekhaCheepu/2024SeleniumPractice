package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonSearch {

  

	public static void main(String[] args) {
	
WebDriver driver=	new ChromeDriver();
ElementUtil ele=new ElementUtil(driver);
		
		 driver.get("https://www.coach.com/");
		 By loginBtn=By.xpath("(//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd' and @fill='#000'])[3]");
		 By email=By.xpath("(//input[@id='login-form-email'])[1]");
		 By continueBtn=By.xpath("//button[text()='CONTINUE']");
		 By passWord=By.xpath("//input[@id='login-form-password']");
		 By signInBtn=By.xpath("//button[@data-qa='al_btn_signin']");
		 
		
		Actions act=new Actions(driver);
		act.click(driver.findElement(loginBtn)).build().perform();
		driver.findElement(email).sendKeys("rekha.pulicharla@gmail.com");
		
		driver.findElement(continueBtn).click();
		driver.findElement(passWord).sendKeys("S@t!$fact1on");
		driver.findElement(signInBtn).click();
		
	
		
		

	}

}
