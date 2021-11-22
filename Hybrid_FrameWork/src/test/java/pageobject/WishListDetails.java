package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListDetails {

	public WebDriver driver;

	By santaGift = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[5]/a");
	By gift = By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[1]/div/a");
	By wishList = By
			.xpath("//*[@id='ProductSection-6783747686598']/div/div/div[1]/div[2]/div/div[1]/div[1]/div/button");
	By close = By.xpath("//*[@id='swym-close-notification-button']");
	By wishIcon = By.xpath("//*[@id='myheader']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[2]/span");
	By access = By.xpath("//*[@id='swym-welcome-button']");
	By add = By.xpath("//div[@class='swym-add-to-cart swym-background-color swym-loader']");

	public WishListDetails(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getSanta() {
		return driver.findElement(santaGift);
	}

	public WebElement getGift() {
		return driver.findElement(gift);
	}

	public WebElement getWishList() {
		return driver.findElement(wishList);
	}

	public WebElement getClose() {
		return driver.findElement(close);
	}

	public WebElement getWishIcon() {
		return driver.findElement(wishIcon);
	}

	public WebElement getAccess() {
		return driver.findElement(access);
	}

	public WebElement getAdd() {
		return driver.findElement(add);
	}

}
