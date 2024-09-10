package Amazon_Project_01;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Amazon_Project._01.Child_Page;
import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;

public class Product_details_Testcase extends Launch_Quit {

	@Test
	public void Product_Details() throws InterruptedException {
		HomePage hm = new HomePage(driver);
		hm.accountlist(driver);
		Thread.sleep(2000);
		hm.signin();

		LoginPage l1 = new LoginPage(driver);
		l1.un();
		l1.cnt();
		l1.pwd();
		l1.signin();
		hm.search();

		Child_Page c = new Child_Page(driver);
		c.product_select();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> ids = s1.iterator();
		String parent_id = ids.next();
		String child_id = ids.next();
		driver.switchTo().window(child_id);
		WebElement price = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]"));
		//String s=price.getText();
		
		// span[@class="a-price aok-align-center reinventPricePriceToPayMargin
		// priceToPay"]
		boolean b = price.isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(2000);
		WebElement review = driver.findElement(By.xpath("(//span[@class=\"a-size-base a-color-base\"])[1]"));
		boolean b1 = review.isDisplayed();
		Assert.assertTrue(b1);
		
		Thread.sleep(2000);
		WebElement description = driver.findElement(By.xpath("//h3[.=\" Product details \"]"));
		boolean b2 = description.isDisplayed();
		Assert.assertTrue(b2);

	}
}
