package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TablePage {
	WebDriver driver ;
	By tablepagination=By.xpath("//a[@href='table-pagination.php' and @class='nav-link']");
	public TablePage(WebDriver driver )
	{
		this. driver = driver;
	}
	
	
	public void  tableclick()
	{
		driver.findElement(tablepagination).click();
	}

}
