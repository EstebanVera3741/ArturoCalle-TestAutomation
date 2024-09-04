package arturoCalle.runner.page.home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ArturoCalleHomePage extends PageObject
{
    @FindBy(css = "div #cookiescript_accept")
    private WebElementFacade findPopUpCookies;
    @FindBy(css = ".vtex-tab-layout-0-x-listContainer .vtex-tab-layout-0-x-listItem")
    private List<WebElementFacade> findListSetButton;
    @FindBy(css = "[href='/camisas-hombre']")
    private WebElementFacade findButtonSeeMore;

    public List<WebElementFacade> getFindListSetButton()
    {
        return findListSetButton;
    }

    public WebElementFacade getFindButtonSeeMore()
    {
        return findButtonSeeMore;
    }

    public WebElementFacade getFindPopUpCookies()
    {
        return findPopUpCookies;
    }
}