package uistore;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import pageobject.SearchPageDetails;

public class SearchPage  extends ReadPropertyFile {
	
	
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
	public void SearchBar() throws InterruptedException {
		
		
		
		driver.get(p.getProperty("url"));
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");	
		System.out.println("Running Search Page");
	
		
		SearchPageDetails s=new SearchPageDetails(driver);
		s.getSearch().sendKeys("New Year Gifts");
		Thread.sleep(3000);
		s.getSearch().sendKeys(Keys.ENTER);
		System.out.println("Searched Successful!!!!!");
		Thread.sleep(5000);
		
	}
	
}
