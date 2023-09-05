package cucumber.steps;

import cucumber.screens.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseStep {
    protected LocationPermissionScreen locationPermissionScreen;
    protected MainScreen mainScreen;
    protected PasajScreen pasajScreen;
    protected FirstProductOfBestSellersScreen firstProductOfBestSellersScreen;

    public void setUpScreens(AndroidDriver<MobileElement> driver) {
        locationPermissionScreen = new LocationPermissionScreen(driver);
        mainScreen = new MainScreen(driver);
        pasajScreen = new PasajScreen(driver);
        firstProductOfBestSellersScreen = new FirstProductOfBestSellersScreen(driver);
    }
}
