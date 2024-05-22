package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.WaitUtil;

public class WindowShift {
	WebDriver driver; 
	
	public  WindowShift (WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Follow @obsqurazone on Facebook']")
	 WebElement facebookbutton;
	@FindBy(xpath="//div[@aria-label='Close' and @role='button']")
	 WebElement closebutton;
	@FindBy(xpath="//h1[contains(text(),'Obsqura Zone')]")
	 WebElement heading;
	WaitUtil wait;
	 
	 public void buttonclick(){
	       facebookbutton.click();
	       String parentWindow = driver.getWindowHandle(); 
		   Set<String> WindowHandlesss= driver.getWindowHandles() ; 
			for (String childWindow : WindowHandlesss) { 
				if (!parentWindow.equals(childWindow)) { 
					driver.switchTo().window(childWindow);
			}
			}
	 }
	
	 public void closebuttonclick() {
		 
		 wait=new WaitUtil(driver);
		 wait.waitForElementToBeVisible(driver,By.xpath("//div[@aria-label='Close' and @role='button']"));
		 wait.waitForElementToBeVisible(driver, closebutton);
		 closebutton.click();
	 }
	 public String headingcheck() {
		 return heading.getText();
		 
	 }
	 
	 
	 
		

}
