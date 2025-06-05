package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage extends BasePage {

	@FindBy(className = "inventory_item")
    private List<WebElement> inventoryItems;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartIcon;
    
    @FindBy(css = ".inventory_item button")
    private List<WebElement> addToCartButtons;

    @FindBy(className = "product_sort_container")
    private WebElement sortDropdown;
    
    @FindBy(className = "shopping_cart_badge")
	public WebElement cartBadge;
    
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    
    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public int getInventoryCount() {
        return inventoryItems.size();
    }

    public void addItemToCartByIndex(int index) {
        addToCartButtons.get(index).click();
		new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.visibilityOf(cartBadge));
    }

    public void openCart() {
        cartIcon.click();
    }

    public void selectSortOption(String value) {
        sortDropdown.sendKeys(value);
    }
    public void logout() {
        menuButton.click();
    }
    
}