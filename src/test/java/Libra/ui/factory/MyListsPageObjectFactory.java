package Libra.ui.factory;

import Libra.Platform;
import Libra.ui.Android.AndroidMyListsPageObject;
import Libra.ui.IOS.IOSMyListsPageObject;
import Libra.ui.MyListPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyListsPageObjectFactory {
    public static MyListPageObject get (RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()) {
            return new AndroidMyListsPageObject(driver);
        } else {
            return new IOSMyListsPageObject(driver);
        }
    }

}
