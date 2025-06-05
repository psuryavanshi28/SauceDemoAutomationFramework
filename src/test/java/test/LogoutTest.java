package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HeaderPage;
import pages.LoginPage;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutFromInventoryPage() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        new HeaderPage(driver).logout();
        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"));
    }

    @Test
    public void loginAfterLogout() {}

    @Test
    public void accessProtectedPageAfterLogout() {}
}