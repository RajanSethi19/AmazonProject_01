package Amazon_Project_01;

import org.junit.Assert;
import org.testng.annotations.Test;

import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;

public class Login_With_Valid_Cred_Testcase extends Launch_Quit {


	@Test
	public void login_Success() throws InterruptedException {
		HomePage hm = new HomePage(driver);
		hm.accountlist(driver);
		Thread.sleep(2000);
		hm.signin();

		LoginPage l1 = new LoginPage(driver);
		l1.un();
		l1.cnt();
		l1.pwd();
		l1.signin();
		
		
	Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and"
				+ " More - Amazon.in");
		System.out.println("LOGIN PASSED");
	
	}
	
	
	
	

}
