package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

public class ObjectMap {
	public static Properties prop=null;
	public ObjectMap(String filename)
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream(filename);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			String locatordetails=prop.getProperty(logicalname);
			Pattern pattern=Pattern.compile("[|]");
			String locator[]=pattern.split(locatordetails);
		
			String locatorname=locator[0];
			String locatorvalue=locator[1];
			
			if(locatorname.equalsIgnoreCase("id"))
			{
				by=By.id(locatorvalue);
			}
			else if(locatorname.equalsIgnoreCase("name"))
			{
				by=By.name(locatorvalue);
			}
			else if(locatorname.equalsIgnoreCase("xpath"))
			{
				by=By.xpath(locatorvalue);
			}
			else if(locatorname.equalsIgnoreCase("linktext"))
			{
				by=By.linkText(locatorvalue);
			}
			else if(locatorname.equalsIgnoreCase("cssselector"))
			{
				by=By.cssSelector(locatorvalue);
			}
			else if(locatorname.equalsIgnoreCase("classname"))
			{
				by=By.className(locatorvalue);
			}
			else if(locatorname.equalsIgnoreCase("tagname"))
			{
				by=By.tagName(locatorvalue);
			}
			else if(locatorname.equalsIgnoreCase("partiallinktext"))
			{
				by=By.partialLinkText(locatorvalue);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}
}
