package Amazon_Project._01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Information_Page {
	
	ChromeDriver driver;
	//step 1
	@FindBy(xpath="(//div[@class=\"a-column a-span9 a-span-last\"]//h2)[4]")
	WebElement edit_Address;
	@FindBy(id="ya-myab-address-edit-btn-0")
	WebElement edit;
	
	//step 2
	public void address_edit() {
		
		edit_Address.click();
	}
	public void edit() {
		
		edit.click();
	}
	
	
	
	
	
	
	
	
	
	

	//step 3
	public Edit_Information_Page(ChromeDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
}
