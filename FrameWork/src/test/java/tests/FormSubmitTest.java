package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.FormSubmit;
import pages.InputFormPage;
import pages.MainPage;
import util.ScreenshotUtil;

public class FormSubmitTest extends DriverIntializer {
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	InputFormPage input;
	 FormSubmit form;
	 ScreenshotUtil screen;
	 static String expected="Form has been submitted successfully!";
	 @BeforeMethod
		public void run(){
			 driver=getdriver();
			}
		
		@Test
		public void FormVerify() throws IOException{
			main=new MainPage(driver);
			main.inputclick();
			input=new InputFormPage(driver);
			input.formsubmitclick();
			form=new FormSubmit(driver);
			form.enterfirstname("abcy");
			form.enterlastname("mathew");
			form.enterusername("@abcy");
			form.entercity("anakkara");
			form.enterstate("kerala");
			form.enterzip("685515");
			String label=form.getlabel();
		    form.buttonclick();
			form.formsubmitbuttonclick();
			String text=form.getformtext();
			Assert.assertEquals(text, expected);
			screen=new ScreenshotUtil();
			screen.Screenshot(driver,"FormScreenshot");
			
		}
		
	 

}
