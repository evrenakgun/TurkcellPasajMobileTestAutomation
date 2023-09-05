package cucumber.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainScreen extends BaseScreen {
    public MainScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    // ***** Elements *****
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    private MobileElement discoverPasajButton;


    // ***** Methods *****
    public void clickDiscoverPasajButtonWithWait() {
        clickWithWait(discoverPasajButton);
    }
}
