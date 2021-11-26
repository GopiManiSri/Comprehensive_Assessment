package uistore;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import pageobject.GiftsPageDetails;

public class Gifts extends ReadPropertyFile{
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
	public void GiftHover() throws InterruptedException {
		
		
		
		driver.get(p.getProperty("url"));
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");
		System.out.println("Running Gifts Page");	
		
		
		GiftsPageDetails g=new GiftsPageDetails(driver);
		Actions action = new Actions(driver);

		action.moveToElement(g.getGifts()).perform();
		Thread.sleep(4000);
		g.getPremium().click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}
		
		

	}
