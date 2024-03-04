package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterAccountTest extends BaseTest {
	@DataProvider
	public Object[][] getRegisterData() {
		return new Object[][] {
			{"hen","123","hen@gmail.com","1231231231","henben"},
			{"ten","234","ten@gmail.com","1234123456","tenten"},
			{"den","2345","den@gmail.com","1234123456","denden"},
			{"pen","234","pen@gmail.com","1234123456","pepen"},
		};
	}
	@Test(dataProvider="getRegisterData")
	public void registerAccountTest(String firstName,String lastName,String email,String phNumber,String password) {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(phNumber);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String message=driver.findElement(By.tagName("h1")).getText();
		
		Assert.assertTrue(message.contains("Your Account Has Been Created!"));
		
		
		
		
	}
	

}
