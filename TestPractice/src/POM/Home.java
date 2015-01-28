package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home 
{

	private static WebElement element;
	
	public static WebElement LDashboard(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Dashboard"));
		return element;
	}
	
	public static WebElement LTopologyView(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Radio Topology"));
		return element;
	}
	
	
}
