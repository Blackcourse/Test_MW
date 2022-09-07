package Libra;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Platform {
    private static final String PLATFORM_IOS = "ios";
    private static final String PLATFORM_Android = "android";
    private static final String PLATFORM_MOBILE_WEB = "mobile_web";
    private static final String  Appium_URL= "http://0.0.0.0:4723/wd/hub";
    private static Platform instance;
    private Platform () {}

    public static Platform getInstance()
    {
        if (instance==null) {
            instance = new Platform();
        }
        return instance;
    }


    public RemoteWebDriver getDriver () throws Exception
    {
        URL URL = new URL (Appium_URL);
        if (this.isAndroid()) {
            return new AndroidDriver(URL, this.getAndroidDesiredCapp());
        } else if (this.isIOS()) {
            return new IOSDriver(URL, this.getIOSDesiredCapp());
        } else if (this.isMW()) {
            return new ChromeDriver(this.getMWChromeOptions());

        } else {
            throw new Exception("Cannot detect type of the Driver"+this.getPlatformVar());
        }
    }


    public boolean isAndroid ()
    {
        return isPlatform(PLATFORM_Android);
    }
    public boolean isIOS ()
    {
        return isPlatform(PLATFORM_IOS);
    }
    public boolean isMW ()
    {
        return isPlatform(PLATFORM_MOBILE_WEB);
    }



    private DesiredCapabilities getAndroidDesiredCapp ()
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "org.wikipedia");
        capabilities.setCapability("appActivity", ".main.MainActivity");
        capabilities.setCapability("app", "C:\\Users\\kgavr\\OneDrive\\Desktop\\Javaapp\\Javaapp\\apks\\org.wikipedia.apk");
        capabilities.setCapability("orientation", "PORTRAIT");
        return capabilities;
    }
    private DesiredCapabilities getIOSDesiredCapp ()
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "IOS");
        capabilities.setCapability("deviceName", "Iphone SE");
        capabilities.setCapability("platformVersion", "11.3");
        capabilities.setCapability("app", "C:\\Users\\kgavr\\OneDrive\\Desktop\\Javaapp\\Javaapp\\apks\\Wikipedia.app");

        return capabilities;
    }
    private ChromeOptions getMWChromeOptions ()
    {
        Map<String, Object> deviceMetrics = new HashMap<String,Object>();
        deviceMetrics.put ("width",360 );
        deviceMetrics.put ("height",640 );
        deviceMetrics.put ("pixelRatio",3.0 );
        Map<String, Object> mobileEmulatiuon = new HashMap<String,Object>();
        mobileEmulatiuon.put ("deviceMetrics", deviceMetrics);
        mobileEmulatiuon.put ("userAgent","Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("window-size=340, 640");
        return chromeOptions;

    }
    private boolean isPlatform (String my_platform)
    {
        String platform = this.getPlatformVar();
        return my_platform.equals(platform);
    }

    public String getPlatformVar () {
        return System.getenv("PLATFORM");
    }

}
