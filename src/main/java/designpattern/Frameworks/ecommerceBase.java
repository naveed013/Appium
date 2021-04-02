package designpattern.Frameworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ecommerceBase {

	public static AppiumDriverLocalService service;
	
	public AppiumDriverLocalService startServer()
	{
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		return service;
		
	}
	
	
	
	
	
public static boolean checkIfServerIsRunnning(int port) {
		
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			
			serverSocket.close();
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

public static void startEmulator() throws IOException, InterruptedException
{
	Runtime.getRuntime().exec(System.getProperty("user.dir")+"src\\main\\java\\startEmulator.bat");
	Thread.sleep(4000);
}


		public static AndroidDriver<AndroidElement> Capabilities(String appName) throws IOException
		{		
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\global.properties");
			
		
			Properties prop=new Properties();            
			prop.load(fis);
			
			
			AndroidDriver<AndroidElement> driver;
		
			 File appDir = new File("src");
		     File app = new File(appDir, "General-Store.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     String device= (String) prop.get(appName);
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
	    // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator");
	     capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     return driver;
	}
	
}
