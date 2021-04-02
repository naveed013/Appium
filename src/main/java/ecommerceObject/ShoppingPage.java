package ecommerceObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShoppingPage {
	
	
	
	public ShoppingPage(AppiumDriver driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	
	
	
	@AndroidFindBy(xpath="//*[@text='Argentina']")
	public List< WebElement> FirstItem;
	
	@AndroidFindBy(xpath="//*[@text='ADD TO CART']")
	public List< WebElement> SecondItem;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	public WebElement CartButton;
	

}
