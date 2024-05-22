package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.WaitUtil;

public class JIQueryPage {
WebDriver driver;
WaitUtil wait;

    public JIQueryPage(WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(id="downloadButton")
	WebElement download;
   @FindBy(xpath="//button[text()='Close' and @class='ui-button ui-corner-all ui-widget']")
  	WebElement close;
   @FindBy(xpath="//button[text()='Close' and @class='ui-button ui-corner-all ui-widget']")
 	WebElement check;
   
    public void buttonclick(){
			download.click();
			wait=new WaitUtil(driver);
			wait.elementclickable(driver,check);
		}
	 public void closeclick(){
		    close.click();
		}
		

}
