package dsalgotestcases;

import org.testng.annotations.Test;

import com.dsalgo.Baseclass.BaseClass;
import com.dsalgo.pages.GetStartPage;
import com.dsalgo.pages.HomePage;

public class GetStartPage_Testcase extends BaseClass

{  
	/*public GetStartPage_Testcase()
	{
		super();
	}*/
	
	
	
    HomePage homepage;
      @Test(priority=1)
      public void startbutton() throws InterruptedException
      { 
		GetStartPage getstartpage=new GetStartPage(driver);
		System.out.println("test");
		getstartpage.click_getstarted();
      }
	
}
