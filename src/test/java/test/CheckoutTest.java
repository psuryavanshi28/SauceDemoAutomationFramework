package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutSuccessfully() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addItemToCartByIndex(0);
        inventoryPage.openCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillCustomerInfo("John", "Doe", "12345");

        new CheckoutOverviewPage(driver).clickFinish();
        String msg = new CheckoutCompletePage(driver).getConfirmationMessage();
        Assert.assertTrue(msg.contains("Thank you for your order!"));
    }

    @Test
    public void checkoutMissingFirstName() {
        // Login + add to cart + navigate to checkout
        // Submit form with missing first name and assert error
    }

    @Test
    public void checkoutMissingLastName() {}

    @Test
    public void checkoutMissingPostalCode() {}

    @Test
    public void cancelCheckoutOnStep1() {}

    @Test
    public void cancelCheckoutOnOverviewPage() {}

    @Test
    public void invalidPostalCodeFormat() {}

    @Test
    public void backToCartFromCheckoutStepOne() {}

    @Test
    public void verifyTaxCalculation() {}
}
