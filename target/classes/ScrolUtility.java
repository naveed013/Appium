package resources;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrolUtility {
	
	AndroidDriver<AndroidElement> driver;

	public ScrolUtility(AppiumDriver<AndroidElement> driver)
	{
		
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=(AndroidDriver<AndroidElement>) driver;
	}
	
	public void scrollToText(String text) {
		
		
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
	}
	
		


}