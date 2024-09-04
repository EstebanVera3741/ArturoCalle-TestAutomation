package arturoCalle.enable.config;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static net.serenitybdd.core.Serenity.getDriver;

public class ArturoCalleBase
{
    protected WebDriverWait webDriverWait;

    public ArturoCalleBase()
    {
        this.webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }

    public WebDriverWait getWebDriverWait()
    {
        return this.webDriverWait;
    }

    public void waitElementVisibility(WebElementFacade webElement)
    {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitListElementVisibility(List<WebElementFacade> listWebElement)
    {
        getWebDriverWait().until(ExpectedConditions.visibilityOfAllElements((WebElement) listWebElement));
    }
}