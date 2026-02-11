# Automation Testing – Get Estimate Page

**Project:** Mandy’s Maids Cleaning Services

---
## Overview

This automation script validates the **Get an Estimate** form on the Mandy’s Maids Cleaning Services website.
The script is implemented using:
- Java
- Selenium WebDriver
- TestNG
- Microsoft Edge (EdgeDriver)
The automation focuses on form validation logic and submission behavior.

---
## Application Under Test
**URL:**  
[https://mandysmaids.com/get-an-estimate](https://mandysmaids.com/get-an-estimate)
**Page Covered:**  
Get Estimate

---
## Test Objective
The automation validates:
- Successful form submission with valid data
- Required field behavior
- Presence or absence of submission confirmation message
- Basic synchronization handling
The primary goal is to demonstrate structured Selenium automation for form-based workflows.
---
## Test Scenario Implemented
### Test Case: `formValidation_allFields`
**Scenario:**  
Submit the form with valid input in all fields and verify that a success message appears.
**High-Level Steps Automated:**
1. Launch Edge browser
2. Navigate to Get Estimate page
3. Maximize window
4. Apply implicit and page load timeouts
5. Fill all form fields
6. Accept cookie popup
7. Submit form using JavaScript click
8. Wait for confirmation message
9. Assert success
**Expected Result:**  
A confirmation message containing “Thank you for submitting” should be displayed.

---
## Test Execution Method
### Execution Control via Commenting
Test variations are controlled manually by:
- Commenting or uncommenting assertion methods
- Commenting or uncommenting specific form field input lines
Example:
```java
@Test
public void formValidation_allFields() {

    action();
    assertSuccess();
    // assertNoSuccess();

}
```
Only one assertion method is active at a time.

---
## Simulating Required Field Validation
To test negative scenarios (e.g., leaving a required field empty), the corresponding `sendKeys()` line is commented out.
Example: Leaving Phone field empty

```java
driver.findElement(nameInput).sendKeys(name);
// driver.findElement(phoneInput).sendKeys(phone);
driver.findElement(emailInput).sendKeys(email);
```

Then the negative assertion is enabled:
```java
assertNoSuccess();
```
This verifies that submission does not succeed when mandatory fields are missing.

---
## Implementation Details

### Locator Strategy
Elements are located using:
- `By.cssSelector` with stable `data-aid` attributes
- XPath for success message validation
This avoids reliance on unstable dynamic IDs.
---
### Dynamic Email Handling
Email is generated dynamically:
```
alex.morgan_<timestamp>@example.com
```
This prevents duplicate submission conflicts across multiple test runs.

---
### Synchronization Strategy
- Implicit Wait: 10 seconds
- Page Load Timeout: 30 seconds
- Explicit Wait: Used for success message visibility

---
### JavaScript-Based Submission
Form submission uses JavaScript executor:
```java
((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);
```
This ensures reliable interaction if standard `.click()` fails due to UI overlays.

---
## Assertions Implemented

### `assertSuccess()`
Waits for and verifies that the success message is visible.
### `assertNoSuccess()`
Confirms that no success message appears for invalid submissions.

---
## Test Structure
The class includes:
- `@BeforeMethod` for browser setup
- Centralized `By` locators
- Dedicated methods for:
    - Form action
    - Positive assertion
    - Negative assertion
    - Page reset
The script is implemented as a single test class without Page Object Model abstraction.

---
## Test Environment
- Browser: Microsoft Edge
- OS: Windows
- Automation Tool: Selenium WebDriver
- Test Framework: TestNG
- Language: Java
---
## Scope & Limitations
- Only one test method is implemented.
- Test variations are controlled manually through code commenting.
- No data-driven framework is implemented.
- No Page Object Model structure is used.
- No `@AfterMethod` teardown (`driver.quit()`) is implemented.
- No reporting framework integrated.
- No screenshot capture on failure.
The script is intentionally simplified to demonstrate core Selenium automation concepts.

---
## Potential Improvements
Future enhancements may include:
- Separate `@Test` methods for each scenario
- Data-driven testing using TestNG DataProvider
- Page Object Model (POM) implementation
- Proper teardown with `driver.quit()`
- Screenshot capture on failure
- Test reporting integration
---
## Purpose of This Automation
This implementation demonstrates:
- Practical Selenium interaction with web forms
- Required field validation logic
- Assertion-based validation
- Synchronization handling
- Structured test method organization
The focus is on foundational automation logic rather than framework complexity.

