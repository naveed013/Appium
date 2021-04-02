package ecommerceObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormHomePage {
	
	
	
	public FormHomePage(AppiumDriver driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement NameField;
	
	@AndroidFindBy(xpath="(//*[@text='Female']")
	public WebElement FemaleOption;
	
	@AndroidFindBy(id="android:id/text1")
	public WebElement DropDownButton;
	
	@AndroidFindBy(xpath="//*[@text='Argentina']")
	public WebElement SelectDesiredCountry;
	
	@AndroidFindBy(xpath="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement ShopButton;
	

	
	
	 
	

}
