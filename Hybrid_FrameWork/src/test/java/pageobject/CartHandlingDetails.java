package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartHandlingDetails {
	WebDriver driver;
	By allofit = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[12]/a");
	By item = By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[1]/div/a/div[1]");
	By addtocart = By.xpath("//*[@id='AddToCartForm-6923369087174']/button/span");
	By giftwrap = By.xpath("//*[@id='gift-wrapping']");
	By giftnote = By.xpath("//*[@id='cart-notes']");
	By from = By.xpath("//*[@id='from']");
	By to = By.xpath("//*[@id='to']");
	By message = By.xpath("//*[@id='gift-card']");
	By continueshopping = By.xpath("//*[@id='CartDrawer']/form/div[2]/div[3]/a");
	By total = By.xpath("//*[@id='CartDrawer']/form/div[2]/div[3]/div[2]/div[2]/span/span");

	public CartHandlingDetails(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAllOfIt()
	{
		return driver.findElement(allofit);
	}
	public WebElement getItem()
	{
		return driver.findElement(item);
	}
	public WebElement getAddToCart()
	{
		return driver.findElement(addtocart);
	}
	public WebElement getGiftWrap()
	{
		return driver.findElement(giftwrap);
	}
	
	public WebElement getGiftNote()
	{
		return driver.findElement(giftnote);
	}
	
	public WebElement getFromDetails()
	{
		return driver.findElement(from);
	}
	public WebElement getToDetails()
	{
		return driver.findElement(to);
	}
	public WebElement getMessage()
	{
		return driver.findElement(message);
	}
	public WebElement getContinueShopping()
	{
		return driver.findElement(continueshopping);
	}
	
	public WebElement getTotal()
	{
		return driver.findElement(total);
	}
}
