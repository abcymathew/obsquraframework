package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.InputFormPage;
import pages.MainPage;
import pages.RadioButtonPage;
import util.RetryAnalyser;
import util.ScreenshotUtil;

public class RadioButtonTest extends DriverIntializer {
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	InputFormPage input;
	RadioButtonPage radio;
	ScreenshotUtil screen;
	static String expected="Radio button 'Male' is checked";
	 
		@BeforeMethod
		public void run(){
			 driver=getdriver();
			}
		
		@Test(retryAnalyzer=RetryAnalyser.class)
		public void radioVerify() throws IOException{
			main=new MainPage(driver);
			main.inputclick();
			input=new InputFormPage(driver);
			input.radioclick();
			radio=new RadioButtonPage(driver);
			radio.radiobuttondemoclick();
			radio.genderselect();
			String text=radio.getradiotext();
			Assert.assertEquals(text,expected);
			screen=new ScreenshotUtil();
			screen.Screenshot(driver,"RadioScreenshot");
			
		}
		
	

}
