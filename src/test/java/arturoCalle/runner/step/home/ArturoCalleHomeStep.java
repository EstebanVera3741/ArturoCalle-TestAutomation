package arturoCalle.runner.step.home;

import arturoCalle.enable.config.ArturoCalleBase;
import arturoCalle.runner.page.home.ArturoCalleHomePage;
import arturoCalle.enable.imple.home.IArturoCalleHomeStep;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import java.util.*;

public class ArturoCalleHomeStep extends ArturoCalleHomePage implements IArturoCalleHomeStep
{
    private final ArturoCalleBase ARTURO_CALLE = new ArturoCalleBase();

    @Step(IArturoCalleHomeStep.STEP_1)
    public void closePopUps()
    {
        getFindPopUpCookies().click();
    }

    @Step(IArturoCalleHomeStep.STEP_2)
    public List<WebElementFacade> viewSetButton()
    {
        return getFindListSetButton();
    }

    @Step(IArturoCalleHomeStep.STEP_3)
    public WebElementFacade viewButtonShirt(List<WebElementFacade> listSetButton)
    {
        Map<String, WebElementFacade> mapButton = new HashMap<>();
        for (WebElementFacade webElementFacade: listSetButton)
        {
            if (!mapButton.containsKey(webElementFacade.getText()))
            {
                mapButton.put(webElementFacade.getText(), webElementFacade);
            }
        }

        return mapButton.get("Camisas");
    }

    @Step(IArturoCalleHomeStep.STEP_4)
    public void clickButtonShirt(WebElementFacade buttonShirt)
    {
        buttonShirt.click();
    }

    @Step(IArturoCalleHomeStep.STEP_5)
    public WebElementFacade viewButtonSeeMore()
    {
        return getFindButtonSeeMore();
    }

    @Step(IArturoCalleHomeStep.STEP_6)
    public void clickButtonSeeMore(WebElementFacade buttonSeeMore)
    {
        this.ARTURO_CALLE.waitElementVisibility(buttonSeeMore);
        buttonSeeMore.click();
    }
}