package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.JIQueryPage;
import pages.MainPage;
import pages.ProgressBarPages;
import util.ScreenshotUtil;
import util.WaitUtil;

public class JIQueryTest extends DriverIntializer {
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	ProgressBarPages progress;
	JIQueryPage query;
	WaitUtil wait;
	ScreenshotUtil screen;
	
	@BeforeMethod
	public void run(){
	driver=getdriver();
		}
	
	@Test
	public void queryVerify() throws IOException{
		main=new MainPage(driver);
		main.progressclick();
		progress=new ProgressBarPages(driver);
		progress.JQueryclick();
		query=new JIQueryPage(driver);
		query.buttonclick();
		query.closeclick();
		screen=new ScreenshotUtil();
		screen.Screenshot(driver,"queryScreenshot");
		}
}
