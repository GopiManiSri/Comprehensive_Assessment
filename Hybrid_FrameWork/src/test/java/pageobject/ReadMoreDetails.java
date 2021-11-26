package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadMoreDetails {

	WebDriver driver;
	By readMore = By.xpath("//*[@id='more']");
	public ReadMoreDetails(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getReadMore()
	{
		return driver.findElement(readMore);
	}
	
}
