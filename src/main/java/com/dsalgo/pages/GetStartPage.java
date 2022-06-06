package com.dsalgo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.Baseclass.BaseClass;

public class GetStartPage extends BaseClass
 
{    WebDriver driver=null;
     public  GetStartPage(WebDriver driver)
{     this.driver=driver;
	   PageFactory.initElements(driver, this);
}

	@FindBy(how=How.XPATH,xpath="//button[@class='btn']")
  public  static WebElement buttongetstarted;
    
    
  
	public   HomePage click_getstarted() throws InterruptedException 
	{    Thread.sleep(20000);
		buttongetstarted.click();
		return  new HomePage(driver);
		   
	}
	 
	}
