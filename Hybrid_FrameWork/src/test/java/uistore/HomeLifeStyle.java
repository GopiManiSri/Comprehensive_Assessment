package uistore;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import pageobject.HomeLifeStyleDetails;

public class HomeLifeStyle extends ReadPropertyFile {
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
	public void homeLifeStyle() throws InterruptedException {
		HomeLifeStyleDetails l = new HomeLifeStyleDetails(driver);

		driver.get(p.getProperty("url"));
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");
		System.out.println("Running Home Life Style Page");
		Actions action = new Actions(driver);

		action.moveToElement(l.getlifestyle()).perform();
		Thread.sleep(5000);
		l.getclocks().click();
		Thread.sleep(2000);
		Select s = new Select(l.getltoh());
		s.selectByIndex(5);
		l.getitem().click();
		l.getqty().click();
		l.getpincode().sendKeys("500079");
		Thread.sleep(3000);
		l.getcheck().click();
		Thread.sleep(5000);
		System.out.println(l.gettext().getText());
		Thread.sleep(2000);

	}

	

}
