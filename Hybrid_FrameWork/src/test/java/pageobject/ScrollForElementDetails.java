package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollForElementDetails {
	WebDriver driver;
	
	By element = By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[30]/div/a/div[2]/div[1]");
	By newAdress = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[3]/a");
	
	public ScrollForElementDetails(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement()
	{
		return driver.findElement(element);
	}
	public WebElement getNew()
	{
		return driver.findElement(newAdress);
	}

	
}
