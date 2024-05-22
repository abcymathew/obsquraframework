package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFormPage {
	WebDriver driver ;
	By simpleForm=By.xpath("//a[@href='simple-form-demo.php' and @class='nav-link']");
	By checkbox=By.xpath("//a[@href='check-box-demo.php']");
	By radiobutton=By.xpath("//a[@href='radio-button-demo.php']");
	By selectinput=By.xpath("//a[@href='select-input.php']");
	By formsubmitlink=By.xpath("//a[@href='form-submit.php']");
	By ajaxformsubmit=By.xpath("//a[@href='ajax-form-submit.php']");

	
	
	public InputFormPage(WebDriver driver )
	{
		this. driver = driver;
	}
	
	
	public void simpleformdemoclick()
	{
		driver.findElement(simpleForm).click();
	}
	
	public void checkboxclick()
	{
		driver.findElement(checkbox).click();
	}
	
	public void radioclick()
	{
		driver.findElement(radiobutton).click();
	}
	
	public void selectinputclick()
	{
		driver.findElement(selectinput).click();
	}
	public void   ajaxformsubmitclick()
	{
		driver.findElement(ajaxformsubmit).click();
	}
	public void   formsubmitclick()
	{
		driver.findElement(formsubmitlink).click();
	}
}
