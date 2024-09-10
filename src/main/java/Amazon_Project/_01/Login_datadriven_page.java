package Amazon_Project._01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Data_Driven;

public class Login_datadriven_page extends Data_Driven {
    
	//step 1
			//ChromeDriver driver;
			@FindBy(name="email")
			WebElement username;
			
			@FindBy(id="continue")
			WebElement continue_button;
			@FindBy(id="ap_password")
			WebElement password;;
			
			@FindBy(id="signInSubmit")
			WebElement signin_button;
		 //step 2	
			public void un1()
			{
				username.sendKeys(username1);
			}
			public void cnt()
			{
				continue_button.click();
			}
			public void pwd1()
			{
				password.sendKeys(password1);                                                                                                                                  password.sendKeys("Rajan@1991");
			}
			
			public void signin()
			{
				signin_button.click();
			}
			//step 3
			public Login_datadriven_page (ChromeDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

}
