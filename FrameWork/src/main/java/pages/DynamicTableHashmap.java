package pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicTableHashmap {
WebDriver driver;
    
	public DynamicTableHashmap(WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='Ashton Cox']")
	 WebElement rowname;
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='Junior Technical Author']")
	 WebElement rowposition;
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='San Francisco']")
	 WebElement rowoffice;
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='66']")
	 WebElement rowage;
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='2009/01/12']")
	 WebElement rowdate;
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/child::tr/child::td[text()='$86,000']")
	 WebElement rowsalary;
	
	public Map<String,String>tabledata(){
		Map<String,String>datamap=new HashMap<>();
		datamap.put("position", rowposition.getText());
		datamap.put("office", rowoffice.getText());
		datamap.put("age", rowage.getText());
		datamap.put("date", rowdate.getText());
		datamap.put("salary", rowsalary.getText());
		return datamap;
		}
	

}
