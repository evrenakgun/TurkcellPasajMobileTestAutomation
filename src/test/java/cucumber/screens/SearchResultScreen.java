package cucumber.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static cucumber.utilities.constants.SearchBoxConstants.*;

public class SearchResultScreen extends BaseScreen {
    public SearchResultScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    // ***** Elements *****
    private final By productNames = By.id("com.ttech.android.onlineislem:id/textViewTitle");


    // ***** Methods *****
    public void waitUntilProductsVisible() {
        waitUntilVisibilityOfElement(productNames);
    }

    public List<String> getProductNamesSearchResult() {
        List<MobileElement> mobileElementList = driver.findElements(productNames);
        List<String> productNamesList = new ArrayList<>();

        for (int i = 0; i < mobileElementList.size(); i++) {
            productNamesList.add(mobileElementList.get(i).getText());
        }

        return productNamesList;
    }

    public void verifyProductNamesAfterSearch() {
        List<String> namesAfterSearch = getProductNamesSearchResult();

        for (int i = 0; i < getProductNamesSearchResult().size(); i++) {
            compareTextsContains(namesAfterSearch.get(i).toLowerCase(), SEARCH_WORD.toLowerCase());
        }
    }
}
