package util;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	private final WebDriver driver;
	private final WebDriverWait wait;
	public WaitUtil(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	public void impilicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public WebElement waitForElementToBeVisible(WebDriver driver,WebElement element)
	{
	 return wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public WebElement waitForElementToBeVisible(WebDriver driver,By locator)
	{
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	public WebElement elementclickable(WebDriver driver,WebElement element)
	{
	 return wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public WebElement waitForElementToBePresent(WebDriver driver,By locator)
	{
	 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public WebElement waitForElementToBeClickable(WebDriver driver,By locator)
	{
	 return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	public void fluentwait(WebElement element,String message)
	{
	FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
	fluentWait.pollingEvery(Duration.ofSeconds(7));
	fluentWait.withTimeout(Duration.ofSeconds(7)); 
	fluentWait.ignoring(NoSuchElementException.class);
	fluentWait.ignoring(WebDriverException.class);
	fluentWait.until(ExpectedConditions.textToBePresentInElement(element, message));
	}

}