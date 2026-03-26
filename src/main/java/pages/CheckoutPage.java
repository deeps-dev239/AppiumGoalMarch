package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    AndroidDriver driver;
    WebDriverWait wait;

    public CheckoutPage(AndroidDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    By firstName = AppiumBy.accessibilityId("test-First Name");
    By lastName = AppiumBy.accessibilityId("test-Last Name");
    By zip = AppiumBy.accessibilityId("test-Zip/Postal Code");

    By continueBtn = AppiumBy.accessibilityId("test-CONTINUE");
    By finishBtn = AppiumBy.accessibilityId("test-FINISH");

    // Enter checkout information
    public void enterDetails(String f, String l, String z){

        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(f);
        driver.findElement(lastName).sendKeys(l);
        driver.findElement(zip).sendKeys(z);
    }

    // Click continue to go to Checkout Overview page
    public void clickContinue(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueBtn)).click();
    }

    // Scroll and click Finish
    public void finishOrder(){

        // Scroll to FINISH button if not visible
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"FINISH\"));"
                )
        );

        wait.until(ExpectedConditions.visibilityOfElementLocated(finishBtn)).click();
    }
}