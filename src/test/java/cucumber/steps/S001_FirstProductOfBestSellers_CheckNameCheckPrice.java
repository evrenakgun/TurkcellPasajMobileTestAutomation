package cucumber.steps;

import cucumber.model.FirstProductNameOfBestSellers;
import cucumber.model.FirstProductPriceOfBestSellers;
import cucumber.utilities.ThreadLocalDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S001_FirstProductOfBestSellers_CheckNameCheckPrice extends BaseStep {

    @Before
    public void setUpScreen() {
        setUpScreens(ThreadLocalDriver.getTLDriver());
    }

    @Given("I click Allow Only Using Button in Location Permission Screen")
    public void clickAllowOnlyUsingButton() {
        locationPermissionScreen.clickAllowForegroundOnlyButton();
    }

    @Given("I click Discover Pasaj Button")
    public void clickDiscoverPasajButton() {
        mainScreen.clickDiscoverPasajButtonWithWait();
    }

    @Then("I should see Pasaj Page")
    public void checkPasajPage() {
        pasajScreen.verifyPasajPageOpen();
    }

    @When("I scroll down until First Product Price of Best Sellers visible")
    public void scrollDownUntilSeeFirstProductPrice() {
        pasajScreen.scrollDownUntilVisibleFirstProductPrice();
    }

    @When("I get Product Name in Pasaj Screen")
    public FirstProductNameOfBestSellers getProductNameInPasajScreen() {
        pasajScreen.getProductNameInMemory();
        return null;
    }

    @When("I get Product Price in Pasaj Screen")
    public FirstProductPriceOfBestSellers getProductPriceInPasajScreen() {
        pasajScreen.getProductPriceInMemory();
        return null;
    }

    @Then("I click First Product of Best Sellers")
    public void clickFirstProductOfBestSellers() {
        pasajScreen.clickFirstProductOfBestSellers();
    }

    @Then("I scroll up until Price of Product visible")
    public void scrollUpUntilSeeProductPrice() {
        firstProductOfBestSellersScreen.scrollUpUntilVisibleProductName();
    }

    @Then("I compare Product Price between Pasaj Screen and First Product of Best Sellers Product Screen")
    public void compareProductPrices() {
        firstProductOfBestSellersScreen.verifyProductPrice(getProductPriceInPasajScreen());
    }

    @Then("I scroll up until Name of Product visible")
    public void scrollUpUntilSeeProductName() {
        firstProductOfBestSellersScreen.scrollUpUntilVisibleProductName();
    }

    @Then("I compare Product Name between Pasaj Screen and First Product of Best Sellers Product Screen")
    public void compareProductNames() {
        firstProductOfBestSellersScreen.verifyProductName(getProductNameInPasajScreen());
    }

}
