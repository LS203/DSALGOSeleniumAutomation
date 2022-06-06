package com.dsalgo.pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dsalgo.Baseclass.BaseClass;

public class LoginPage extends BaseClass {
	WebDriver driver;
	HomePage homepage=new HomePage(driver);
	
	@FindBy(xpath="//input[@type='text']")
	 WebElement uname;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	 WebElement pwd;
	
	@FindBy(how=How.XPATH,xpath="//input[@value='Login']")
	 WebElement Loginbutton;
	
	public  LoginPage()
	{   //this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void  EnterLoginDetails(String username,String password) throws InterruptedException 
	{
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50, 1));
		wait.until(ExpectedConditions.visibilityOf(uname)).sendKeys(username);
		//uname.sendKeys(username);
		pwd.sendKeys(password);
	Loginbutton.click();
	Thread.sleep(2000);
		//return new HomePage(driver);
	}

	}
