package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMDropdown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(3000);
		
		
	//List<WebElement> CountryList=	driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
	//System.out.println(CountryList.size());
	
	By countryList=	By.xpath("//select[@id='Form_getForm_Country']/option");
	doChooseDropdownValue(countryList,"Canada");

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doChooseDropdownValue(By locator,String value) {
		List<WebElement> OptionsList=driver.findElements(locator);

		int Count =0;
		for(WebElement e: OptionsList) {
		String text=	e.getText();
			System.out.println(Count+"="+text);
			Count++;
			if(text.equals(value)) {
				e.click();
				break;
			}
		
		}
}
}