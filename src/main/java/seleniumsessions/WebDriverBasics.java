package seleniumsessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome","C:\\Users\\rekha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		if (title.equals("Google")){
			System.out.println("correct title");
		}
			else {
				System.out.println("incorrect title");
				
				}
		driver.quit();
			
		}
		

	}


