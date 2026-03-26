package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AppLoginTest extends BaseTest {

    @Test
    public void validLoginTest(){

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        Assert.assertTrue(
                loginPage.isLoginSuccessful(),
                "Login Failed - Products page not displayed"
        );
    }
}