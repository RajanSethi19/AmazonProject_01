package Amazon_Project_01;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Amazon_Project._01.CartPage;
import Amazon_Project._01.Child_Page;
import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;

public class Cart_Without_Login_Testcase extends Launch_Quit {
	@Test
	public void Product_Details() throws InterruptedException {
		
		HomePage hm = new HomePage(driver);
		hm.search();

		Child_Page c = new Child_Page(driver);
		c.product_select();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> ids = s1.iterator();
		String parent_id = ids.next();
		String child_id = ids.next();
		driver.switchTo().window(child_id);
		CartPage ca = new CartPage(driver);
		ca.addtocart();
		ca.gotocart();
		WebElement checkout = driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]"));
		boolean b1 = checkout.isDisplayed();
		Assert.assertTrue("WE REACHED TO CART PAGE NOW",b1);
		Thread.sleep(3000);
	}

}
