package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeLifeStyleDetails {

	WebDriver driver;
	By lifestyle = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[11]/a");
	By clocks = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[11]/ul/li[8]/a");
	By ltoh = By.xpath("//*[@id='sortBy']");
	By item = By.xpath("//*[@id='CollectionAjaxContent']/div/div[14]/div/a/div[1]");
	By qty = By.xpath("//*[@id='AddToCartForm-2105178030168']/div[2]/div/span[1]");

	By pc = By.xpath("//*[@id='PostalCode']");
	By check = By.xpath("//*[@id='cod-cheker']/button");
	By text = By.xpath("//*[@id='PostalCodeCheckerAvailability']");

	public HomeLifeStyleDetails(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getlifestyle() {
		return driver.findElement(lifestyle);
	}

	public WebElement getclocks() {
		return driver.findElement(clocks);
	}

	public WebElement getltoh() {
		return driver.findElement(ltoh);
	}

	public WebElement getitem() {
		return driver.findElement(item);
	}

	public WebElement getqty() {
		return driver.findElement(qty);
	}

	public WebElement getpincode() {
		return driver.findElement(pc);
	}

	public WebElement getcheck() {
		return driver.findElement(check);
	}

	public WebElement gettext() {
		return driver.findElement(text);
	}

}
