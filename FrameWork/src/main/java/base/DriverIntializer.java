package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import util.propertyReaderUtil;

public class DriverIntializer {
	public WebDriver driver; 
	//public static final String URL="https://selenium.qabible.in/index.php";
	
	 @Parameters({"browser"})
	 @BeforeClass
	public void setup(@Optional("Edge")String browser) throws IOException{
		driver = createWebDriverSession(browser);
		driver.get(propertyReaderUtil.getproperty("URL"));
		
	}
	
	 public WebDriver getdriver(){
		System.out.println(driver);
		return this.driver;
		
	}
	
	 public WebDriver createWebDriverSession(String browser) {
		// TODO Auto-generated method stub
		
		switch(browser){
		case "Chrome":
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   break;
		case "Edge":
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		    break;
		case "Firefox":
			System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		    break;
		case "default":
			System.out.println("nothing");
			
			
		}
		return driver;
	}
	
	 
}
