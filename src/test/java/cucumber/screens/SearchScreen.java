package cucumber.screens;

import cucumber.model.WordInSearchTextBox;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import static cucumber.utilities.constants.SearchBoxConstants.*;

public class SearchScreen extends BaseScreen {
    public SearchScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    private WordInSearchTextBox wordInSearchTextBox;

    // ***** Elements *****
    private final By searchBox = By.id("com.ttech.android.onlineislem:id/editTextSearchBox");


    // ***** Methods *****
    public void setSearchTextBox() {
        setTextWithWait(searchBox, SEARCH_WORD);
    }

    public void clickEnterKey() {
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
}
