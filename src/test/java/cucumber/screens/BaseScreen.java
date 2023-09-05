package cucumber.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BaseScreen {
    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait wait;

    public BaseScreen(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void waitUntilVisibilityOfElement(MobileElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementClickable(MobileElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(MobileElement element) {
        element.click();
    }

    public void clickWithWait(MobileElement element) {
        waitUntilElementClickable(element);
        element.click();
    }

    public String getText(MobileElement element) {
        return element.getText();
    }

    public String getTextWithWait(MobileElement element) {
        waitUntilVisibilityOfElement(element);
        return element.getText();
    }

    public void setText(MobileElement element, String text) {
        element.sendKeys(text);
    }

    public void setTextWithWait(MobileElement element, String text) {
        waitUntilElementClickable(element);
        element.sendKeys(text);
    }

    public void clearText(MobileElement element) {
        element.clear();
    }

    public void clearTextWithWait(MobileElement element) {
        waitUntilVisibilityOfElement(element);
        element.clear();
    }

    public void scrollDownUntilElementVisible(MobileElement element) {
        while (!element.isDisplayed()) {
            // Sayfanın boyutunu alın
            Dimension size = driver.manage().window().getSize();

            // Kaydırma işlemi için başlangıç ve bitiş noktalarını belirleyin
            int startY = (int) (size.height * 0.8); // Ekranın altından başla
            int endY = (int) (size.height * 0.2); // Ekranın üstüne kaydır

            // Kaydırma işlemini başlatın
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(size.width / 2, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))) // Bekleme süresi
                    .moveTo(PointOption.point(size.width / 2, endY))
                    .release()
                    .perform();
        }
    }

    public void scrollUpUntilElementVisible(MobileElement element) {
        while (!element.isDisplayed()) {
            // Sayfanın boyutunu alın
            Dimension size = driver.manage().window().getSize();

            // Kaydırma işlemi için başlangıç ve bitiş noktalarını belirleyin
            int startY = (int) (size.height * 0.2); // Ekranın üstünden başla
            int endY = (int) (size.height * 0.8); // Ekranın altına kaydır

            // Kaydırma işlemini başlatın
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(size.width / 2, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))) // Bekleme süresi
                    .moveTo(PointOption.point(size.width / 2, endY))
                    .release()
                    .perform();
        }
    }

    public void compareTextsEquality(String actualText, String expectedText) {
        Assert.assertEquals(actualText.trim(), expectedText.trim());
    }

    public void compareTextsContains(String actualText, String searchText) {
        Assert.assertTrue(StringUtils.containsIgnoreCase(actualText, searchText));
    }

}
