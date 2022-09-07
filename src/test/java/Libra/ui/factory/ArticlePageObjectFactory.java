package Libra.ui.factory;

import Libra.Platform;
import Libra.ui.Android.AndroidArticlePageObject;
import Libra.ui.ArticlePageObject;
import Libra.ui.IOS.IOSArticlePageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ArticlePageObjectFactory {
    public static ArticlePageObject get (RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()) {
            return new AndroidArticlePageObject(driver);
        } else {
            return new IOSArticlePageObject(driver);
        }
    }
}
