package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DragandDrop {
	WebDriver driver ;
	Actions action;
	
   public DragandDrop(WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver, this);
		this.action= new Actions(driver);
	}
	
	@FindBy(xpath="//div[@id='todrag']/child::span[text()='Draggable n°1']")
	WebElement sourcelementone;
	@FindBy(xpath="//span[text()='Draggable n°2']")
	WebElement sourcelementtwo;
	@FindBy(id="mydropzone")
	WebElement targetElement;
	@FindBy(id="//div[@id='mylist']/child::span")
	List<WebElement> droppedelement;
	
	public void dragclick(){
		 action.dragAndDrop(sourcelementone,targetElement).build().perform(); 
	}
	public boolean dropcomplete(String text) {
		boolean found=false;
		 for(WebElement droppeditem:droppedelement){
			 if(droppeditem.getText().equals(text)) {
				 System.out.println(droppeditem.getText());
				 found=true;
				 break;
			 }
		    	
		    }
		 return found;
		 
	}
}
