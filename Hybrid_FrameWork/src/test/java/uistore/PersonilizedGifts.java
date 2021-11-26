package uistore;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import pageobject.PersonilizedGiftDetails;

public class PersonilizedGifts extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	 @AfterTest
	 public void close() {
	  
	  driver.close(); driver = null;
	  
	  }
	@Test
	public void PersonalizedGift() throws InterruptedException {
		
		
		
		driver.get(p.getProperty("url"));
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");	
		System.out.println("Running Personlized Page");
	
	  PersonilizedGiftDetails p=new PersonilizedGiftDetails(driver);
	  p.getPgifts().click();
	  p.getFeatures().click();
	  Thread.sleep(3000);
	  p.getBest().click();
	 
	  Assert.assertEquals( p.getBook().getText(), "Personalized Moon Lamp - COD Not Available");
	  log.info("Assertion passed");
	  Thread.sleep(2000);
	  
	  
	}
	
	

}