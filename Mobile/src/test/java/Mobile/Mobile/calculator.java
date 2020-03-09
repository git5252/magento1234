package Mobile.Mobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class calculator {
   static AppiumDriver driver;
	public static void main(String[] args) 
	{
		try {
			paytm();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
       
	
	public static void paytm() throws Exception
       {
    	   
       
		
		DesiredCapabilities d = new DesiredCapabilities();
		d.setCapability("devicename","Redmi");
		d.setCapability("udid", "accbc5370406");
		d.setCapability("platformName","Android");
		d.setCapability("platformVersion", "9PKQ1.190319.001");
		d.setCapability("appPackage","net.one97.paytm");
		d.setCapability("appActivity","net.one97.paytm.paytm");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<WebElement>(url,d);
		}

}

		
	
	
	
		
