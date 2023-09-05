package cucumber.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LocationPermissionScreen extends BaseScreen {
    public LocationPermissionScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    // ***** Elements *****
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private MobileElement allowForegroundOnlyButton;

    // ***** Methods *****
    public void clickAllowForegroundOnlyButton() {
        clickWithWait(allowForegroundOnlyButton);
    }
}
