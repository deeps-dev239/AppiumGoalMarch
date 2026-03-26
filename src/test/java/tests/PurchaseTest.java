package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class PurchaseTest extends BaseTest {

    @Test
    public void endToEndPurchaseTest(){

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        MenuPage menuPage = new MenuPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        Assert.assertTrue(loginPage.isLoginSuccessful());

        productsPage.addFirstProduct();
        productsPage.openCart();

        cartPage.clickCheckout();

        checkoutPage.enterDetails("Deep","Shikha","98765");
        checkoutPage.clickContinue();
        checkoutPage.finishOrder();

        menuPage.openMenu();
        menuPage.logout();
    }
}