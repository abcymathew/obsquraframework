package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	public void Screenshot(WebDriver driver,String screenshotname) throws IOException{
		String filelocation=System.getProperty("user.dir")+"\\Test_Output";
	    TakesScreenshot takesScreenshot = (TakesScreenshot)driver ; 
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(file,new File(filelocation+"\\"+screenshotname+".png"));
}
}
	
	