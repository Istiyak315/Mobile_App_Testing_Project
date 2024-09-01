package Cap_File;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MxPlayer_cap {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
     	
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "My_emulator3");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mxtech.videoplayer.ad");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mxtech.videoplayer.ad.ActivityWelcomeMX");
        dc.setCapability(MobileCapabilityType.NO_RESET, true);
        //com.wico.emailapp.ui.settings.account.OpenPgpAppSelectDialog - SirMail
        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(url, dc);

        return driver;


 }
}
