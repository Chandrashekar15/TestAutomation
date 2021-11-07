package com.sgtesting.testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		enterSalaryForThePersonSachinTendulkar();
		fromPersonRahulDRavidTheNext2ndRecordEnterSalary();
		makeStatusAsActiveForIndianFreedomFighter();
		fromSachinTendulkarPrevious2ndRecordMakeStatusActive();
		basedOnRefOfSalaryFieldInSachinTendularRecordIdentfyTable();
		basedOnTableReferenceEnterSalaryOn4thRecord();
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
			oBrowser.get("file:///C:/Users/CHANDR~1.G/AppData/Local/Temp/Rar$EX06.480/XPathAxes_27th_OCT_2021/WebTableHTML.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	/**
	 * following-sibling
	 */
	static void enterSalaryForThePersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}

	/**
	 * following
	 */
	static void fromPersonRahulDRavidTheNext2ndRecordEnterSalary()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("15000");
	}

	/**
	 * preceding-sibling
	 */
	static void makeStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	/**
	 * preceding
	 */
	static void fromSachinTendulkarPrevious2ndRecordMakeStatusActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
	}

	/**
	 * ancestor
	 */
	static void basedOnRefOfSalaryFieldInSachinTendularRecordIdentfyTable()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
		String val=oEle.getAttribute("id");
		System.out.println(val);
	}

	/**
	 * descendant
	 */
	static void basedOnTableReferenceEnterSalaryOn4thRecord()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("25000");
	}
}
