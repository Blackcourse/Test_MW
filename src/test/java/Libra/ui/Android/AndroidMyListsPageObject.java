package Libra.ui.Android;

import Libra.ui.MyListPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidMyListsPageObject extends MyListPageObject {
    static
    {
        FOLDER_BY_NAME_TPL = "xpath://*[@text = '{FOLDER_NAME}']";
                ARTICLE_BY_TITLE_TPL = "xpath://*[@text = '{TITLE}']";

    }
    public AndroidMyListsPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
