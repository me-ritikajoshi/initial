package firstTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import firstTest.base.BaseClass;
import firstTest.pages.IFramePage;

public class IFrameTest extends BaseClass{
		
		@Test(description="Register test case")
		public void verifyRegisterTest() throws InterruptedException {
			
			IFramePage iframe = new IFramePage(driver);
			//iframe.switchToIframe(driver);
			//iframe.clickDocsUnderIframe();
			Reporter.log("Iframe automation test Case Done", true);
		}

}
