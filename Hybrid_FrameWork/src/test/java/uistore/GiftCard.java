package uistore;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import pageobject.GiftCardDetails;
public class GiftCard extends ReadPropertyFile {
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
		public void giftCard() throws InterruptedException {

			GiftCardDetails gc = new GiftCardDetails(driver);
			
			driver.get(p.getProperty("url"));
			Thread.sleep(3000);
			log.info("navigation to url");
			
			Thread.sleep(3000);
			gc.getGifCard().click();
			Thread.sleep(3000);
			gc.getCard().click();
			Thread.sleep(2000);
			gc.getCardCost().click();
			Thread.sleep(3000);
			gc.getNailPolish().click();
			Thread.sleep(4000);
			gc.getMagicDecal().click();
			Thread.sleep(2000);
			gc.getAddToCart().click();
			Thread.sleep(3000);
			System.out.println("The Total Bill in Cart is "+gc.getTotalBill().getText());
			gc.getHome().click();
			Thread.sleep(2000);

		}
		
		  
}
