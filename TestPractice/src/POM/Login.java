package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login 
{

	private static WebElement element;
	
	public static WebElement txtuname(WebDriver driver)
	{
	
		element = driver.findElement(By.name("email"));
		return element;
	}
	
	public static WebElement txtpass(WebDriver driver)
	{
	
		element = driver.findElement(By.name("password"));
		return element;
	}
	
	public static WebElement submit(WebDriver driver)
	{
	
		element = driver.findElement(By.xpath("/html/body/div[1]/aside[2]/div/div/div/div/div[2]/div[2]/form/div[5]/button"));
		return element;
	}
	
	
}
