package NativeAppObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DepenedeciesObject {
	
	
	
	public DepenedeciesObject(AppiumDriver driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(id="android:id/checkbox")
	public WebElement Wifi;
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement WifiSetting;
	
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement EditBox;
	
	@AndroidFindBy(className="android.widget.Button")
	public List<WebElement> OkButton;
	

	}

//