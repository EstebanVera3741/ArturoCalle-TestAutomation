package arturoCalle.runner.page.shirt;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ArturoCalleShirtPage extends PageObject
{
    @FindBy(css = ".vtex-rich-text-0-x-heading span")
    private WebElementFacade findTitleShirt;

    public WebElementFacade getFindTitleShirt()
    {
        return findTitleShirt;
    }
}