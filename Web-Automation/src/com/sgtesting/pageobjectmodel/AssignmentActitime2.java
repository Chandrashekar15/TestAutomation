package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentActitime2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		modifyuser();
		deleteuser();
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
	static void createuser()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getAdduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("demo");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("user");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("demo@gmail.com");
			Thread.sleep(2000);
			oPage.getusernameblock().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getpasswordfield().sendKeys("welcome");
			Thread.sleep(2000);
			oPage.getretypepasswordfield().sendKeys("welcome");
			Thread.sleep(2000);
			oPage.getsavebutton().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyuser()
	{
		try
		{
			oPage.getclickmodify().click();
			Thread.sleep(2000);
			oPage.getmodifypassword().sendKeys("123");
			Thread.sleep(2000);
			oPage.getmodifyrepassword().sendKeys("123");
			Thread.sleep(2000);
			oPage.getsavechange().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser()
	{
		try
		{
			oPage.getclickdelete().click();
			Thread.sleep(2000);
			oPage.getactionbutton().click();
			Thread.sleep(2000);
			Thread.sleep(2000);Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
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
