package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
driver.findElement(By.id("datepicker")).click();
//driver.findElement(By.xpath("//a[text()='27']")).click();

String actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
System.out.println(actMonthYear);
while(!actMonthYear.equals("May 2025")) {
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	actMonthYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	System.out.println(actMonthYear);
	Thread.sleep(1000);
	
	selectDate("25");
	
	
}



	}
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
;	}

}

//div.DayPicker-Month div.DayPicker-Day--disabled:not(.DayPicker-Day--outside)