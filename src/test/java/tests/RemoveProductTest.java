package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

public class RemoveProductTest extends BaseTest {

    @Test
    public void removeProductFromCartTest() throws InterruptedException{

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        productsPage.addProduct();
        productsPage.openCart();

        cartPage.removeProduct();

        Assert.assertTrue(cartPage.isCartEmpty(),"Cart is not empty");
    }
}