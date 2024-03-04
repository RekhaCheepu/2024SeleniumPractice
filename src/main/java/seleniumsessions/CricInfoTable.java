package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
driver.get("https://www.espncricinfo.com/series/sa20-2023-24-1392651/joburg-super-kings-vs-pretoria-capitals-13th-match-1392664/full-scorecard");
	Thread.sleep(3000);	
	String WkTakwerName=getWicketTakerName("Will Jacks");
	System.out.println(WkTakwerName);
	String reunsByPlayer=runs("Will Jacks");
	System.out.println(reunsByPlayer);
		

	}
	public static String getWicketTakerName(String playerName) {
		return driver.findElement(By.xpath("((//span[text()='"+playerName+"'])[1]/ancestor::td/following-sibling::td)[1]"))
				.getText();
	}
	public static String runs(String playerName) {
		return driver.findElement(By.xpath("((//span[text()='"+playerName+"'])[1]/ancestor::td/following-sibling::td)[2]"))
				.getText();
	}

}

//(//*[name()='svg']//*[name()='path' and@fill-rule='evenodd'])[1]
