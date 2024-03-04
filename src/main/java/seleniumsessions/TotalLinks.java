package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class TotalLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.target.com/");
		List<WebElement> LinkList=driver.findElements(By.tagName("a"));
		
		System.out.println("total links:+"+LinkList.size());
//		
//		for(int i=0;i<LinkList.size();i++) {
//			String text=LinkList.get(i).getText();
//			//System.out.println(i+"="+text);
//			
//		if(!(text.length()==0)) {
//			System.out.println(i+"="+text);
//		}
//		}
		for(WebElement e: LinkList) {
			String text=e.getText();
		
		if(!(text.length()==0)) {
			System.out.println(text);
		}

	}

}
}