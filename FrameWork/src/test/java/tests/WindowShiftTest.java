package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AlertsAndModals;
import pages.InputFormPage;
import pages.MainPage;
import pages.SimpleFormPage;
import pages.WindowShift;
import util.ReportUtil;
import util.ScreenshotUtil;

public class WindowShiftTest extends DriverIntializer {
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	AlertsAndModals alert;
	WindowShift window;
	String expected="Obsqura Zone ";
	ScreenshotUtil screen;
	 
	@BeforeMethod
	public void run(){
		 driver=getdriver();
		}
	
	@Test
	public void windowVerify() throws IOException {
		main=new MainPage(driver);
		main.alertclick();
		alert=new AlertsAndModals(driver);
		alert.windowpopupclick();
	    window=new WindowShift(driver);
	    window.buttonclick();
	   window.closebuttonclick();
	   String heading= window.headingcheck();
	   Assert.assertEquals(heading,expected);
	   System.out.println(heading);
	   screen=new ScreenshotUtil();
	   screen.Screenshot(driver,"WindowScreenshot");
	   }
	
	}


