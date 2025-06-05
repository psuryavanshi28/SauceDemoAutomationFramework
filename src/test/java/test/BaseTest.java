package test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.DriverFactory;

public class BaseTest {
    protected WebDriver driver;
    
    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp() {
    	ChromeOptions options = new ChromeOptions();

        // ✅ Disable password manager and credentials service
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        
    	driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
    }
