## Saucedemo Automation Framework

This is a real-world automation testing framework developed using **Selenium WebDriver**, **Java**, **TestNG**, and **Maven**, built on the **Page Object Model (POM)** design pattern.  
It covers 30+ test cases for the SauceDemo e-commerce site and demonstrates framework design, execution flow, reporting, and CI/CD integration.

## Tech Stack

- **Programming Language**: Java  
- **Automation Tool**: Selenium WebDriver  
- **Test Framework**: TestNG  
- **Build Tool**: Maven  
- **Design Pattern**: Page Object Model (POM)  
- **Reporting**: ExtentReports  
- **CI/CD Integration**: Jenkins  
- **Version Control**: Git & GitHub  


---
<pre><code>## 📁 Project Structure ```

SauceDemoAutomationFramework/ ├── src/ │ ├── main/ │ │ └── java/ │ │ ├── base/ # BaseTest, BasePage, DriverFactory │ │ ├── pages/ # LoginPage, InventoryPage, etc. │ │ ├── utils/ # ScreenshotUtil, ConfigReader, WaitHelper │ │ └── listeners/ # TestListener for ExtentReports & Screenshots │ └── test/ │ └── java/ │ └── tests/ # LoginTest, CartTest, CheckoutTest, etc. ├── testng.xml # TestNG suite file ├── pom.xml # Maven configuration ├── screenshots/ # Captured screenshots on test failure └── README.md # Project documentation
  ``` </code></pre>


## Features
- 🚀 30+ real-world automated test cases  
- 🔄 Modular Page Object Model (POM) structure  
- 📸 Screenshots on failure using TestNG listeners  
- 📊 ExtentReports for rich HTML reporting  
- ⚙️ Wait handling and reusable utility methods  
- 🧪 TestNG suite for execution control  
- 🔁 Ready for integration with Jenkins or GitHub Actions

  
##  How to Run Tests

### Prerequisites:
- Java 17+
- Maven
- Chrome browser

## Run All Tests:

```bash
mvn clean test

Developed by Praveen Suryavanshi — for test automation lead interviews and real-world project experience.
