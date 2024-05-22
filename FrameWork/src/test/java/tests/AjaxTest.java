package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AjaxForm;
import pages.InputFormPage;
import pages.MainPage;
import util.RetryAnalyser;
import util.ScreenshotUtil;

public class AjaxTest extends DriverIntializer{
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	InputFormPage input;
	AjaxForm ajax;
	ScreenshotUtil screen;
	static String expected="Form has been submitted successfully!";
	 
        @BeforeMethod
		public void run(){
			 driver=getdriver();
			}
		
		@Test(retryAnalyzer=RetryAnalyser.class)
		public void ajaxVerify() throws IOException{
			main=new MainPage(driver);
			main.inputclick();
			input=new InputFormPage(driver);
			input.ajaxformsubmitclick();
			ajax=new AjaxForm(driver);
			ajax.ajaxsubjectclick("computer");
			String text = "helo im abcy mathew";
			ajax.ajaxdescriptionclick(text);
			ajax.submitclick();
			String check=ajax.stringcheckclick();
			System.out.println(check);
			Assert.assertEquals(check,expected);
			screen=new ScreenshotUtil();
			screen.Screenshot(driver,"AjaxScreenshot");
			}
}
