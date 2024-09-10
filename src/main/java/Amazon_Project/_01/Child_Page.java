

package Amazon_Project._01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Child_Page {
	ChromeDriver driver;
	@FindBy(xpath="(//span[@class=\"a-size-base-plus a-color-base a-text-normal\"])[2]")
	WebElement Product_selected;
	
	public void product_select() {
		
		Product_selected.click();
	}
	
	public Child_Page (ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
