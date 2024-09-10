package Amazon_Project._01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoupancodePage {
	
	ChromeDriver driver;
	
	
	@FindBy(xpath="//input[@placeholder=\"Enter Code\"]")
	WebElement coupancodeenter;
	
	public void code() {
		coupancodeenter.sendKeys("Rajan123");
	}
	
	public CoupancodePage (ChromeDriver driver){
		
		PageFactory.initElements(driver, this);
	}

}
