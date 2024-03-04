package seleniumsessions;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException  {
	
	
WebDriver driver=	new ChromeDriver();
ElementUtil ele=new ElementUtil(driver);
driver.get("https://www.guess.com/us/en/home/");

By searchIcon=By.xpath("//i[@class='fa-fw fal fa-search']");

 By signIn=By.xpath("(//span[text()='Sign in or Register'])[2]");
 By email=By.id("login-form-email");
 By password=By.id("form-password");
 By signInbtn=By.xpath("//button[text()='Sign in']");
 By headerList=By.xpath("//li[@class='nav-item tabs__navigation-item']");
 By logoutCheck=By.xpath("(//div[@class='header-user p-0 '])[last()]");
	 By logout=By.xpath("//a[text()=' Sign out']");
	 By searchProducts=By.cssSelector("div.product-grid__column");
	  By searchEnter=By.xpath("//i[@class='fal fw fa-search gtm_search']");
	  //By searchEnter=By.xpath("//i[@class='fal fw fa-search gtm_search']");
	  By siteSearch=By.id("site-search");
	  By viewCart=By.id("action_item_minicart");
	  By addToCart=By.cssSelector("div.cart-and-ipay__cta.flex-grow-1.flex-shrink-1");
	//  By logoutCheck2=By.xpath("(//span[text()='Hi,'])[2]");
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());


driver.findElement(signIn).click();

driver.findElement(email).sendKeys("rekha.cheepu@gmail.com");
driver.findElement(password).sendKeys("T@ga10ng");
driver.findElement(signInbtn).click();
Thread.sleep(5000);

ele.doActionsClick(logoutCheck);
driver.findElement(logout).isDisplayed();

//driver.findElement(searchIcon).click();
//WebElement search=driver.findElement(By.name("q"));
//search.sendKeys("Vera G Belt");
//search.sendKeys(Keys.ENTER);
//
//driver.findElement(By.xpath("//a[text()='Vera G Belt']")).click();
//String price=driver.findElement(By.xpath("(//div[@class='row'])[2]")).getText();
//driver.findElement(addToCart).click();
//driver.findElement(viewCart);
//Actions act=new Actions(driver);
//act.click().build().perform();


//String price=driver.findElement(By.xpath("//div[@class='price']")).getText();
//System.out.println(price);

//driver.findElement(siteSearch).sendKeys("Belts");
//driver.findElement(searchEnter).click();
//int noProduct=driver.findElements(searchProducts).size();
//System.out.println(noProduct);
//System.out.println(driver.getTitle());
//driver.findElement(By.xpath("//i[@class='fal fw fa-search gtm_search']")).click();
//driver.findElement(By.linkText("Natesha Strappy Rope Wedges")).click();

//Thread.sleep(5000);
//driver.switchTo().frame("attentive_creative");
//driver.findElement(By.xpath("//*[local-name()='svg']")).click();
//driver.switchTo().defaultContent();
//driver.findElement(By.xpath("//a[text()='Ederlo Tote Bag']")).click();
//System.out.println("----------------------------");

//System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getTitle());
//List<WebElement>headerlist=driver.findElements(headerList);
//List<String>headertextList=new ArrayList<String>();
//
//for(WebElement e:headerlist) {
//	String text=e.getText();
//	System.out.println(text);
//	
	
}
	}


	


