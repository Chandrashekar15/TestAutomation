package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver obrowser)
	{
		PageFactory.initElements(obrowser, this);
	}
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement ologin;
	public WebElement getlogin()
	{
		return ologin;
	}
	
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement gettingflyoutwindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement Create;
	public WebElement getCreate()
	{
		return Create;
	}
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
	private WebElement Adduser;
	public WebElement getAdduser()
	{
		return Adduser;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_firstNameField\"]")
	private WebElement firstname;
	public WebElement getfirstname()
	{
		return firstname;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
	private WebElement lastname;
	public WebElement getlastname()
	{
		return lastname;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_emailField\"]")
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	
	@FindBy(xpath="//*[@id=\"userDataLightBox_usernameField\"]")
	private WebElement usernamefield;
	public WebElement getusernameblock()
	{
		return usernamefield;
	}
	
	@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]")  
	private WebElement password;
	public WebElement getpasswordfield()
	{
		return password;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
	private WebElement retypepassword;
	public WebElement getretypepasswordfield()
	{
		return retypepassword;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]") 
	private WebElement savebutton;
	public WebElement getsavebutton()
	{
		return savebutton;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement delete;
	public WebElement getclickdelete()
	{
		return delete;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement actions;
	public WebElement getactionbutton()
	{
		return actions;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement modify;
	public WebElement getclickmodify()
	{
		return modify;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_passwordField\"]") 
	private WebElement modifypwd;
	public WebElement getmodifypassword()
	{
		return modifypwd;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_passwordCopyField\"]")
	private WebElement modifyrepwd;
	public WebElement getmodifyrepassword()
	{
		return  modifyrepwd;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]")
	private WebElement savechange;
	public WebElement getsavechange()
	{
		return savechange;
	}
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")
	private WebElement task;
	public WebElement gettask()
	{
		return task;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]")
	private WebElement addnew;
	public WebElement getaddnew()
	{
		return addnew;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement newcustomer;
	public WebElement getnewcustomer()
	{
		return newcustomer;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_nameField\"]")
	private WebElement writecustomer;
	public WebElement getwritecustomer()
	{
		return writecustomer;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]")
	private WebElement save;
	public WebElement getsavecustome()
	{
		return save;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement deletecustomer;
	public WebElement getdeletecustomer()
	{
		return deletecustomer;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement actionsbutton;
	public WebElement getactions()
	{
		return actionsbutton;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement clickdelete;
	public WebElement getclickdeletecustomer()
	{
		return clickdelete;
	}
	@FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")
	private WebElement alert;
	public WebElement getalertdelete()
	{
		return alert;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement modifycustomer;
	public WebElement getmodifycustomer()
	{
		return modifycustomer;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement adddescription;
	public WebElement getdescription()
	{
		return adddescription;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement closemdfycustomer;
	public WebElement getclosemdfycstr()
	{
		return closemdfycustomer;
	}
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement createproject;
	public WebElement getproject()
	{
		return createproject;
	}
	@FindBy(xpath="//*[@id=\"projectPopup_projectNameField\"]")
	private WebElement writeproject;
	public WebElement getprojectname()
	{
		return writeproject;
	}
	@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]")
	private WebElement saveproject;
	public WebElement getsaveproject()
	{
		return saveproject;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement deleteproject;
	public WebElement getprojectdelete()
	{
		return deleteproject;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement actionproject;
	public WebElement getprojectaction()
	{
		return actionproject;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement clickondelete;
	public WebElement getclickdeleteproject()
	{
		return clickondelete;
	}
	@FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")
	private WebElement deletepermanently;
	public WebElement getpermanentlydelete()
	{
		return deletepermanently;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement modifyproject;
	public WebElement getmodifyproject()
	{
		return modifyproject;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement enterprojectdescription;
	public WebElement getprogectdescription()
	{
		return enterprojectdescription;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	private WebElement savemodifyproject;
	public WebElement getsavemodifyproject()
	{
		return savemodifyproject;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]")
	private WebElement createtasks;
	public WebElement getTasks()
	{
		return createtasks;
	}
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createnewtasks;
	public WebElement getnewTasks()
	{
		return createnewtasks;
	}
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement entertasksname;
	public WebElement getenternameoftasks()
	{
		return entertasksname;
	}
	@FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]")
	private WebElement savecreatedtasks;
	public WebElement getsavetasks()
	{
		return savecreatedtasks;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div")
	private WebElement deletetasks;
	public WebElement getdeleteTasks()
	{
		return deletetasks;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement clickonaction;
	public WebElement getclickactionTask()
	{
		return clickonaction;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement clickokdelete;
	public WebElement getclickOkDelete()
	{
		return clickokdelete;
	}
	@FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")
	private WebElement permanentdelete;
	public WebElement getDeleteTasks()
	{
		return permanentdelete;
	}
	@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
	private WebElement closewelcomepage;
	public WebElement getclosewelcomescreen()
	{
		return closewelcomepage;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement modifyuser1;
	public WebElement getusermodify1()
	{
		return modifyuser1;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div")
	private WebElement savemodifyuser1;
	public WebElement getsaveuser1modify()
	{
		return savemodifyuser1;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")
	private WebElement modifyuser2;
	public WebElement getusermodify2()
	{
		return modifyuser2;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]")
	private WebElement modifyuser3;
	public WebElement getusermodify3()
	{
		return modifyuser3;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement deleteuser1;
	public WebElement getdeleteuser1()
	{
		return deleteuser1;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")  
	private WebElement clickdeletedemouser1;
	public WebElement getclickdemouser11()
	{
		return clickdeletedemouser1;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement deleteuser2;
	public WebElement getdeleteuser2()
	{
		return deleteuser2;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement deleteuser3;
	public WebElement getdeleteuser3()
	{
		return deleteuser3;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]") 
	private WebElement deleteuser33;
	public WebElement getdeleteuser33()
	{
		return deleteuser33;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")
	private WebElement deleteuser22;
	public WebElement getdeleteuser22()
	{
		return deleteuser22;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement deleteuser11;
	public WebElement getdeleteuser11()
	{
		return deleteuser11;
	}
	public WebElement getdeleteuser331() {
		return null;
	}

}