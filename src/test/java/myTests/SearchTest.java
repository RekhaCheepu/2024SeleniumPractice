package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{
	@DataProvider
	public Object[][] getSearchData() {
		return new Object[][] {
			{"macbook"},
			{"ipad"},
			{"samsung"},
			{"Apple"}
			
			};
			
	}
	@Test(dataProvider="getSearchData")
	public void searchTest(String ProductName) {
		driver.findElement(By.xpath("//input[@name='search']")).clear();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(ProductName);
		driver.findElement(By.cssSelector("#search button")).click();
		String results=driver.findElement(By.tagName("h1")).getText();
		Assert.assertTrue(results.contains(ProductName) );
	}

}
