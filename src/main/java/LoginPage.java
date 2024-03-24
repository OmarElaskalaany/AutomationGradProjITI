import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends Main {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Locators
    private final By Email = By.id("Email");
    private final By Password = By.id("Password");
    private final By LoginButton = By.xpath("//button[@class=\"button-1 login-button\"]");
    private final By LogoutButton = By.className("ico-logout");

    // Methods
    public void EnterEmail(String Mail) {
        WebElement EmailElement = driver.findElement(Email);
        SendKeys(EmailElement, Mail);
    }

    public void EnterPassword(String Pass) {
        WebElement PasswordElement = driver.findElement(Password);
        SendKeys(PasswordElement, Pass);
    }

    public void ClickOnLoginButton() {
        WebElement LoginButtonElement = driver.findElement(LoginButton);
        Click(LoginButtonElement);
    }

    public void ClickOnLogoutButton() {
        WebElement LogoutButtonElement = wait.until(ExpectedConditions.elementToBeClickable(LogoutButton));
        Click(LogoutButtonElement);
    }
}
