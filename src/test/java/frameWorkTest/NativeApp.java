package frameWorkTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

//import org.junit.Test;

import AppiumObjects.PrefrencesObject;
import NativeAppObject.DepenedeciesObject;
import NativeAppObject.HomePageObject;
import designpattern.Frameworks.basei;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.TestData;

public class NativeApp extends basei{

	@Test(dataProvider= "InputData", dataProviderClass=TestData.class)
	
	public static void apiDemoTest(String input) throws IOException, InterruptedException {
		
		// TODO Auto-generated method stub

		service=startServer();
	
	     
		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	    
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	   
	     
	     HomePageObject h=new HomePageObject(driver);
	     h.prefrences.click();
	     PrefrencesObject p=new PrefrencesObject(driver);
	     p.dependcies.click();
	     DepenedeciesObject d= new DepenedeciesObject(driver);
	     d.Wifi.click();
	     d.WifiSetting.click();
	     d.EditBox.sendKeys(input);
	     d.OkButton.get(1).click();
	     service.stop();
	     
	    
	}
	    
	     
			
			//Syntax for UiAutomator  //driver.findElementByAndroidUIAutomator("Attribut(\"Vlaue\")").click();
			//driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
			//driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
			//System.out.println(driver.findElementsByClassName("androidview.view.view").size());
			//WebElement Source=driver.findElementsByXPath("//*[@index='0']").get(0);
			
			//WebElement Destination=driver.findElementsByXPath("//*[@index='0']").get(1);
	     
	     
	     // here is modification while setting up the Page object factory
	     //**********************
	   ////driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	   //driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	     //driver.findElementById("android:id/checkbox").click();
	     // driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	    // driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
	    // driver.findElementsByClassName("android.widget.Button").get(1).click();
	     
	     
	}

