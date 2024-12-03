package firstTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import firstTest.base.BaseClass;

public class IFramePage extends BaseClass{
		
		@FindBy(name="top-iframe")
		WebElement iframeElement;
		
		@FindBy(linkText = "Docs")
		WebElement docsLink;
		
		
		public IFramePage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		
		public void switchToIframe(WebDriver driver) {
			
			driver.switchTo().frame(iframeElement);
		}
		
		public void clickDocsUnderIframe() {
			
			docsLink.click();
		}


}
