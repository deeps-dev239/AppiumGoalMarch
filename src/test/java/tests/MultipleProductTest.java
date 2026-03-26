package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class MultipleProductTest extends BaseTest {

    @Test
    public void sortAndPurchaseMultipleProducts(){

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        // Login
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        Assert.assertTrue(loginPage.isLoginSuccessful());

        // Sort products
        productsPage.sortLowToHigh();

        // Add two products
        productsPage.addFirstProduct();
        productsPage.addSecondProduct();

        // Open cart
        productsPage.openCart();

        // Checkout
        cartPage.clickCheckout();

        checkoutPage.enterDetails("Deep","Shikha","98373");
        checkoutPage.clickContinue();
        checkoutPage.finishOrder();
    }
}