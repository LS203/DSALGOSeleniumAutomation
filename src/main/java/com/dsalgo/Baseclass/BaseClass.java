package com.dsalgo.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
//import java.util.Properties;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.dsalgo.pages.GetStartPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public ThreadLocal<WebDriver> tdriver;
	public Properties prop;
	public GetStartPage getstartPage;
	
	public BaseClass()
	{
		prop=new Properties();
		tdriver=new ThreadLocal<WebDriver>();
		try {
			prop=new Properties();
		   FileInputStream fs=new FileInputStream("./src/main/java/com/dsalgo/config/config.properties");
			prop.load(fs);
           System.out.println(fs);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	@Parameters("browserName")
	@BeforeMethod
	public void InitializeBrowser(String browserName)
	{
		Initialize(browserName);
	}
	
	public  void Initialize (String browserName) 
	{   
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        String url;
        url=prop.getProperty("baseurl");
        driver.get(url);
    	System.out.println(url);
    	
    	//getstartPage = new GetStartPage(driver);
	}
	
	
	/*@AfterTest
	public void teardown()
	{ driver.manage().deleteAllCookies();
	  driver.close();
	  driver.quit();
	}*/
}
