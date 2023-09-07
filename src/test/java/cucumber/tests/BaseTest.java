package cucumber.tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import cucumber.utilities.DesiredCapabilitiesUtils;
import cucumber.utilities.ThreadLocalDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    private final DesiredCapabilitiesUtils desiredCapabilitiesUtils = new DesiredCapabilitiesUtils();

    @BeforeMethod
    @Parameters({"udid", "platformVersion"})
    public void setUp(String udid, String platformVersion) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = desiredCapabilitiesUtils.getDesiredCapabilities(udid, platformVersion);
        ThreadLocalDriver.setTLDriver(new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
        Thread.sleep(3000);
    }

    @AfterMethod
    public synchronized void tearDown() {
        ThreadLocalDriver.killDriver();
    }
}
