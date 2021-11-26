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
import pageobject.CorporateGiftDetails;

public class CorporateGifts extends ReadPropertyFile {
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
	public void corporateGift() throws InterruptedException {

		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		log.info("navigation to url");
		System.out.println("Running Corporate Page");
		CorporateGiftDetails c = new CorporateGiftDetails(driver);
		c.getCorporate().click();
		c.getFullName().sendKeys("K.Gopi Mani Sri");
		c.getEmail().sendKeys("manisri@gmail.com");
		c.getPhone().sendKeys("7337236326");
		c.getDesc().sendKeys("this is description");
		Thread.sleep(2000);
		c.getSubmit().click();
		log.info("Submitted successfully");

	}


}