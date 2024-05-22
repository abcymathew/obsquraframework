package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptPromptAlert {
WebDriver driver;
    
	public JavaScriptPromptAlert (WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement firstclick;
	@FindBy(xpath="//button[@class='btn btn-danger']")
	WebElement promptclick;
	

    public void firstbuttonclick(){
	  firstclick.click();
    }
    public String firstalerttext() {
  	  Alert a= driver.switchTo().alert(); 
  	  return a.getText();
  	}
    
    public void firstalertaccept() {
	  Alert a= driver.switchTo().alert(); 
	  a.accept(); 
	}
    public void firstalertdismiss() {
  	  Alert a= driver.switchTo().alert(); 
  	  a.dismiss();
  	}
    
    public  void promptbuttonclick(){
       promptclick.click();
    }
    public void promptsendkeys(String prompt) {
	  Alert a1= driver.switchTo().alert(); 
	  a1.sendKeys(prompt);
    }
    public void promptaccept() {
      Alert a1= driver.switchTo().alert(); 
	  a1.accept(); 
	}
    public void promptdismiss() {
      Alert a1= driver.switchTo().alert(); 
	  a1.dismiss(); 
	}
   
   
   
	
}
