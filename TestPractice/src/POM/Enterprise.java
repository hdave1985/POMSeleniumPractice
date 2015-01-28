package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Enterprise 
{

	private static WebElement element;
	
	public static WebElement linkuname(WebDriver driver)
	{
	
		element = driver.findElement(By.linkText("Logout"));
		return element;
	}
	
	
}
