package cucumber.screens;

import cucumber.model.FirstProductNameOfBestSellers;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FirstProductOfBestSellersScreen extends BaseScreen {
    public FirstProductOfBestSellersScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    // ***** Elements *****
    // Örnek: "Lenovo Lecoo EW302 Kablosuz Kulaklık"
    private final By nameOfBestSellersFirstProduct = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
    private final By imageOfBestSellersFirstProduct = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Image");


    // ***** Methods *****
    public void scrollUpUntilVisibleProductName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(imageOfBestSellersFirstProduct));
        scrollUpUntilElementVisible(nameOfBestSellersFirstProduct);
    }
    public String getCurrentProductName() {
        return getText(nameOfBestSellersFirstProduct);
    }

    public void verifyProductName(FirstProductNameOfBestSellers productName) {
        String currentProductName = getCurrentProductName();
        String memoryProductName = productName.getProductName();
        compareTextsEquality(memoryProductName, currentProductName);
    }
}
