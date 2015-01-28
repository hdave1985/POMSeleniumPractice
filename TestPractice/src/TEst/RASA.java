package TEst;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.apache.bcel.generic.DASTORE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.Enterprise;
import POM.Login;;


@SuppressWarnings("deprecation")
public class RASA 
{

	
	RASA()
	{
		System.out.println("call");
	}
	
	private static WebDriver driver;
	
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://ec2-54-67-16-88.us-west-1.compute.amazonaws.com/login");
		
		Login.txtuname(driver).sendKeys("testsprint@zoho.com");
		Login.txtpass(driver).sendKeys("Password1");
		Login.submit(driver).click();
		System.out.println("Clicked login");
		
		String uname= Enterprise.linkuname(driver).getText();
		System.out.println(uname);
		
		
		
		
	
		
	}
}
