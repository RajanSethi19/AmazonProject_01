package Amazon_Project._01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//step 1
		ChromeDriver driver;
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(id="continue")
		WebElement continue_button;
		@FindBy(id="ap_password")
		WebElement password;;
		
		@FindBy(id="signInSubmit")
		WebElement signin_button;
	 //step 2	
		public void un()
		{
			username.sendKeys("9996464204");
		}
		public void cnt()
		{
			continue_button.click();
		}
		public void pwd()
		{
			                                                                                                                                          password.sendKeys("Rajan@1991");
		}
		public void worng_pwd()
		{
			                                                                                                                                          password.sendKeys("Rajan@123");
		}
		public void signin()
		{
			signin_button.click();
		}
		//step 3
		public LoginPage (ChromeDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
