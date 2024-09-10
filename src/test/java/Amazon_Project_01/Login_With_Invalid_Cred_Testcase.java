package Amazon_Project_01;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;

public class Login_With_Invalid_Cred_Testcase extends Launch_Quit {
	
	@Test
	public void login_Fail() throws InterruptedException {
		HomePage hm = new HomePage(driver);
		hm.accountlist(driver);
		Thread.sleep(2000);
		hm.signin();

		LoginPage l1 = new LoginPage(driver);
		l1.un();
		l1.cnt();
		l1.worng_pwd();
		l1.signin();
		
		
	WebElement wrong_Passeord=driver.findElement(By.xpath("//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-none']//li"));
	if(wrong_Passeord.isDisplayed()==true) {
		
		System.out.println("Passord is incorrect please login with valid credentials");
	}
	
	}

}
