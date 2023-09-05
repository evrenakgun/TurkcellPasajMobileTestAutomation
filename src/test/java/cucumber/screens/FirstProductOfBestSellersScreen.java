package cucumber.screens;

import cucumber.model.FirstProductNameOfBestSellers;
import cucumber.model.FirstProductPriceOfBestSellers;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FirstProductOfBestSellersScreen extends BaseScreen {
    public FirstProductOfBestSellersScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    // ***** Elements *****
    @AndroidFindBy(id = "00000000-0000-002f-0000-0116000000ad")
    private MobileElement nameOfBestSellersFirstProduct;
    @AndroidFindBy(id = "00000000-0000-002f-0000-0418000000ad")
    private MobileElement priceOfBestSellersFirstProduct;

    public void scrollUpUntilVisibleProductPrice(){
        scrollUpUntilElementVisible(priceOfBestSellersFirstProduct);
    }
    public void scrollUpUntilVisibleProductName() {
        scrollUpUntilElementVisible(nameOfBestSellersFirstProduct);
    }
    public String getCurrentProductName() {
        return getText(nameOfBestSellersFirstProduct);
    }
    public String getCurrentProductPrice() {
        return getText(priceOfBestSellersFirstProduct);
    }

    public void verifyProductName(FirstProductNameOfBestSellers productName) {
        String currentProductName = getCurrentProductName();
        String memoryProductName = productName.getProductName();
        compareTextsEquality(memoryProductName, currentProductName);
    }

    public void verifyProductPrice(FirstProductPriceOfBestSellers productPriceText) {
        String currentProductPrice = getCurrentProductPrice();
        String memoryProductPrice = productPriceText.getProductPrice();
        compareTextsContains(memoryProductPrice, currentProductPrice);
    }
}
