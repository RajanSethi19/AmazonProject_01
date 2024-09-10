package Amazon_Project_01;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Project._01.CartPage;
import Amazon_Project._01.Checkout_Process;
import Amazon_Project._01.Child_Page;
import Amazon_Project._01.Each_Payment_Method;
import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;

public class Each_Payment_Method_Testcase extends Launch_Quit{
	

	@Test
	//(retryAnalyzer=Utilities.Retry_Analyzer.class)
	public void remove_item_from_cart() throws InterruptedException  {

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
		Each_Payment_Method e1= new Each_Payment_Method (driver);
		e1.address01();
		Thread.sleep(2000);
		e1.addrees02();
		Thread.sleep(2000);
		e1.addrees03();
		Thread.sleep(2000);
		e1.addrees04();
		
		
	}
	}

