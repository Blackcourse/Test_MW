package Libra.ui.IOS;

import Libra.ui.NavigationUI;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IOSNavUi extends NavigationUI
{
    static  {
        MY_LIST_LINK = "id:Saved";
    }
    public IOSNavUi (RemoteWebDriver driver)
    {
        super(driver);
    }

}
