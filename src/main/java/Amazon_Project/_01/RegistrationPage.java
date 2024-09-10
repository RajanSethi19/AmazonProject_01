package Amazon_Project._01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	ChromeDriver driver;
	@FindBy(name="email")
	WebElement username;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(id = "ap_customer_name")
	WebElement user;
	@FindBy(id = "ap_phone_number")
	WebElement ph_no;
	@FindBy(id = "ap_password")
	WebElement pass;
	@FindBy(id = "continue")
	WebElement cont;
	
	public void un()
	{
		username.sendKeys("9416275759");
	}

	public void cnt()
	{
		continue_button.click();
	}
	public void user_name() {

		user.sendKeys("Rajan");
	}

	public void Phone_no() {

		ph_no.sendKeys("9996464204");
	}

	public void Password() {

		pass.sendKeys("Rajan@1991");
	}

	public void continue_now() {

		cont.click();
	}

	public RegistrationPage( ChromeDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


}
