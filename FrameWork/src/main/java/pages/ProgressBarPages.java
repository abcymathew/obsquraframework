package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgressBarPages {
	WebDriver driver ;
	By JQuery=By.xpath("//a[text()='JQuery UI Progress']");
	
	public ProgressBarPages (WebDriver driver )
	{
		this. driver = driver;
	}
	
	public void JQueryclick()
	{
		driver.findElement(JQuery).click();
	}

}
