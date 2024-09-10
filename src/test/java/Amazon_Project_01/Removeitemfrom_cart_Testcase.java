package Amazon_Project_01;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Amazon_Project._01.CartPage;
import Amazon_Project._01.Child_Page;
import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;
import Amazon_Project._01.RemoveItemfrom_cart;

public class Removeitemfrom_cart_Testcase extends Launch_Quit {
	@Test
	public void remove_item_from_cart() throws InterruptedException {

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
		CartPage ca = new CartPage(driver);
		ca.addtocart();
		ca.gotocart();
		WebElement checkout = driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]"));
		boolean b1 = checkout.isDisplayed();
		Assert.assertTrue("WE REACHED TO CART PAGE NOW", b1);
		Thread.sleep(3000);

		/*
		 * WebElement dropdown_qty= driver.findElement(By.id("a-autoid-0-announce"));
		 * dropdown_qty.click();
		 */
		RemoveItemfrom_cart r = new RemoveItemfrom_cart(driver);
		r.dropdown_item();
		List<WebElement> inc = driver.findElements(By.xpath("//div[@class=\"a-popover-inner\"]/ul//li/a"));
		for (WebElement value : inc) {

			if (value.getText().contains("3")) {
				Thread.sleep(2000);
				System.out.println(value.getText());
				value.click();
				Thread.sleep(2000);
				break;

			
		}
	

		
	
	}
		r.remove();

}
	}
