package Amazon_Project._01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveItemfrom_cart {
	@FindBy(id="a-autoid-0-announce")
	WebElement drpdown;
	
	@FindBy(xpath="(//input[@value=\"Delete\"])[1]")
	WebElement delete;
	public void dropdown_item() {
		drpdown.click();
	}
	public void remove() {
		delete.click();
	}
	
	public RemoveItemfrom_cart(ChromeDriver driver){
		PageFactory.initElements(driver, this);
		
	}

}
