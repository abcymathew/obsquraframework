package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
WebDriver driver ;
	
	By InputForm=By.xpath("//a[contains(text(),'Input Form')]");
	By DatePicker=By.xpath("//a[contains(text(),'Date Pickers')]");
	By Table=By.xpath("//a[contains(text(),'Table')]");
	By progressbar=By.xpath("//a[contains(text(),'Progress Bars')]");
	By Alerts=By.xpath("//a[contains(text(),'Alerts and Modals')]");
	By Listbox=By.xpath("//a[contains(text(),'List Box')]");
	By others=By.xpath("//a[contains(text(),'Others')]");
	
	public MainPage(WebDriver driver ){
		this. driver = driver;
	}
	
	public void inputclick(){
		driver.findElement(InputForm).click();
		String s=driver.findElement(InputForm).getText();
	}
	
	public void dateclick(){
		driver.findElement(DatePicker).click();
		driver.findElement(DatePicker).getText();
	}
	
	public void tableclick(){
		driver.findElement(Table).click();
        driver.findElement(Table).getText();
	}
	
	public void progressclick(){
		driver.findElement(progressbar).click();
		driver.findElement(progressbar).getText();
	}
	
	public void alertclick(){
		driver.findElement(Alerts).click();
		driver.findElement(Alerts).getText();
	}
	
	public void listclick(){
		driver.findElement(Listbox).click();
		driver.findElement(Listbox).getText();
	}
	
	public void otherclick(){
		driver.findElement(others).click();
		driver.findElement(others).getText();
	}
      
}


