package Amazon_Project_01;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Project._01.HomePage;
import Amazon_Project._01.RegistrationPage;

public class Registration_Testcase extends Launch_Quit {

	@Test

	public void Registration_New() throws InterruptedException {

		HomePage hm = new HomePage(driver);
		hm.accountlist(driver);
		hm.registration_start();
		RegistrationPage r = new RegistrationPage(driver);
		Thread.sleep(2000);
		r.user_name();
		r.Phone_no();
		r.Password();
		//r.continue_now();
		/*
		 * String title = driver.getTitle(); Assert.assertEquals("title",
		 * "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - "
		 * + "Amazon.in", "SUCCESSFULLY LOGIN");
		 */

	}

	@Test
	public void login_success() {

	}

}
