package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWID=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.macys.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWID);
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
