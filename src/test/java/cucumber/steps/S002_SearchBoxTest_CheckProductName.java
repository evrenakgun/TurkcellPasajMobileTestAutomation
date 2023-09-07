package cucumber.steps;

import cucumber.utilities.ThreadLocalDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S002_SearchBoxTest_CheckProductName extends BaseStep {
    @Before
    public void setUpScreen() {
        setUpScreens(ThreadLocalDriver.getTLDriver());
    }

    @When("I click SearchBox")
    public void clickSearchBox() {
        pasajScreen.clickSearchTextBox();
    }

    @When("I fills TextBox")
    public void setSearchBox() {
        searchScreen.setSearchTextBox();
    }

    @And("I tap Enter on Keyboard")
    public void clickEnterKeyOnKeyboard() {
        searchScreen.clickEnterKey();
    }

    @Then("I wait until Search Results loaded")
    public void waitUntilSearchResultsVisible() {
        searchResultScreen.waitUntilProductsVisible();
    }

    @When("I see all Product Names on the Screen")
    public void getProductNamesAfterSearch() {
        searchResultScreen.getProductNamesSearchResult();
    }

    @Then("I check Product Names is relevant to Search Text")
    public void checkProductNamesIsRelevant() {
        searchResultScreen.verifyProductNamesAfterSearch();
    }

}
