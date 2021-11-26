package uistore;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ScrollForElementDetails;
import reusablecomponents.ReadPropertyFile;

public class ScrollForElement extends ReadPropertyFile {

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
		System.out.println("Running Scroll For Element");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		ScrollForElementDetails s = new ScrollForElementDetails(driver);
		
		s.getNew().click();
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", s.getElement());
		System.out.println("Element Found");
		s.getElement().click();
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(5000);
	}

}
