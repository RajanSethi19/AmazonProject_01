package Amazon_Project._01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Each_Payment_Method {
	ChromeDriver driver;
	@FindBy(xpath = "//input[@value=\"SelectableAddCreditCard\"]")
	WebElement address1;
	
	@FindBy(xpath = "//input[@value=\"instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false\"]")
	WebElement address2;
	@FindBy(xpath = "//div[@aria-label=\"Other UPI Apps\"]//input")
	WebElement address3;
	@FindBy(xpath = "//input[@value=\"instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false\"]")
	WebElement address4;
	
	public void address01() {
		address1.click();
	}
	public void addrees02() {
		address2.click();
	}
	public void addrees03() {
		address3.click();
	}
	public void addrees04() {
		address4.click();
	}
	
	
	public Each_Payment_Method(ChromeDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	

}
