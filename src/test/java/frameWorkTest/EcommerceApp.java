package frameWorkTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import designpattern.Frameworks.ecommerceBase;
import ecommerceObject.CheckOutPage;
import ecommerceObject.FormHomePage;
import ecommerceObject.ShoppingPage;
import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;
import resources.ScrolUtility;

import static io.appium.java_client.touch.TapOptions.tapOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static java.time.Duration.ofSeconds;

import java.io.IOException;






public class EcommerceApp extends ecommerceBase{



@Test
public void EcommerceAppValidation() throws IOException, InterruptedException
{
	startServer();

AndroidDriver<AndroidElement> driver=Capabilities("appName");

     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
   
   FormHomePage FHP=new FormHomePage(driver);
     FHP.NameField.sendKeys("Hello");
     driver.hideKeyboard();
     Thread.sleep(2000);
     FHP.FemaleOption.click();
     FHP.DropDownButton.click();
     //the below line is coming from scroll utilit page
     ScrolUtility SU= new ScrolUtility(driver);
     SU.scrollToText("Argentina");
     //Below are the action on home page
     FHP.SelectDesiredCountry.click();
     FHP.ShopButton.click();
     
//Below are the shoping page Item
     
     ShoppingPage SP=new ShoppingPage(driver);
     
     SP.FirstItem.get(0).click();
     SP.SecondItem.get(0).click();
     SP.CartButton.click();
    Thread.sleep(4000);

	int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();

	double sum = 0;
	CheckOutPage COP = new CheckOutPage(driver);

	for (int i = 0; i < count; i++)

	{
		
		String amount1= COP.ProductList.get(i).getText();
		
		//Double will parse the string to integer
		
		double amount = getAmount(amount1);

		sum = sum + amount;// 280.97+116.97

	}

	System.out.println(sum + "sum of products");
	String total = COP.TotalAmount.getText();
	total = total.substring(1);
	//Double will parse the string to integer
	double totalValue = Double.parseDouble(total);

	System.out.println(totalValue + "Total value of products");
	
	
	
	
	
	
	

//Mobile Gestures

	WebElement checkbox = driver.findElement(By.className("android.widget.CheckBox"));

	TouchAction t = new TouchAction(driver);

	t.tap(tapOptions().withElement(element(checkbox))).perform();

	WebElement tc = driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));

	t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();

	driver.findElement(By.id("android:id/button1")).click();

	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();	
	
service.stop();


}

public static double getAmount(String value)

{

	value = value.substring(1);

	double amount2value = Double.parseDouble(value);

	return amount2value;

}

}

// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");

//   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));  