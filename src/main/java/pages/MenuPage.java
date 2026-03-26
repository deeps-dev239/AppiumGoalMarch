package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MenuPage {

    AndroidDriver driver;

    public MenuPage(AndroidDriver driver){
        this.driver = driver;
    }

    By menu = AppiumBy.accessibilityId("test-Menu");
    By logout = AppiumBy.accessibilityId("test-LOGOUT");

    public void openMenu(){
        driver.findElement(menu).click();
    }

    public void logout(){
        driver.findElement(logout).click();
    }
}