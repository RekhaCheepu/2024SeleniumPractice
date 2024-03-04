package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement name=(WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector('#kils')");
//		name.sendKeys("rekha");
//		WebElement pizza = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
//		
//		pizza.sendKeys("veg pizza");
		WebElement pizza=(WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector('#app2').shadowRoot.querySelector('#pizza')");
		pizza.sendKeys("cheese pizza");
	}

}

