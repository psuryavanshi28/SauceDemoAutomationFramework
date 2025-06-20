package pages;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage extends BasePage {

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public void logout() {
        // Click the menu button to open the sidebar
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();

        // Wait until logout link is visible and clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));

        // Click the logout link
        logoutLink.click();
    }
}