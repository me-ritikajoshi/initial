package firstTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import firstTest.base.BaseClass;
import firstTest.pages.RegisterPage;


public class RegisterTest extends BaseClass{

	@Test(description="Register test case")
	public void verifyRegisterTest() throws InterruptedException {
		
		RegisterPage register = new RegisterPage(driver);
		register.setFirstName();
		Thread.sleep(2000);
		register.setLastName();
		register.chooseMaleOption();
		Thread.sleep(2000);
		Reporter.log("register testcase Done!", true);
	}


}
