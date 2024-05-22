package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverIntializer;
import pages.InputFormPage;
import pages.MainPage;
import pages.SimpleFormPage;
import util.ReportUtil;
import util.ScreenshotUtil;

public class SimpleFormTest extends DriverIntializer {
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	InputFormPage input;
	SimpleFormPage simple;
	ScreenshotUtil screen;
	// ReportUtil report;
	 
	@BeforeMethod
	public void run(){
		 driver=getdriver();
		}
	
	@Test
	public void verify() throws IOException{
		main=new MainPage(driver);
		main.inputclick();
		input=new InputFormPage(driver);
		input.simpleformdemoclick();
	    simple=new SimpleFormPage(driver);
		String name=simple.entermessagemethod("abin");
		simple.buttonclick();
		String text=simple.getenteredtext();
		String expected="Your Message : "+name;
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(text,expected);
	    simple.checkTotal("5","3");
	    String totaltext=simple.getValue();
		String totalexpected=totaltext;
		soft.assertEquals(totaltext,totalexpected);
		/*report=new ReportUtil();
		report.generateReports();
		report.createTest("SimpleFormTest");
		report.logpass("pass");
		report.flush();*/
		screen=new ScreenshotUtil();
		screen.Screenshot(driver,"SimpleFormScreenshot");
	    soft.assertAll();
	}
}
	
	

