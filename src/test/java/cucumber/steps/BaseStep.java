package cucumber.steps;

import cucumber.screens.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseStep {
    protected MainScreen mainScreen;
    protected PasajScreen pasajScreen;
    protected FirstProductOfBestSellersScreen firstProductOfBestSellersScreen;
    protected SearchScreen searchScreen;
    protected SearchResultScreen searchResultScreen;

    public void setUpScreens(AndroidDriver<MobileElement> driver) {
        mainScreen = new MainScreen(driver);
        pasajScreen = new PasajScreen(driver);
        firstProductOfBestSellersScreen = new FirstProductOfBestSellersScreen(driver);
        searchScreen = new SearchScreen(driver);
        searchResultScreen = new SearchResultScreen(driver);
    }
}
