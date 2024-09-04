package arturoCalle.enable;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ArturoCalleWebSite
{
    @Steps(shared = true)
    private PageObject pageObject;

    @Step("Navegar al sitio web")
    public void navigateTo(String url)
    {
        this.pageObject.setDefaultBaseUrl(url);
        this.pageObject.open();
    }
}