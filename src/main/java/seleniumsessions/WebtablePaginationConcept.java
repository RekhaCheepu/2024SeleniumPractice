package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablePaginationConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		while(true){
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0){
				SelectMultipleCountry("India");
			}
			WebElement next=driver.findElement(By.linkText("Next"));
			if(next.getAttribute("class").contains("disabled")) {
				System.out.println("pagination is over...");
			break;
			}
			next.click();
			Thread.sleep(2000);
		}
//		while(true){
//		if(driver.findElements(By.xpath("//td[text()='Canada']")).size()>0){
//			SelectCountry("Canada");
//			break;
//		}
//		else {
//			WebElement next=driver.findElement(By.linkText("Next"));
//					if(next.getAttribute("class").contains("disabled")) {
//						System.out.println("pagination is over...country is not found");
//						break;
//					}
//			next.click();
//			Thread.sleep(2000);
//		}
//		}

	}
	public static void SelectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	public static void SelectMultipleCountry(String countryName) {
		List<WebElement>checkBoxList=driver.findElements(By.xpath("(//td[text()='"+countryName+"'])/preceding-sibling::td/input[@type='checkbox']"));
	for(WebElement e: checkBoxList) {
		e.click();
	}
	}
	

}
