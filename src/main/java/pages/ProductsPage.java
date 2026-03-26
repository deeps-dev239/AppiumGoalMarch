package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {

    AndroidDriver driver;
    WebDriverWait wait;

    public ProductsPage(AndroidDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By sortBtn = AppiumBy.accessibilityId("test-Modal Selector Button");
    By lowToHigh = AppiumBy.xpath("//android.widget.TextView[@text='Price (low to high)']");

    By addBackpack = AppiumBy.accessibilityId("test-ADD TO CART");
    By addBikeLight = AppiumBy.accessibilityId("test-ADD TO CART");

    By cartIcon = AppiumBy.accessibilityId("test-Cart");
    By menuBtn = AppiumBy.accessibilityId("test-Menu");
    By logoutBtn = AppiumBy.accessibilityId("test-LOGOUT");

    public void sortLowToHigh(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(sortBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(lowToHigh)).click();
    }

    public void addFirstProduct(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(addBackpack)).click();
    }

    public void addSecondProduct(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(addBikeLight)).click();
    }

    // NEW METHOD (Scenario 3 use)
    public void addProduct(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(addBackpack)).click();
    }

    public void openCart(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(cartIcon)).click();
    }

   

public void openMenu(){

    wait.until(ExpectedConditions.visibilityOfElementLocated(menuBtn)).click();
}

public void logout(){

    wait.until(ExpectedConditions.visibilityOfElementLocated(logoutBtn)).click();
}
}