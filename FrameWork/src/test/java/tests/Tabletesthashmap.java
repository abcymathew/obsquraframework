package tests;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverIntializer;
import pages.DynamicTableHashmap;
import pages.DynamicTablePage;
import pages.MainPage;
import pages.TablePage;
import util.ExcelUtil;
import util.ScreenshotUtil;

public class Tabletesthashmap extends DriverIntializer {
	WebDriver driver;
    DriverIntializer intial;
	MainPage main;
	TablePage table;
	ExcelUtil excel;
	DynamicTableHashmap dynamictablehashmap;
	String excelname,excelage,excelsalary,excelposition,exceloffice,excelstartday;
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
	public void tablehashmapVerify() throws IOException {
		main=new MainPage(driver);
		main.tableclick();
		table=new TablePage(driver);
		table.tableclick();
		dynamictablehashmap=new DynamicTableHashmap(driver);
		Map<String,String> tabledata=dynamictablehashmap.tabledata();
		System.out.println(tabledata);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(tabledata.get("position"),excelposition);
		soft.assertEquals(tabledata.get("office"),exceloffice);
		soft.assertEquals(tabledata.get("age"),excelage);
		soft.assertEquals(tabledata.get("date"),excelstartday);
		soft.assertEquals(tabledata.get("salary"),excelsalary);
		screen=new ScreenshotUtil();
		screen.Screenshot(driver,"TablehashmapScreenshot");
		soft.assertAll();
	}

}
