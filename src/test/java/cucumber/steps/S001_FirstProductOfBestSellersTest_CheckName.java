package cucumber.steps;

import cucumber.model.FirstProductNameOfBestSellers;
import cucumber.utilities.ThreadLocalDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S001_FirstProductOfBestSellersTest_CheckName extends BaseStep {

    @Before
    public void setUpScreen() {
        setUpScreens(ThreadLocalDriver.getTLDriver());
    }

    @Given("I click Discover Pasaj Button")
    public void clickDiscoverPasajButton() {
        mainScreen.clickDiscoverPasajButtonWithWait();
    }

    @Then("I should see Pasaj Page")
    public void checkPasajPage() {
        pasajScreen.verifyPasajPageOpen();
    }

    @When("I scroll down until First Product Name of Best Sellers visible")
    public void scrollDownUntilSeeFirstProductName() {
        pasajScreen.scrollDownUntilVisibleFirstProductName();
    }

    @When("I get Product Name in Pasaj Screen")
    public void getProductNameInPasajScreen() {
        pasajScreen.getProductNameInMemory();
    }

    @Then("I click First Product of Best Sellers")
    public void clickFirstProductOfBestSellers() {
        pasajScreen.clickFirstProductOfBestSellers();
    }

    @Then("I scroll up until Name of Product visible")
    public void scrollUpUntilSeeProductName() {
        firstProductOfBestSellersScreen.scrollUpUntilVisibleProductName();
    }

    @Then("I compare Product Name between Pasaj Screen and First Product of Best Sellers Product Screen")
    public void compareProductNames() {
        FirstProductNameOfBestSellers productName = pasajScreen.getFirstProductNameOfBestSellers();
        firstProductOfBestSellersScreen.verifyProductName(productName);
    }

}
