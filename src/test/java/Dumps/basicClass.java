package Dumps;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import designpattern.Frameworks.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basicClass extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		
		
	     
	    AndroidDriver<AndroidElement> driver=Capabilities();
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	   
	     
	     //HomePageClass h=new HomePageClass(driver);
	     
	     driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	     
	     //h.preferences.click();
	     
	    // PrefrencesObjectClass p=new PrefrencesObjectClass(driver);
	     driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	    // p.dependcies.click();
	     
	     driver.findElementById("android:id/checkbox").click();
	     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	     driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
	     driver.findElementsByClassName("android.widget.Button").get(1).click();
	     
			
			//Syntax for UiAutomator  //driver.findElementByAndroidUIAutomator("Attribut(\"Vlaue\")").click();
			//driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
			//driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
			//System.out.println(driver.findElementsByClassName("androidview.view.view").size());
			//WebElement Source=driver.findElementsByXPath("//*[@index='0']").get(0);
			
			//WebElement Destination=driver.findElementsByXPath("//*[@index='0']").get(1);
	     
	     
	}

}
