package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverIntializer;
import pages.DynamicTablePage;
import pages.MainPage;
import pages.ProgressBarPages;
import pages.TablePage;
import util.ExcelUtil;
import util.ScreenshotUtil;

public class TableTest extends DriverIntializer {
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	TablePage table;
	ExcelUtil excel;
	DynamicTablePage dynamictable;
	String excelname,excelage,excelsalary,excelposition,exceloffice,excelstartday;
	int rownumber;
    String filename="Book1.xlsx";
    String sheetname="sheet1";
    ScreenshotUtil screen;
	
	@BeforeMethod
	public void run(){
		 driver=getdriver();
		}
	
	@Test(priority=1)
	public void getvaluesfromexcel() throws IOException{
		excel=new ExcelUtil(filename,sheetname);
		excelname=excel.readStringData(1, 0);
		excelposition=excel.readStringData(1, 1);
		exceloffice=excel.readStringData(1, 2);
	    excelage=excel.readStringData(1, 3);
		excelstartday=excel.readStringData(1, 4);
		excelsalary=excel.readStringData(1, 5);
		
}
	@Test(priority=2)
	public void tableVerify() throws IOException {
		main=new MainPage(driver);
		main.tableclick();
		table=new TablePage(driver);
		table.tableclick();
		dynamictable=new DynamicTablePage(driver);
		rownumber=dynamictable.rownumberselected(excelname);
		String tableposition=dynamictable.getcurrentposition(rownumber);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(tableposition,excelposition);
	    String tableoffice=dynamictable.getcurrentoffice(rownumber);
		soft.assertEquals(tableoffice,exceloffice);
        String tableage=dynamictable.getcurrentage(rownumber);
		soft.assertEquals(tableage,excelage);
        String tablestartdate=dynamictable.getstartdate(rownumber);
 		soft.assertEquals(tablestartdate,excelstartday);
  		String tablesalary=dynamictable.getsalary(rownumber);
        soft.assertEquals(tablesalary,excelsalary);
        screen=new ScreenshotUtil();
		screen.Screenshot(driver,"TableScreenshot");
		soft.assertAll();
   		}
	
	
	}
	
	

