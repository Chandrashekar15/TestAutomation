package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo1 {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
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
	
	static void createUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("usersclick")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addusers")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("firstNameField")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("lastNameField")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("emailField")).sendKeys("demo@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userNameField")).sendKeys("demoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("pwdField")).sendKeys("Welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("pwdCopyField")).sendKeys("Welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createUserButton")).click();
			Thread.sleep(1000);			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("deleteUser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteButton")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}
