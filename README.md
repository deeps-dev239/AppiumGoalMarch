# Appium Android Automation – Sauce Labs

## 📌 Project Overview

This project demonstrates **mobile test automation using Appium** for an Android application.
The tests are executed on **Sauce Labs cloud devices** using **Java, TestNG, and Maven**.

The purpose of this project is to automate basic mobile app functionalities and integrate the tests with **cloud testing platforms like Sauce Labs**.

---

## 🚀 Tech Stack

* **Programming Language:** Java
* **Automation Tool:** Appium
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Cloud Platform:** Sauce Labs
* **CI/CD:** GitHub Actions
* **IDE:** VS Code / IntelliJ

---

## 📱 Application Under Test

**Android Sauce Labs Sample App**

APK used in the project:

```
Android.SauceLabs.Mobile.Sample.app.2.7.1.apk
```

The application is used to demonstrate:

* Login functionality
* Product listing
* Add to cart
* Checkout process

---

## ⚙️ Project Structure

```
appiumgoal
│
├── src
│   └── test
│       ├── java
|       |   |
│       │   │
│       │   ├── pages
│       │   │   └── LoginPage.java
│       │   │
│       │   └── tests
│       │       └── LoginTest.java
│       │
│       └── resources
│
├── apps
│   └── Android.SauceLabs.Mobile.Sample.app.2.7.1.apk
│
├── pom.xml
└── README.md
```

---

## 🧪 Test Scenarios Automated

* Verify app launch
* Verify login with valid credentials
* Verify login with invalid credentials
* Verify product list page
* Verify add product to cart

---

## ☁️ Running Tests on Sauce Labs

### 1️⃣ Create Sauce Labs Account

Sign up at:

```
https://saucelabs.com
```

### 2️⃣ Add Sauce Labs Credentials

Add your **username and access key** in the test configuration.

Example:

```java
String username = "YOUR_USERNAME";
String accessKey = "YOUR_ACCESS_KEY";
```

---

### 3️⃣ Configure Desired Capabilities

Example configuration:

```java
caps.setCapability("platformName", "Android");
caps.setCapability("deviceName", "Android GoogleAPI Emulator");
caps.setCapability("platformVersion", "11");
caps.setCapability("app", "storage:filename=Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
caps.setCapability("automationName", "UiAutomator2");
```

---

## ▶️ Running Tests

Run tests using Maven:

```
mvn test
```

---

## 📊 Test Execution

Test execution results can be viewed in the **Sauce Labs Dashboard**.

Dashboard:

```
https://app.saucelabs.com
```

---

## 🔄 CI/CD Integration

This project can be integrated with **GitHub Actions** to run automated mobile tests on every push.

Example workflow:

* Checkout repository
* Setup Java
* Install dependencies
* Run Maven tests
* Execute tests on Sauce Labs devices

---

## 📚 Learning Outcomes

Through this project:

* Implemented **Appium mobile automation**
* Executed tests on **Sauce Labs cloud devices**
* Structured automation project using **Page Object Model**
* Integrated **CI/CD using GitHub Actions**

---

## 👩‍💻 Author

Deeps

Mobile Automation using **Appium + Sauce Labs**
