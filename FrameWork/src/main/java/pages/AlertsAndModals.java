package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsAndModals {
	WebDriver driver ;
	By bootstrapalert=By.xpath("//a[contains(text(),'Bootstrap Alert')]");
	By bootstrapmodal=By.xpath("//a[contains(text(),'Bootstrap Modal')]");
	By windowpopup=By.xpath("//a[contains(text(),'Window Popup')]");
	By javascript=By.xpath("//a[contains(text(),'Javascript Alert')]");


	public AlertsAndModals(WebDriver driver){
		this. driver = driver;
	}
	
	public void bootstrapalertclick(){
		driver.findElement(bootstrapalert).click();
	}
	
	public void bootstrapmodalclick(){
		driver.findElement(bootstrapmodal).click();
	}
	
	public void windowpopupclick(){
		driver.findElement(windowpopup).click();
	}
	
	public void javascriptclick(){
		driver.findElement(javascript).click();
	}

}
