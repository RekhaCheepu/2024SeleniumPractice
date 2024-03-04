package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFeameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//browser - ch

		//page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page

		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("frame-one748593425");
		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Rekha");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("123");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("111 Reading");
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("near Library");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Edison");
		WebElement state=driver.findElement(By.id("RESULT_RadioButton-13"));
		Select se=new Select(state);
		
	List<WebElement>statelist=	se.getOptions();
	for(WebElement e: statelist) {
	String text=	e.getText();
	if( text.equals("California")) {
		e.click();
		break;
		
	}
		
		}
	
	driver.findElement(By.id("RESULT_TextField-14")).sendKeys("08820");
	driver.findElement(By.id("RESULT_TextField-15")).sendKeys("1234567890");
	driver.findElement(By.id("RESULT_TextField-16")).sendKeys("Rekha@gmail.com");
	driver.findElement(By.id("FSsubmit")).click();
	
	driver.switchTo().defaultContent();
	driver.findElement(By.partialLinkText("Log in")).click();
	
	
	
	
	
	
	
	
		

	}

}
