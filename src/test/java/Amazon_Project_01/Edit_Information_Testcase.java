package Amazon_Project_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_Project._01.Edit_Information_Page;
import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;
@Listeners(Utilities.listeneers_now.class)
public class Edit_Information_Testcase extends Launch_Quit  {
	

@Test
	
	public void edit_Info() throws InterruptedException {
		
		
		HomePage hm = new HomePage(driver);
		hm.accountlist(driver);
		Thread.sleep(3000);
		hm.signin();

		LoginPage l1 = new LoginPage(driver);
		l1.un();
		l1.cnt();
		l1.pwd();
		l1.signin();
		hm.accountlist(driver);
		hm.myAccount();
		Edit_Information_Page e= new Edit_Information_Page(driver);
		e.address_edit();
		e.edit();
		WebElement edit=driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
		
		boolean b=edit.isEnabled();
		
		Assert.assertTrue(b);
		
		
	}


}
