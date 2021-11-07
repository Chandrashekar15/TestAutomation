package com.sgtesting.pageobjectmodel;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentActitimeAdvance2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser1();
		 logout();
		 loginasuser1();
		 createuser2();
		 logoutuser2();
		 loginasuser2();
		 createuser3();
		 logout1();
		 loginasuser3();
		 logoutuser3();
		 loginasuser2tomodify();
		 modifyuser3();
		 logout2();
		 loginasuser33();
		 logout33();
		 loginasuser11();
		 modifyuser2();
		 logoutmodify2();
		 loginasuser22();
		 logoutmodify22();
		 loginadmin();
		 modifyuser1();
		 logoutmodify1();
		 loginasuser01();
		 logoutmodify01();
		 loginasuser02();
		 deleteuser3();
		 logoutdelete3();
		 loginasuser011();
		 deleteuser2();
		 logoutdeleteuser2();
		 loginasadmin();
		 deleteuser1();
		 logoutdeleteuser1();
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
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("manager");
			Thread.sleep(1000);
			oPage.getlogin().click();
			Thread.sleep(2000);
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
	static void createuser1()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getAdduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("demo");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("user101");
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
	static void loginasuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getpassword().sendKeys("welcome");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(3000);
			oPage.getclosewelcomescreen().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser2()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getAdduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("demo");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("user201");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("demo@gmail.com");
			Thread.sleep(2000);
			oPage.getusernameblock().sendKeys("user2");
			Thread.sleep(2000);
			oPage.getpasswordfield().sendKeys("software");
			Thread.sleep(2000);
			oPage.getretypepasswordfield().sendKeys("software");
			Thread.sleep(2000);
			oPage.getsavebutton().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser2()
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
	static void loginasuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("software");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(3000);
			oPage.getclosewelcomescreen().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser3()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getAdduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("demo");
			Thread.sleep(2000);
			oPage.getlastname().sendKeys("user301");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("demo@gmail.com");
			Thread.sleep(2000);
			oPage.getusernameblock().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getpasswordfield().sendKeys("company");
			Thread.sleep(2000);
			oPage.getretypepasswordfield().sendKeys("company");
			Thread.sleep(2000);
			oPage.getsavebutton().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout1()
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
	static void loginasuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("company");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(3000);
			oPage.getclosewelcomescreen().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser3()
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
	static void loginasuser2tomodify()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("software");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyuser3()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getusermodify3().click();
			Thread.sleep(1000);
			oPage.getpasswordfield().sendKeys("789");
			Thread.sleep(2000);
			oPage.getretypepasswordfield().sendKeys("789");
			Thread.sleep(2000);
			oPage.getsaveuser1modify().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout2()
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
	static void loginasuser33()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("789");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout33()
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
	static void loginasuser11()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("welcome");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyuser2()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getusermodify2().click();
			Thread.sleep(1000);
			oPage.getpasswordfield().sendKeys("456");
			Thread.sleep(2000);
			oPage.getretypepasswordfield().sendKeys("456");
			Thread.sleep(2000);
			oPage.getsaveuser1modify().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutmodify2()
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
	static void loginasuser22()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("456");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutmodify22()
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
	static void loginadmin()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("manager");
			Thread.sleep(1000);
			oPage.getlogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifyuser1()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getusermodify1().click();
			Thread.sleep(1000);
			oPage.getpasswordfield().sendKeys("123");
			Thread.sleep(2000);
			oPage.getretypepasswordfield().sendKeys("123");
			Thread.sleep(2000);
			oPage.getsaveuser1modify().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutmodify1()
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
	static void loginasuser01()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("123");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutmodify01()
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
	static void loginasuser02()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getpassword().sendKeys("456");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser3()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getdeleteuser33().click();
			Thread.sleep(2000);
			oPage.getclickdemouser11().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutdelete3()
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
	static void loginasuser011()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("123");
			Thread.sleep(2000);
			oPage.getlogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser2()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getdeleteuser22().click();
			Thread.sleep(2000);
			oPage.getclickdemouser11().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutdeleteuser2()
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
	static void loginasadmin()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("manager");
			Thread.sleep(1000);
			oPage.getlogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteuser1()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(2000);
			oPage.getdeleteuser11().click();
			Thread.sleep(2000);
			oPage.getclickdemouser11().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutdeleteuser1()
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
