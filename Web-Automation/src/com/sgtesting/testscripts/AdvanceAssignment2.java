package com.sgtesting.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceAssignment2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createUser1();
		logout();
		loginUser1();
		createUser2();
		logout();
		
		loginUser2();
     	createUser3();
		logout();
		
		loginUser3();
		logout();
		
		loginUser2ModifyUser3();
		modifyUser3();
		logoutUser2ModifyUser3(); 
		loginMdifyUser3();
		logoutModifyUser3();
		
		loginUser1ModifyUser2();
		modifyUser2();
		logoutUser1ModifyUser2();
		loginModifyUser2();
		logoutModifyUser2();
		
		loginAdminModifyUser1();
		modifyUser1();
		logoutAdminModifyUser1();
		loginModifyUser1();
		logoutModifyUser1();
		
		 loginUser2DeleteUser3();
		 deleteUser3();
		 logoutUser2DeleteUser3();
		
		 loginUser1DeleteUser2();
		 deleteUser2();
		 logoutUser1DeleteUser2();
		 
		 loginAdmin1DeleteUser1();
		 deleteUser1();
		 logoutAdmin1DeleteUser1();
		 
		 closeApplication();
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Example Automation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
		oBrowser.findElement(By.name("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user1");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user1");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo1@gamil.com");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234567890");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo2");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user2");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user2");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo2@gamil.com");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234567890");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo3");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user3");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user3");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo3@gamil.com");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234567890");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginUser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginUser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginUser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
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
	/**
	 * Modify User3
	 */
	static void loginUser2ModifyUser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("1234567891");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234567891");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser2ModifyUser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginMdifyUser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567891");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutModifyUser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * modify user2
	 */
	static void loginUser1ModifyUser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567890");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("1234567891");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234567891");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser1ModifyUser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginModifyUser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567891");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutModifyUser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Modify User1
	 */
	static void loginAdminModifyUser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("1234567891");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234567891");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutAdminModifyUser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginModifyUser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567891");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutModifyUser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Delete User3
	 */
	static void loginUser2DeleteUser3()
	{
		
			try
			{
				oBrowser.findElement(By.name("username")).sendKeys("user2");
				oBrowser.findElement(By.name("pwd")).sendKeys("1234567891");
				oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	static void deleteUser3()
	 {
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
	static void logoutUser2DeleteUser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Delete user2
	 */
	static void loginUser1DeleteUser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234567891");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser2()
	 {
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
	static void logoutUser1DeleteUser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Delete User1
	 */
	static void loginAdmin1DeleteUser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser1()
	 {
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			 Thread.sleep(2000);
			 oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
	static void logoutAdmin1DeleteUser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}