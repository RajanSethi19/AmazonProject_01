package Amazon_Project_01;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_Project._01.HomePage;
import Amazon_Project._01.LoginPage;

@Listeners
public class Search_Shoe extends Launch_Quit {

	@Test
	public void search_shoe() throws InterruptedException {

		HomePage hm = new HomePage(driver);
		Thread.sleep(2000);
		hm.search();
		Thread.sleep(2000);

		WebElement drp = driver.findElement(By.xpath("//span[@class=\"a-dropdown-prompt\"]"));
		drp.click();
		List<WebElement> x = driver.findElements(By.xpath("//div[@class=\"a-popover-inner\"]//ul//li"));
		for (WebElement r : x) {
			if (r.getText().contains("Avg. Customer Review")) {
				Thread.sleep(2000);
				r.click();
				Thread.sleep(2000);
				break;
			}
		}
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.contains("review")) {
			Assert.assertTrue("Passed", true);
		} else {

			Assert.assertTrue("FAILED", false);
		}

	}

}
