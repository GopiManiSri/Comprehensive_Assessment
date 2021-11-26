package uistore;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ReadMoreDetails;
import reusablecomponents.ReadPropertyFile;

public class ReadMore extends ReadPropertyFile{

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
	public void Scrolling() throws InterruptedException {
		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		log.info("navigation to url");

		
		System.out.println("Running Read More Page");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		ReadMoreDetails r = new ReadMoreDetails(driver);
		js.executeScript("arguments[0].scrollIntoView();", r.getReadMore());
		r.getReadMore().click();
		Thread.sleep(5000);
		System.out.println("Clicked on Read More");
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-350)", "");
		
		
	}
}
