package arturoCalle.runner.test.home;

import arturoCalle.enable.ArturoCalleWebSite;
import arturoCalle.runner.step.home.ArturoCalleHomeStep;
import arturoCalle.runner.step.shirt.ArturoCalleShirtStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;

public class ArturoCalleHomeTest
{
    @Steps(shared = true)
    private ArturoCalleWebSite arturoCalleWebSite;
    @Steps(shared = true)
    private ArturoCalleHomeStep arturoCalleHomeStep;
    @Steps(shared = true)
    private ArturoCalleShirtStep arturoCalleShirtStep;

    @Given("El usuario accede al sitio web")
    public void userNavigateTo()
    {
        this.arturoCalleWebSite.navigateTo("https://www.arturocalle.com/");
    }

    @When("El usuario selecciona el botón 'Camisas' de la página principal")
    public void userAccessHomePage()
    {
        this.arturoCalleHomeStep.closePopUps();
        List<WebElementFacade> listSetButton = this.arturoCalleHomeStep.viewSetButton();
        WebElementFacade buttonShirt = this.arturoCalleHomeStep.viewButtonShirt(listSetButton);
        this.arturoCalleHomeStep.clickButtonShirt(buttonShirt);
        WebElementFacade buttonSeeMore = this.arturoCalleHomeStep.viewButtonSeeMore();
        this.arturoCalleHomeStep.clickButtonSeeMore(buttonSeeMore);
    }

    @Then("El usuario debe ser redirigido a la página de camisas")
    public void userAccessShirtPage()
    {
        Assert.assertTrue(this.arturoCalleShirtStep.isVisibleTitle("Camisas para Hombre"));
    }
}