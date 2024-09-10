package Amazon_Project._01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//step 1
		ChromeDriver driver;
		@FindBy(id="nav-link-accountList")
		WebElement accountandlist;
	
		@FindBy(id="nav_prefetch_yourorders")
		WebElement yourorder;;
		
		
		
		@FindBy(xpath="(//span[.='Sign in'])[1]")
		WebElement signinbutton;
		
		@FindBy(id="twotabsearchtextbox")
		WebElement serach_tf;
		
		@FindBy(xpath="(//a[.=\"Start here.\"])[1]")
		WebElement start_here;
		@FindBy(xpath="//span[.=\"Your Account\"]")
		WebElement my_account;
		
	 //step 2	
		public void accountlist(ChromeDriver driver)
		{
			Actions a1=new Actions(driver);
			a1.moveToElement(accountandlist).perform();
			
		}

		public void yourorder() {
			yourorder.click();
			
		}
		public void signin()
		{
			signinbutton.click();
		}
		public void search()
		{
			
			serach_tf.sendKeys("shoe"+Keys.ENTER);
		}
		public void registration_start()
		{
			start_here.click();
			
		}
		public void myAccount()
		{
			my_account.click();
			
		}
		
		//step 3
		public HomePage(ChromeDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
}
