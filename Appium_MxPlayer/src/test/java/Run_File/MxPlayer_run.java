package Run_File;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Cap_File.MxPlayer_cap;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MxPlayer_run extends MxPlayer_cap{

AndroidDriver<AndroidElement> driver ;

ExtentHtmlReporter htmlreport;
ExtentReports extnt;
ExtentTest test;


	@BeforeTest
	public void setup() throws MalformedURLException {
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		htmlreport=new ExtentHtmlReporter("extent.html");
		extnt=new ExtentReports();
		extnt.attachReporter(htmlreport);
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		
		//object created for taking screenshots
		test=extnt.createTest("html Reports");
		
		//clicking on profile
		AndroidElement profile = driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/iv_me"));
		profile.click();
		test.info("Profile");
		
		//clicking on downloads 
		AndroidElement downloads = driver.findElement(MobileBy.xpath("//*[@text='Downloads']"));
		downloads.click();
		test.info("downloads");
		
		//click on go to download
		AndroidElement GoToDownloads = driver.findElement(MobileBy.xpath("//*[@text='Go to Download']"));
		GoToDownloads.click();
		test.info("GoToDownloads");
		
		//clicking of youtube
    	AndroidElement youtube=driver.findElement(MobileBy.xpath("//*[@text='Youtube']"));
    	youtube.click();
    	test.info("Youtube");

    	//providing a wait 
		Thread.sleep(4000);
		
		//enter back
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		
		
		
		
		
		//clicking on facebook
		AndroidElement facebook=driver.findElement(MobileBy.xpath("//*[@text='Facebook']"));
		facebook.click();
		test.info("facebook");
		
		
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		//clicking on twitter
		AndroidElement twitter=driver.findElement(MobileBy.xpath("//*[@text='Twitter']"));
		twitter.click();
		test.info("twitter");
		
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		
	}
	
	@Test(priority = 2)
	public void Notification() throws InterruptedException {
		
		Thread.sleep(4000);
		
		//object created for taking screenshots
		test=extnt.createTest("html Reports");
				
		//opening nnotification
		driver.openNotifications();
				
		//turn on battery saver
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		test.info("battery saver off");
		
		//turn of bttery saver
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		test.info("battery saver on");
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	@Test(priority = 3)
	public void switchTab() throws InterruptedException {
		
		Thread.sleep(2000);
		//tab switching 
		driver.activateApp("com.androidsample.generalstore");
	}
	
}
