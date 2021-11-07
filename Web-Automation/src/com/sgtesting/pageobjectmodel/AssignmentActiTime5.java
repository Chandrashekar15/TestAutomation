package com.sgtesting.pageobjectmodel;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentActiTime5 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate(); 
		login();
		minimizeFlyOutWindow();
		createcustomer();
		createproject();
		deleteproject();
		deletecustomer();
		logout();
		closeApplication();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Example Automation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getpassword().sendKeys("manager");
			oPage.getlogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.gettingflyoutwindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createcustomer()
	{
		try
		{
			oPage.gettask().click();
			Thread.sleep(2000);
			oPage.getaddnew().click();
			Thread.sleep(2000);
			oPage.getnewcustomer().click();
			Thread.sleep(2000);
			oPage.getwritecustomer().sendKeys("demouser");
			Thread.sleep(2000);
			oPage.getsavecustome().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createproject()
	{
		try
		{
			oPage.getaddnew().click();
			Thread.sleep(2000);
			oPage.getproject().click();
			Thread.sleep(2000);
			oPage.getprojectname().sendKeys("automation project");
			Thread.sleep(2000);
			oPage.getsaveproject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteproject()
	{
		try
		{
			oPage.getprojectdelete().click();
			Thread.sleep(2000);
			oPage.getprojectaction().click();
			Thread.sleep(2000);
			oPage.getclickdeleteproject().click();
			Thread.sleep(2000);
			oPage.getpermanentlydelete().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletecustomer()
	{
		try
		{
			oPage.getdeletecustomer().click();
			Thread.sleep(2000);
			oPage.getactions().click();
			Thread.sleep(2000);
			oPage.getclickdeletecustomer().click();
			Thread.sleep(2000);
			oPage.getalertdelete().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void closeApplication()
	{

		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}


}