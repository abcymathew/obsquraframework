package tests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AlertsAndModals;
import pages.DragandDrop;
import pages.JavaScriptPromptAlert;
import pages.MainPage;
import pages.OthersPage;
import util.ScreenshotUtil;

public class DragandDropTest extends DriverIntializer {
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	OthersPage other;
	DragandDrop drag;
	ScreenshotUtil screen;
	
	@BeforeMethod
	public void run(){
		 driver=getdriver();
		}
	
	@Test
	public void dragVerify()throws InvocationTargetException, IOException {
		main=new MainPage(driver);
		main.otherclick();
	    other=new OthersPage(driver);
		other.draganddropclick();
	    drag=new DragandDrop(driver);
	    drag.dragclick();
	    Boolean success=drag.dropcomplete("testing");
	    System.out.println(success);
	    screen=new ScreenshotUtil();
		screen.Screenshot(driver,"DragDropScreenshot");
	    }
}
