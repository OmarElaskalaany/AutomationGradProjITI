import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage extends Main {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    // Locators
    private final By MaleGender = By.id("gender-male");
    private final By FemaleGender = By.id("gender-female");
    private final By FirstName = By.id("FirstName");
    private final By LastName = By.id("LastName");
    private final By DropBoxDay = By.name("DateOfBirthDay");
    private final By DropBoxMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private final By DropBoxYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private final By Email = By.id("Email");
    private final By Company = By.id("Company");
    private final By Newsletter = By.id("Newsletter");
    private final By Password = By.id("Password");
    private final By ConfirmPassword = By.id("ConfirmPassword");
    private final By RegisterButton = By.id("register-button");
    private final By ContinueButton = By.xpath("//a[@class=\"button-1 register-continue-button\"]");

    // Methods
    public void ClickOnGender(String Value) {
        if (Value.equalsIgnoreCase("M")) {
            WebElement maleGenderElement = driver.findElement(MaleGender);
            Click(maleGenderElement);
        } else if (Value.equalsIgnoreCase("F")) {
            WebElement femaleGenderElement = driver.findElement(FemaleGender);
            Click(femaleGenderElement);
        } else {
            throw new IllegalArgumentException("Invalid gender value. Please provide 'M' for Male or 'F' for Female.");
        }
    }

    public void EnterFn(String FN) {
        WebElement FNElement = driver.findElement(FirstName);
        SendKeys(FNElement, FN);
    }

    public void EnterLn(String LN) {
        WebElement LNElement = driver.findElement(LastName);
        SendKeys(LNElement, LN);
    }

    public void EnterDropDownDay(String Number) {
        WebElement dropDownDayList = driver.findElement(DropBoxDay);
        Select options = new Select(dropDownDayList);
        options.selectByValue(Number);
    }

    public void EnterDropDownMonth(String Month) {
        WebElement dropDownMonthList = driver.findElement(DropBoxMonth);
        Select options = new Select(dropDownMonthList);
        options.selectByVisibleText(Month);
    }

    public void EnterDropDownYear(String Year) {
        WebElement dropDownYearList = driver.findElement(DropBoxYear);
        Select options = new Select(dropDownYearList);
        options.selectByValue(Year);
    }

    public void EnterEmail(String Mail) {
        WebElement emailElement = driver.findElement(Email);
        SendKeys(emailElement, Mail);
    }

    public void EnterCompany(String Comp) {
        WebElement companyElement = driver.findElement(Company);
        SendKeys(companyElement, Comp);
    }

    public void ClickOnNewsletterButton() {
        WebElement newsletterElement = driver.findElement(Newsletter);
        Click(newsletterElement);
    }

    public void EnterPassword(String Pass) {
        WebElement passElement = driver.findElement(Password);
        SendKeys(passElement, Pass);
    }

    public void EnterConfirmPassword(String Pass) {
        WebElement confirmPasswordElemenet = driver.findElement(ConfirmPassword);
        SendKeys(confirmPasswordElemenet, Pass);
    }

    public void ClickOnRegisterButton() {
        WebElement registerButtonElement = driver.findElement(RegisterButton);
        Click(registerButtonElement);
    }

    public void ClickOnContiuneButton() {
        WebElement continueButtonElement = wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        Click(continueButtonElement);
    }
}
