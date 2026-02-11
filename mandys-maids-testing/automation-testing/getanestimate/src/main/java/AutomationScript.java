import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationScript {

    WebDriver driver;

    @BeforeMethod
    public void base() {
        driver = new EdgeDriver();
        driver.get("https://mandysmaids.com/get-an-estimate");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    By nameInput = By.cssSelector("input[data-aid='JOB_POSTING_FORM_NAME']");
    By phoneInput = By.cssSelector("input[data-aid='JOB_POSTING_FORM_PHONE']");
    By emailInput = By.cssSelector("input[data-aid='JOB_POSTING_FORM_EMAIL']");
    By squareFootageInput = By.cssSelector("input[data-aid='Square Footage (finished)']");
    By bathroomsInput = By.cssSelector("input[data-aid='Number of full bathrooms']");
    By petsInput = By.cssSelector("input[data-aid='Number of pets']");
    By serviceInput = By.cssSelector("input[data-aid='What service would you like, Basic, Deep or Prime?']");
    By address1Input = By.cssSelector("input[data-aid='Address 1']");
    By address2Input = By.cssSelector("input[data-aid='Address 2']");
    By zipCodeInput = By.cssSelector("input[data-aid='Zip Code']");
    By cityInput = By.cssSelector("input[data-aid='City']");
    By referralTextarea = By.cssSelector("textarea[data-aid='How did you hear about us: Instagram, Facebook, A friend, door or mail flyer, or Google']");
    By submitButton = By.cssSelector("button[data-ux='ButtonPrimary']");
    By acceptCookie = By.cssSelector("a[data-ux-btn='primary']");
    By successMsg = By.xpath("//p//span[contains(text(),'Thank you for submitting')]");

    String name = "Alex Morgan";
    String phone = "8015550194";
    String email = "alex.morgan_" + System.currentTimeMillis() + "@example.com";
    String squareFootage = "1450";
    String bathrooms = "2";
    String pets = "1";
    String service = "Deep";
    String address1 = "742 Evergreen Terrace";
    String address2 = "Unit 3B";
    String zipCode = "84101";
    String city = "Salt Lake City";
    String referral = "Found you on Instagram";

    public void condition(By locator, String value) {
        if (value != null) {
            driver.findElement(locator).sendKeys(value);
        }
    }

    public void action() {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(phoneInput).sendKeys(phone);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(squareFootageInput).sendKeys(squareFootage);
        driver.findElement(bathroomsInput).sendKeys(bathrooms);
        driver.findElement(petsInput).sendKeys(pets);
        driver.findElement(serviceInput).sendKeys(service);
        driver.findElement(address1Input).sendKeys(address1);
        driver.findElement(address2Input).sendKeys(address2);
        driver.findElement(zipCodeInput).sendKeys(zipCode);
        driver.findElement(cityInput).sendKeys(city);
        //driver.findElement(referralTextarea).sendKeys(referral);

        driver.findElement(acceptCookie).click();

        WebElement submit = driver.findElement(submitButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);
    }

    public void assertSuccess() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(successMsg)
        );
        Assert.assertTrue(message.isDisplayed(), "Success Message not shown");
    }

    public void assertNoSuccess() {
        Assert.assertTrue(
                driver.findElements(successMsg).isEmpty(),
                "Success message should not be shown for invalid submissions"
        );
    }

    public void resetPage() {
        driver.navigate().refresh();
    }

    @Test
    public void formValidation_allFields() {
        action();
        assertSuccess();
        // assertNoSuccess();
    }
}
