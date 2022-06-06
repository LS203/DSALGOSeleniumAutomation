package dsalgotestcases;

import org.testng.annotations.Test;

import com.dsalgo.Baseclass.BaseClass;
import com.dsalgo.pages.HomePage;
import com.dsalgo.pages.LoginPage;

public class HomePage_TestCase extends BaseClass
{
	LoginPage loginpage;
	HomePage homepage=new HomePage(driver);
	@Test(priority=2)
	public void signinlink() throws InterruptedException
	{
		homepage.clickonSigninlink();
	}
	
	
}
