package Amazon_Project_01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;

public class Your_Order_Testcase extends Launch_Quit {
	
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
		Thread.sleep(2000);
		hm.accountlist(driver);
		Thread.sleep(2000);
		hm.myAccount();
	}
}
