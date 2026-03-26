package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    AndroidDriver driver;
    WebDriverWait wait;

    public CartPage(AndroidDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    By checkout = AppiumBy.accessibilityId("test-CHECKOUT");
    By removeBtn = AppiumBy.accessibilityId("test-REMOVE");

    public void clickCheckout(){

        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"CHECKOUT\"));"
                )
        );

        wait.until(ExpectedConditions.visibilityOfElementLocated(checkout)).click();
    }

    public void removeProduct() throws InterruptedException{

        Thread.sleep(5000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(removeBtn)).click();

        

        // wait until product removed
        wait.until(ExpectedConditions.invisibilityOfElementLocated(removeBtn));
    }

    public boolean isCartEmpty(){

        return driver.findElements(removeBtn).size() == 0;
    }
}