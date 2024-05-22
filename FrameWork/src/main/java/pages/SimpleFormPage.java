package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage {
	WebDriver driver;
    
	public SimpleFormPage(WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    
	@FindBy(id="single-input-field")
	WebElement entermessage;
	@FindBy(id="button-one")
	WebElement showmessage ;
	@FindBy(id="message-one")
	WebElement yourmessage  ;
	@FindBy(id="value-a")
    WebElement entervalueA;
	@FindBy(id="value-b")
    WebElement entervalueB;
    @FindBy(id="button-two")
    WebElement GetTotal;
    @FindBy(id="message-two")
    WebElement TotalValue;
	
   
	
    public String entermessagemethod(String message){
		entermessage.clear();
		entermessage.sendKeys(message);
		return message;
	}
	
    public void buttonclick(){
		showmessage.click();
	}
	
    public String getenteredtext(){
		return yourmessage.getText();
	}
	 
   public String checkTotal(String a,String b){
        entervalueA.sendKeys(a);
        entervalueB.sendKeys(b);
        GetTotal.click();
        String total=GetTotal.getText();
        return total; 
      
     }
  
    public String getValue(){
     
      return TotalValue.getText();
      
   }

}
	

