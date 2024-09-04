package arturoCalle.runner.step.shirt;

import arturoCalle.runner.page.shirt.ArturoCalleShirtPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ArturoCalleShirtStep extends ArturoCalleShirtPage
{
    @Step("El titulo es visible")
    public boolean isVisibleTitle(String title)
    {
        WebElementFacade webElementFacade = getFindTitleShirt();
        return webElementFacade.isVisible() && webElementFacade.getText().equals(title);
    }
}