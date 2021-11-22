package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import reusablecomponents.ReadPropertyFile;

public class TakeScreenShot extends ReadPropertyFile{

//	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	public void getScreenshot(String result) 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("D:\\Selenium\\comprehensive_Assessment\\Hybrid_FrameWork\\ScreenShot\\"+result+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
