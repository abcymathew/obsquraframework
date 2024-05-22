package util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtil {
	public void uploadfile(String path,WebElement element)
	{
		element.sendKeys(path); 
	}
	public void uploadfilerobot(String path,WebElement element) throws AWTException
	{
		 Robot robot = new Robot(); 
		 StringSelection stringSelection = new StringSelection(path);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		 element.click();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
