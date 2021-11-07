package com.sgtesting.objectmap;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo6 {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		logout();		
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("customerTaskButton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addNewCustomer")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("newCustomer")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customerNameField")).sendKeys("Demo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createCustomer")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	
	static void createProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("addNewCustomer")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("newProject")).click();
			Thread.sleep(1000);			
			oBrowser.findElement(objectmap.getLocator("projectNameField")).sendKeys("Sample");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createProjectButton")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void modifyProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("settingButtonProject")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("txtAreaProject")).sendKeys("Test");
			Thread.sleep(1000);			
			oBrowser.findElement(objectmap.getLocator("closeButtonProject")).click();
			Thread.sleep(1000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	static void deleteProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("settingButtonProject")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("actionButtonProject")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteProject")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deletePermanentlyProject")).click();
			Thread.sleep(1000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("settingButton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("actionButton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteCustomer1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteCustomerPermanently")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}