package Amazon_Project_01;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Amazon_Project._01.CartPage;
import Amazon_Project._01.Child_Page;
import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;

public class AddToCart_Testcase extends Launch_Quit {
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
		CartPage ca = new CartPage(driver);
		ca.addtocart();
		ca.gotocart();
		WebElement checkout = driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]"));
		boolean b1 = checkout.isDisplayed();
		Assert.assertTrue("WE REACHED TO CART PAGE NOW",b1);
		Thread.sleep(3000);
		
		
		WebElement dropdown_qty= driver.findElement(By.id("a-autoid-0-announce"));
		dropdown_qty.click();
		List <WebElement> inc= driver.findElements(By.xpath("//div[@class=\"a-popover-inner\"]/ul//li/a"));
		for(WebElement value:inc) {
			
			if(value.getText().contains("3")) {
				Thread.sleep(2000);
				System.out.println(value.getText());
				value.click();
				Thread.sleep(2000);
				break;
				
			}
		}
		
		/*
		 * WebElement
		 * quantity=driver.findElement(By.xpath("//span[@class=\"a-dropdown-prompt\"]"))
		 * ; String s=quantity.getText();
		 * System.out.println(("THe quantity of item is "+s)); WebElement
		 * delete=driver.findElement(By.xpath("(//input[contains(@name,\"delete\")])[1]"
		 * )); Thread.sleep(3000); delete.click(); Thread.sleep(3000);
		 * 
		 * WebElement empty_cart=driver.findElement(By.
		 * xpath("//h2[@class=\"a-size-extra-large a-spacing-mini a-spacing-top-base a-text-normal\"]"
		 * )); boolean itsempty=empty_cart.isDisplayed(); Assert.assertTrue(itsempty);
		 */
		
	}
}
