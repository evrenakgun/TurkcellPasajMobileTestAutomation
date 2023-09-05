package cucumber.screens;

import cucumber.model.FirstProductNameOfBestSellers;
import cucumber.model.FirstProductPriceOfBestSellers;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PasajScreen extends BaseScreen {
    public PasajScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    private FirstProductNameOfBestSellers firstProductNameOfBestSellers;
    private FirstProductPriceOfBestSellers firstProductPriceOfBestSellers;

    // ***** Elements *****
    @AndroidFindBy(id = "00000000-0000-0037-ffff-ffff00000095")
    private MobileElement pasajTextButton;
    @AndroidFindBy(id = "00000000-0000-002f-ffff-ffff00000429")
    private MobileElement nameOfBestSellersFirstProduct;
    @AndroidFindBy(id = "00000000-0000-002f-ffff-ffff00000430")
    private MobileElement priceOfBestSellersFirstProduct;


    // ***** Methods *****
    public void verifyPasajPageOpen() {
        waitUntilVisibilityOfElement(pasajTextButton);
    }
    public void scrollDownUntilVisibleFirstProductPrice(){
        scrollDownUntilElementVisible(priceOfBestSellersFirstProduct);
    }
    public String getNameOfBestSellersFirstProduct() {
        return getText(nameOfBestSellersFirstProduct);
    }
    public String getPriceOfBestSellersFirstProduct() {
        return getText(priceOfBestSellersFirstProduct);
    }

    public void getProductNameInMemory() {
        String productNameInMemory = getNameOfBestSellersFirstProduct();
        firstProductNameOfBestSellers = new FirstProductNameOfBestSellers(productNameInMemory);
    }

    public void getProductPriceInMemory() {
        String productPriceInMemory = getPriceOfBestSellersFirstProduct();
        firstProductPriceOfBestSellers = new FirstProductPriceOfBestSellers(productPriceInMemory);
    }

    public void clickFirstProductOfBestSellers() {
        click(nameOfBestSellersFirstProduct);
    }
}
