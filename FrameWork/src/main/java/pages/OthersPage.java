package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OthersPage {
	WebDriver driver ;
	By draganddrop=By.xpath("//a[contains(text(),'Drag and Drop')]");
	By dynmaicdata=By.xpath("//a[contains(text(),'Dynamic Data Loading')]");

	public OthersPage(WebDriver driver )
	{
		this. driver = driver;
	}
	
    public void draganddropclick()
	{
		driver.findElement(draganddrop).click();
	}
	public void dynamicclick()
	{
		driver.findElement(dynmaicdata).click();
	}
	

}
