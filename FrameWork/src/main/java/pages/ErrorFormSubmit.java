package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErrorFormSubmit {
WebDriver driver;
    
	public ErrorFormSubmit(WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    
	@FindBy(id="validationCustom01")
	WebElement firstname;
	@FindBy(id="validationCustom02")
	WebElement lastname;
	@FindBy(id="validationCustomUsername")
	WebElement username;
	@FindBy(id="validationCustom03")
	WebElement city;
	@FindBy(id="validationCustom04")
	WebElement state;
	@FindBy(id="validationCustom05")
	WebElement zip;
	@FindBy(xpath="//label[@class='form-check-label']")
	WebElement checklabel;
	@FindBy(xpath="//div[contains(text(),'You must agree before submitting.')]")
	WebElement verifytext;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement formsubmit;
	
	
	 public String enterfirstname(String fname){
			firstname.clear();
			firstname.sendKeys(fname);
			return fname;
		}
	 public String enterlastname(String lname){
			lastname.clear();
			lastname.sendKeys(lname);
			return lname;
		}
	 public String enterusername(String uname){
			username.clear();
			username.sendKeys(uname);
			return uname;
		}
	 public String entercity(String cname){
			city.clear();
			city.sendKeys(cname);
			return cname;
		}
	 public String enterstate(String sname){
			state.clear();
			state.sendKeys(sname);
			return sname;
		}
	 public String enterzip(String zname){
			zip.clear();
			zip.sendKeys(zname);
			return zname;
		}
	
	 public void formsubmitbuttonclick(){
			formsubmit.click();
		}
	 public String verifytexterror(){
	      return verifytext.getText();
	      
	   }
	
	

}
