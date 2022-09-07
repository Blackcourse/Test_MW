package Libra.ui.IOS;

import Libra.ui.SearchPageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IOSSearchPageObject extends SearchPageObject {
    static {
        SEARCH_INIT_ELEMENT = "xpath://XCUIEElementTypeSearchField[@name='Search Wikipedia']";
        SEARCH_INPUT = "xpath://*[contains (@text,'Search…')]";
        SEARCH_CANCEL_BUTTON = "id:org.wikipedia:id/search_close_btn";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://*[@resource-id ='org.wikipedia:id/page_list_item_container']//*[@text='{SUBSTRING}']";
        SEARCH_RESULT_ELEMENT = "xpath://*[@resource-id='org.wikipedia:id/search_results_list']";
        SEARCH_EMPTY_RESULT_ELEMENT = "xpath://*[@text = 'No results found']";
    }
    public IOSSearchPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
