package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalValuesInSelectDropdown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(3000);
		//WebElement Country=driver.findElement(By.id("Form_getForm_Country"));
		
		//Select select=new Select(Country);
		By Country=By.id("Form_getForm_Country");
		
		doSelectDropdownValue(Country,"Canada");
		
		
	

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropdownValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		
		List<WebElement> OptionsList=select.getOptions();
		System.out.println(OptionsList.size());
		int count =0;
		for(WebElement e: OptionsList ) {
			String text=e.getText();
			System.out.println(count+"="+text);
//			if(text.equals(value)) {
//				e.click();
//				break;
			count++	;
				
			}
		}
		
		
		
		
		
		
		
		
	}

