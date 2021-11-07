package com.sgtesting.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceAssignment1 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		
		 launchBrowser();
		 navigate();
		 
		 login();
		 minimizefly();
		 createUser1();
		 createUser2();
		 createUser3();
		 
		 logout();
		 user1login();
		 logout1();
		 user2login();
		 logout2();
		 user3login();
		 logout3();
		 login();
		 modifyPass1();
		 modifyPass2();
		 modifyPass3();
		 logout4();
		 user33login();
		 logout5();
		 login();
		 deleteUser1();
		 deleteUser2();
		 deleteUser3();
		 logouttt();
		 closeApplication();

		 
	}
	static void launchBrowser()
	{
		try
		{ 
			System.setProperty("webdriver.chrome.driver", "E:\\Example Automation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch (Exception e)
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
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizefly()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
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
			
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo1");
		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Sunila");
		oBrowser.findElement(By.name("username")).sendKeys("Suni");
		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Sunilasuni@gmail.com");
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}

	static void createUser2()
	{
		try
		{
			
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo2");
		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Arun");
		oBrowser.findElement(By.name("username")).sendKeys("Kumar");
		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("ArunKumar@gmail.com");
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1234");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1234");
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	static void createUser3()
	{
		try
		{
			
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo3");
		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("kirankumar");
		oBrowser.findElement(By.name("username")).sendKeys("kiran");
		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("kiran@gmail.com");
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome12345");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome12345");
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
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
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	
	static void user1login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("rachu");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
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
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	static void user2login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("SG");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
	
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	static void logout2()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	
	static void user3login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("SG");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
	
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	static void logout3()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	static void modifyPass1()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("Qwerty123");
			oBrowser.findElement(By.name("passwordCopy")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Qwerty123");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	
	static void modifyPass2()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("Qwerty1234");
			oBrowser.findElement(By.name("passwordCopy")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Qwerty1234");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPass3()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("Qwerty12345");
			oBrowser.findElement(By.name("passwordCopy")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Qwerty12345");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout4()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	static void user33login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Kumar");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1234");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
	
		}catch(Exception e)
		{
			e.printStackTrace();
	    }
	}
	static void logout5()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
		   }catch(Exception e)
			{
				e.printStackTrace();
		    }
	   }
	
	static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logouttt()
	   {
		   try
		   {
			   oBrowser.findElement(By.id("logoutLink")).click();
			   Thread.sleep(3000);
			   
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