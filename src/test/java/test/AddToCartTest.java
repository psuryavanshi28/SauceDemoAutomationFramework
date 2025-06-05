package test;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addSingleItemToCart() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addItemToCartByIndex(0);
        inventoryPage.openCart();
        Assert.assertEquals(new CartPage(driver).getCartItemCount(), 1);
    }

    @Test
    public void addMultipleItemsToCart() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        
        //Add 2 items
        inventoryPage.addItemToCartByIndex(0);
        inventoryPage.addItemToCartByIndex(1);
        
        new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.textToBePresentInElement(inventoryPage.cartBadge, "2"));

        inventoryPage.openCart();
        Assert.assertEquals(new CartPage(driver).getCartItemCount(), 2);
    }

    @Test
    public void removeItemFromCart() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addItemToCartByIndex(0);
        inventoryPage.openCart();
        // Implement removal and assert item count becomes 0 (optional)
    }

    @Test
    public void navigateBackToInventoryFromCart() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.openCart();
        driver.navigate().back();
        Assert.assertTrue(inventoryPage.getInventoryCount() > 0);
    }

    @Test
    public void cartIconShouldShowItemCount() {
        // Implement cart badge count validation
    }
}