package Amazon_Project._01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Checkout_Process {
	@FindBy(name = "proceedToRetailCheckout")
	WebElement Buy;

	@FindBy(xpath = "(//input[@name=\"submissionURL\"])[3]")
	WebElement address;
	
	@FindBy(xpath ="//input[@data-testid=\"Address_selectShipToThisAddress\"]")
	WebElement Use_This_Address;
	@FindBy(xpath="//div[@aria-label=\"Other UPI Apps\"]//input")
	WebElement upi;
	@FindBy(xpath = "//input[@placeholder=\"Enter UPI ID\"]")
	WebElement input_upi;
	@FindBy(name= "ppw-widgetEvent:ValidateUpiIdEvent")
	WebElement verify;
	@FindBy(name = "ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
	WebElement Use_This_Payment;

	
	public void Buy() {

		Buy.click();
	}
	public void address() {

		address.click();
	}
	public void usethisaddress() {

		Use_This_Address.click();
	}
	public void upi() {

		upi.click();
	}
	public void inputupi() {

		input_upi.sendKeys("rajansethi19-1@oksbi");
	}
	public void verify() {

		verify.click();
	}
	
	
	public void usethispayment() {

		Use_This_Payment.click();
	}
	

	public Checkout_Process(ChromeDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	

}