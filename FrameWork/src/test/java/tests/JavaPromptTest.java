package tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AlertsAndModals;
import pages.JavaScriptPromptAlert;
import pages.MainPage;
import pages.WindowShift;

import util.ReportUtil;
import util.RetryAnalyser;
import util.ScreenshotUtil;
import util.WaitUtil;
import util.propertyReaderUtil;

public class JavaPromptTest extends DriverIntializer{
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	AlertsAndModals alert;
	JavaScriptPromptAlert script;
	ScreenshotUtil screen;
	
	 @BeforeMethod
	public void run(){
		 driver=getdriver();
		}
	
	@Test(retryAnalyzer=RetryAnalyser.class)
	public void promptVerify() throws IOException {
		main=new MainPage(driver);
		main.alertclick();
		alert=new AlertsAndModals(driver);
		alert.javascriptclick();
	    script=new JavaScriptPromptAlert(driver);
	    script.firstbuttonclick();
	    String text=script.firstalerttext();
	    System.out.println(text);
	    String expectedtext=propertyReaderUtil.getproperty("expected");
	    Assert.assertEquals(text,expectedtext);
	    script.firstalertaccept();
	    script.promptbuttonclick();
	    script.promptsendkeys("abcy");
	    script.promptaccept();
	    screen=new ScreenshotUtil();
		screen.Screenshot(driver,"PromptScreenshot");
		}
	
	}


