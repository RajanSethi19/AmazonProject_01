package Amazon_Project._01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Your_ORDERS {
	
	ChromeDriver driver;
	@FindBy(id="nav_prefetch_yourorders")
	WebElement yourorder;;
	
	public void yourorder() {
		yourorder.click();
		
	}
	
	

}
