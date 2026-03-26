package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutAndLoginAgainTest(){

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        // Login
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        // Add product
        productsPage.addProduct();

        // Logout
        productsPage.openMenu();
        productsPage.logout();

        // Login again
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        // Verify login successful
        Assert.assertTrue(loginPage.isLoginSuccessful(),"Login failed after logout");
    }
}