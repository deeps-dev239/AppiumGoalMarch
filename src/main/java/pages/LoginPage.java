package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    AndroidDriver driver;
    WebDriverWait wait;

    public LoginPage(AndroidDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    By username = AppiumBy.accessibilityId("test-Username");
    By password = AppiumBy.accessibilityId("test-Password");
    By loginBtn = AppiumBy.accessibilityId("test-LOGIN");
    By productsPage = AppiumBy.accessibilityId("test-PRODUCTS");

    public void enterUsername(String user){
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(user);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }

    public boolean isLoginSuccessful(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productsPage)).isDisplayed();
    }

    public boolean isOnLoginPage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn)).isDisplayed();
    }
}