## Saucedemo Automation Framework

This is a robust and scalable Selenium WebDriver automation framework built in **Java + TestNG**, using the [SauceDemo](https://www.saucedemo.com/) website. It includes **30+ real-world test cases**, screenshots on failure.

## Tech Stack

- **Java 17+**
- **Selenium WebDriver 4+**
- **TestNG**
- **Extent Reports**
- **Maven** (Build + Dependency Management)
- **Page Object Model (POM)**
- **Screenshot on failure (TestNG Listener)**

---

## 📁 Project Structure

SauceDemoAutomationFramework/
├── src/
│ ├── main/
│ │ └── java/
│ │ ├── base/ # BaseTest, BasePage, DriverFactory
│ │ ├── pages/ # Page classes: LoginPage, InventoryPage, etc.
│ │ ├── utils/ # ScreenshotUtil, ConfigReader, WaitHelper
│ │ └── listeners/ # TestListener for ExtentReports & Screenshots
│ └── test/
│ └── java/
│ └── test/ # Test classes: LoginTest, CartTest, CheckoutTest, etc.
├── testng.xml # TestNG suite file
├── pom.xml # Maven project configuration
├── screenshots/ # Captured screenshots on test failure
└── README.md # Project documentation

## ✅ Features

- 🔹 Page Object Model (POM) Design Pattern
- 🔹 Modular test structure with reusability
- 🔹 30+ real-world functional test cases
- 🔹 Extent HTML Reporting with screenshots on failure
- 🔹 Configurable browser setup
- 🔹 Wait handling using custom WaitHelper
- 🔹 Easily pluggable into CI tools like Jenkins or GitHub Actions

## 🚀 How to Run Tests

### ✅ Prerequisites:
- Java 17+
- Maven
- Chrome browser

### 🧪 Run All Tests:

```bash
mvn clean test
