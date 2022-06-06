package com.dsalgo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.Baseclass.BaseClass;

public class HomePage extends BaseClass {
	
	//WebDriver driver=null;
	
	
	public HomePage(WebDriver driver)
	{     //this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Sign in")
	public static WebElement Signin;
	
	public LoginPage  clickonSigninlink() throws InterruptedException
	{  Thread.sleep(2000);
		Signin.click();
		return new LoginPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
