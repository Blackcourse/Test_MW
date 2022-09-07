package Libra.ui.factory;

import Libra.Platform;
import Libra.ui.Android.AndroidSearchPageObject;
import Libra.ui.IOS.IOSSearchPageObject;
import Libra.ui.Mobile_web.MWSearchPageObject;
import Libra.ui.SearchPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchPageObjectFactory {
    public static SearchPageObject get(RemoteWebDriver driver) {
        if (Platform.getInstance().isAndroid()) {
            return new AndroidSearchPageObject(driver);
        } else if(Platform.getInstance().isIOS()) {
            return new IOSSearchPageObject(driver);
        }
        else  {
            return new MWSearchPageObject(driver);

        }
    }
}
