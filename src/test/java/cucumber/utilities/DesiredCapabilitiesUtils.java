package cucumber.utilities;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesUtils {
    public DesiredCapabilities getDesiredCapabilities(String udid, String platformVersion) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 2 API 30");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability("appium:platformVersion", "11.0");
        capabilities.setCapability("appium:appPackage", "com.ttech.android.onlineislem");
        capabilities.setCapability("appium:appActivity", "com.ttech.android.onlineislem.ui.splash.SplashActivity");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:skipUnlock", "true");
        capabilities.setCapability("appium:noReset", "false");
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");

        return capabilities;
    }
}
