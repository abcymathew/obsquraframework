package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {
	WebDriver driver; 
	
	public  RadioButtonPage(WebDriver driver)
	{
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Radio Buttons Demo']")
	 WebElement radioformdemo;
	
	 @FindBy(id="inlineRadio1")
	 WebElement radiobuttonmale;
	 
	 @FindBy(id="button-one")
	 WebElement showselectedvalue;
	
	 @FindBy(id="message-one")
	 WebElement message;
	
	 public void radiobuttondemoclick()
	 {
		 radioformdemo.click();
		radiobuttonmale.click();
	 }
	 public void genderselect() {
		 
	showselectedvalue.click();
	 }
	public String getradiotext(){
		return message.getText();
	}
	 
	
}

	


