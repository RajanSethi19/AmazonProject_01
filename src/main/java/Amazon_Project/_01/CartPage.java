package Amazon_Project._01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {
	@FindBy(id="add-to-cart-button")
	WebElement Addtocart;
	@FindBy(linkText="Go to Cart")
	WebElement gotocart;
	
	public void addtocart() {
		 Addtocart.click();
		
	}

	public void gotocart() {
		 gotocart.click();
		
	}
	
	
	public CartPage (ChromeDriver driver){
		PageFactory.initElements(driver, this);
		
	}
}
