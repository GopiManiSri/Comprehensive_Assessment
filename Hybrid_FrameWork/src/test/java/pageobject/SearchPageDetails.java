package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageDetails {
	public WebDriver driver;
	
	
	By search=By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	
	public SearchPageDetails(WebDriver driver) {

 this.driver=driver;
 
}


public WebElement getSearch() {
// TODO Auto-generated method stub
return driver.findElement(search);

}

}