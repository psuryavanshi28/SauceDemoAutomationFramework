package test;

import org.testng.annotations.Test;

import pages.InventoryPage;
import pages.LoginPage;

public class SortTest extends BaseTest {

    @Test
    public void sortByPriceLowToHigh() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        new InventoryPage(driver).selectSortOption("lohi");
        // Assert product prices sorted correctly
    }

    @Test
    public void sortByPriceHighToLow() {}

    @Test
    public void sortByNameAToZ() {}

    @Test
    public void sortByNameZToA() {}
}