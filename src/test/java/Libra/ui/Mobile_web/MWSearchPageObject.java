package Libra.ui.Mobile_web;

import Libra.ui.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWSearchPageObject extends SearchPageObject {
    static {
        SEARCH_INIT_ELEMENT = "css:button#searchIcon']";
        SEARCH_INPUT = "xpath:(//input[@name='search'])[2]";
        SEARCH_CANCEL_BUTTON = "css:button.cancel";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://div [contains (@class, 'wikipedia-desription')] [contains (text)), '{SUBSTRING}')]";
        SEARCH_RESULT_ELEMENT = "css:ul.page-list>li.page-summary";
        SEARCH_EMPTY_RESULT_ELEMENT = "css:p.without-results";
    }
    public MWSearchPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }
}
