package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.ErrorFormSubmit;
import pages.FormSubmit;
import pages.InputFormPage;
import pages.MainPage;
import util.ScreenshotUtil;

public class ErrorFormSubmitTest extends DriverIntializer {
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	InputFormPage input;
	ErrorFormSubmit errorform;
	ScreenshotUtil screen;
	static String expected="You must agree before submitting.";
	 @BeforeMethod
		public void run(){
			 driver=getdriver();
			}
		
		@Test
		public void errorVerify() throws IOException{
			main=new MainPage(driver);
			main.inputclick();
			input=new InputFormPage(driver);
			input.formsubmitclick();
			errorform=new ErrorFormSubmit(driver);
			errorform.enterfirstname("abcy");
			errorform.enterlastname("mathew");
			errorform.enterusername("@abcy");
			errorform.entercity("anakkara");
			errorform.enterstate("kerala");
			errorform.enterzip("685515");
			errorform.formsubmitbuttonclick();
			String text=errorform.verifytexterror();
			Assert.assertEquals(text, expected);
			screen=new ScreenshotUtil();
			screen.Screenshot(driver,"ErrorFormSubmitScreenshot");
		}

}
