package dsalgotestcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dsalgo.Baseclass.BaseClass;
import com.dsalgo.pages.LoginPage;

import Utils.ReadExcel;

public class LoginPage_TestCase extends BaseClass{
	
	
	@DataProvider
	public Object[][] Logincredentials() throws Exception
	{
		Object[][] GetLoginData=ReadExcel.readExcelData("src/test/resources/ExcelData/TestData.xlsx","Sheet1");
		return (GetLoginData);	
	}
	
	@Test(priority=3,dataProvider = "Logincredentials")
	public void readexcel(String username, String password) throws InterruptedException 
	{	LoginPage loginpage=new LoginPage();

		loginpage.EnterLoginDetails(username, password);
		
		
	}
	
  
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
