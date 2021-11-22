package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftCardDetails {
	public WebDriver driver;
	
	By giftCard= By.xpath("//*[@id='myheader']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[3]/span");
	By card = By.xpath("//*[@id='cbb-also-bought-box']/div/ul/li[1]/select");
	By cardCost = By.xpath("//*[@id='cbb-also-bought-box']/div/ul/li[1]/select/option[2]");
	By nailpolish = By.xpath("//*[@id='cbb-also-bought-box']/div/ul/li[2]/select/option[2]");
	By addToCart = By.xpath("//*[@id='cbb-also-bought-box']/div/div[2]/div/button");
	By magicDecal = By.xpath("//*[@id='42052115539']");
	By homePage = By.xpath("//*[@id='myheader']/div[1]/header/div[2]/div[2]/div[1]/div/a[1]/img[1]");
	By totalBill = By.xpath("//*[@id='CartPage']/div/form/div[5]/div/div[2]/div/div[2]/div[2]/span/span");
	public GiftCardDetails(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getGifCard() {
		return driver.findElement(giftCard);
	}
	public WebElement getCard() {
		return driver.findElement(card);
	}
	public WebElement getCardCost() {
		return driver.findElement(cardCost);
	}
	public WebElement getNailPolish() {
		return driver.findElement(nailpolish);
	}
	public WebElement getMagicDecal() {
		return driver.findElement(magicDecal);
	}
	public WebElement getAddToCart() {
		return driver.findElement(addToCart);
	}
	public WebElement getTotalBill() {
		return driver.findElement(totalBill);
	}
	public WebElement getHome() {
		return driver.findElement(homePage);
	}
}

