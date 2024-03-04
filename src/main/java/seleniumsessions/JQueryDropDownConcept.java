package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
		By choices=By.xpath("//span[@class='comboTreeItemTitle']");
		
		//SelectChoice(choices,"choice 1");
		
		//SelectChoice(choices,"choice 1","choice 2","choice 5");
		
		//SelectChoice(choices,"all");
		SelectChoice(choices,"choice 9");
	}
	/**
	 * This method is handling single,multiple,all choices selection and not available selection.
	 * 
	 * @param locator
	 * @param Choice
	 */
	public static void SelectChoice(By locator,String... Choice) {
		List<WebElement> choiceList=driver.findElements(locator);
		boolean flag=false;
		if(!(Choice[0].equalsIgnoreCase("all"))) {
		for(WebElement e: choiceList) {
			String text=e.getText();
			
			for(int i=0;i< Choice.length; i++) {
				if(text.equals(Choice[i])){
					flag=true;
					e.click();
					break;
				}
				
			}
		}
		}else {
			try {
			for(WebElement e: choiceList){
				flag=true;
				e.click();
			}
			}
			catch(Exception e) {
				
			}
			}
		if(flag==false) {
			System.out.println("choice is not available..."+Choice[0]);
		}
	}
	}


