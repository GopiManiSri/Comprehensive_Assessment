package uistore;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import pageobject.WishListDetails;

public class WishList extends ReadPropertyFile {

	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void giftCard() throws InterruptedException {

		WishListDetails wl = new WishListDetails(driver);

		driver.get(p.getProperty("url"));
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");

		wl.getSanta().click();
		wl.getGift().click();
		Thread.sleep(2000);
		wl.getWishList().click();
		// Thread.sleep(3000);
		// wl.getClose().click();
		wl.getWishIcon().click();
		Thread.sleep(3000);
		wl.getAccess().click();
		Thread.sleep(3000);
		wl.getAdd().click();
		System.out.println("Gift Added to Cart Successfully!!!!!!!");
		Thread.sleep(2000);

	}

	@AfterTest
	public void close() {

		driver.close();
		driver = null;
	}

}
