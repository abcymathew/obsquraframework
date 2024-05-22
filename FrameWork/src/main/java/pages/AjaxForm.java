package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.WaitUtil;

public class AjaxForm {
	WebDriver driver; 
	WaitUtil waitutil;
	public  AjaxForm (WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver,this);
	}
	   @FindBy(id="subject")
	   WebElement subjecttext;
	   @FindBy(id="description")
	   WebElement descritiontext;
	   @FindBy(xpath="//div[contains(text(),'Form has been submitted successfully!')]")
	   WebElement stringcheck;
	   @FindBy(xpath="//input[@value='Submit']")
       WebElement ajaxsubmit;
       
       public void ajaxsubjectclick(String value){
    	   subjecttext.click();
    	   subjecttext.clear(); 
           subjecttext.sendKeys(value);
    	   subjecttext.sendKeys(Keys.TAB);
    	  }
       public void ajaxdescriptionclick(String text){
    	   descritiontext .click();
    	   descritiontext.clear(); 
    	   JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
    	   javascriptExecutor.executeScript("document.getElementById('description').value='"+text+"'"); 
          }
     
       public void submitclick() {
    	   ajaxsubmit.click();
         }
       public String stringcheckclick() {
    	   waitutil=new WaitUtil(driver);
    	   waitutil.fluentwait(stringcheck,"Form has been submitted successfully!");
    	  return stringcheck.getText();
    	  }
       
     

}

