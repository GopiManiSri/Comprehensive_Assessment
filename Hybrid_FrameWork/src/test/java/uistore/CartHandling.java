package uistore;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.CartHandlingDetails;
import reusablecomponents.ReadPropertyFile;

public class CartHandling extends ReadPropertyFile {
	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	 @AfterTest
	 public void close() {
	  
	  driver.close(); driver = null;
	  
	  }
	@Test
	public void cart() throws InterruptedException {
		CartHandlingDetails a = new CartHandlingDetails(driver);
		System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
		ChromeOptions options = new ChromeOptions();
		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		log.info("navigation to url");
		System.out.println("Running CartHandling Page");
		a.getAllOfIt().click();
		a.getItem().click();
		Thread.sleep(2000);
		a.getAddToCart().click();
		log.info("successfully added to cart");
		Thread.sleep(8000);
		options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		a.getGiftWrap().click();
		a.getGiftNote().click();
		Thread.sleep(2000);
		a.getFromDetails().sendKeys("Gopi");
		a.getToDetails().sendKeys("Mindtree");
		a.getMessage().sendKeys("Christmas Gift");
		Thread.sleep(2000);
		System.out.println(a.getTotal().getText());

		a.getContinueShopping().click();
		ChromeOptions options1 = new ChromeOptions();
		options1.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		a.getAllOfIt().click();
		Thread.sleep(2000);
	}

	
	
}
