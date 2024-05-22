package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class DynamicTablePage {
WebDriver driver;
    
	public DynamicTablePage(WebDriver driver){
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//table[@id='dtBasicExample']/child::tbody/tr")
	 List<WebElement> row;
	int size;
	
    
	

	 public int rownumberselected(String name){
		 
		
		 int rowcount=row.size();
			System.out.println(rowcount);
			for(int i=1;i<=rowcount;i++)
			{
				
				String rowname=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr["+i+"]/td[1]")).getText();
				//System.out.println(name);
					if(rowname.equalsIgnoreCase(name))
					{
						size=i;
					}
					
			}
			return size;
	 }
			public String getcurrentposition(int i)
			{
				String rowposition=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr["+i+"]/td[2]")).getText();
				return rowposition;
			}
			public String getcurrentoffice(int i)
			{
				String rowoffice=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr["+i+"]/td[3]")).getText();
				return rowoffice;
			}
			public String getcurrentage(int i)
			{
				String rowage=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr["+i+"]/td[4]")).getText();
				return rowage;
			}
			public String getstartdate(int i)
			{
				String rowstartdate=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr["+i+"]/td[5]")).getText();
				return rowstartdate;
			}
			public String getsalary(int i)
			{
				String rowsalary=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr["+i+"]/td[6]")).getText();
				return rowsalary;
			}
}
			
						
						
						
				

			
	    

