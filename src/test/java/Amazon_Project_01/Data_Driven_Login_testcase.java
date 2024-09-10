package Amazon_Project_01;

import java.io.IOException;

import org.testng.annotations.Test;

import Amazon_Project._01.HomePage;
import Amazon_Project._01.Login_datadriven_page;
import Utilities.Data_Driven;
public class Data_Driven_Login_testcase extends Launch_Quit{
	
	@Test
	public void login_datadriven() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		HomePage hm = new HomePage(driver);
		hm.accountlist(driver);
		hm.signin();
		
		Data_Driven c= new Data_Driven();
		c.credentials();
		Thread.sleep(2000);
		Login_datadriven_page d= new Login_datadriven_page(driver);
		Thread.sleep(2000);
		d.un1();
		d.cnt();
		//Thread.sleep(2000);
		d.pwd1();
		
		d.signin();
	}

}
