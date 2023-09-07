package cucumber.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainScreen extends BaseScreen {
    public MainScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    // ***** Elements *****
    private final By discoverPasajButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button");


    // ***** Methods *****
    public void clickDiscoverPasajButtonWithWait() {
        clickWithWait(discoverPasajButton);
    }
}
