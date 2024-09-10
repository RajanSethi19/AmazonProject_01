package Amazon_Project_01;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_Project._01.CartPage;
import Amazon_Project._01.Checkout_Process;
import Amazon_Project._01.Child_Page;
import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;

@Listeners(Utilities.listeneers_now.class)
public class Checkout_process_Testcase extends Launch_Quit {
	@Test
	// (retryAnalyzer=Utilities.Retry_Analyzer.class)
	public void remove_item_from_cart() throws InterruptedException {

		HomePage home = new HomePage(driver);

		home.accountlist(driver);
		Thread.sleep(2000);
		home.signin();

		LoginPage login = new LoginPage(driver);
		login.un();
		login.cnt();
		login.pwd();
		login.signin();
		home.search();
		Child_Page child = new Child_Page(driver);
		child.product_select();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> ids = s1.iterator();
		String parent_id = ids.next();
		String child_id = ids.next();
		driver.switchTo().window(child_id);
		CartPage cart = new CartPage(driver);
		cart.addtocart();
		cart.gotocart();
		Checkout_Process checkout = new Checkout_Process(driver);
		checkout.Buy();
		checkout.address();
		Thread.sleep(2000);
		checkout.usethisaddress();
		Thread.sleep(5000);
		checkout.upi();
		Thread.sleep(2000);
		checkout.inputupi();
		checkout.verify();
		Thread.sleep(5000);
		checkout.usethispayment();
		Thread.sleep(5000);
		// driver.switchTo().alert().dismiss();
		WebElement e6 = driver.findElement(By.id("prime-interstitial-nothanks-button"));
		e6.click();

		// validating as we are on review
		/*
		 * Thread.sleep(3000); WebElement placeorder =
		 * driver.findElement(By.name("placeYourOrder1"));
		 * 
		 * boolean orderplace = placeorder.isDisplayed(); Assert.assertTrue(orderplace);
		 */

	}

}
