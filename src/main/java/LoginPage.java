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

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    // Locators
    private final By Email = By.id("Email");
    private final By Password = By.id("Password");
    private final By RememberMeButton = By.id("RememberMe");
    private final By LoginButton = By.xpath("//button[@class=\"button-1 login-button\"]");
    private final By LogoutButtonMenu = By.className("ico-logout");
    private final By UnsuccessfulMessage = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");
    public void EnterEmail(String Mail) {
        WebElement EmailElement = driver.findElement(Email);
        SendKeys(EmailElement, Mail);
    }
    public void EnterPassword(String Pass) {
        WebElement PasswordElement = driver.findElement(Password);
        ScrollToElement(PasswordElement);
        SendKeys(PasswordElement, Pass);
    }
    public void ClickOnRememberMeButton(){
        WebElement RememberMeButtonElement = driver.findElement(RememberMeButton);
        Click(RememberMeButtonElement);
    }
    public void ClickOnLoginButton() {
        WebElement LoginButtonElement = driver.findElement(LoginButton);

        Click(LoginButtonElement);
    }
    public void ClickOnLogoutButton() {
        WebElement LogoutButtonElement = wait.until(ExpectedConditions.elementToBeClickable(LogoutButtonMenu));
        ScrollToElement(LogoutButtonElement);
        Click(LogoutButtonElement);
    }
    public String GetUnsuccessfulMessage(){
        return driver.findElement(UnsuccessfulMessage).getText();
    }
}
