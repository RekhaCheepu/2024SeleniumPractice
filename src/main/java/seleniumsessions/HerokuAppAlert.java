package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuAppAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		
		String text1=alert.getText();
		System.out.println(text1);
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert prompt=driver.switchTo().alert();
		
		String text2=prompt.getText();
		System.out.println(text2);
		prompt.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert confirm=driver.switchTo().alert();
		
		String text3=confirm.getText();
		System.out.println(text3);
		confirm.sendKeys("123456");
		confirm.accept();
	}

}

//"C:\Users\rekha\OneDrive\Pictures\Screenshots\Screenshot (1).png"
