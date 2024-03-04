package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelectTag {
static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		//Select se=new Select(country);
		//se.selectByIndex(6);
	//	se.selectByValue("Bahamas");
		//se.selectByVisibleText("Armenia");
		
		By Country=By.id("Form_getForm_Country");
		doSelectDropDownByIndex(Country,5);
		
		doSelectDropDownByVisibleText(Country,"India");
		
		doSelectDropDownByValue(Country,"Burundi");
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropDownByIndex(By locator,int index) {
		Select select=new Select(getElement (locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator ,String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
		
	
		
	}
	

}
