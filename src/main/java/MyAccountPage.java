import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage extends Main {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    // Locators
    private final By CloseButtonAfterChanging = By.xpath("//span[@class=\"close\"]");
    public void ClickOnCloseButtonAfterChange(){
        WebElement CloseButtonAfterChangingElement = driver.findElement(CloseButtonAfterChanging);
        Click(CloseButtonAfterChangingElement);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //----------------------------------------------------
    // Locators And Methods - Change Passwords
    private final By ChangePasswordLink = By.partialLinkText("Change password");
    private final By OldPasswordInput = By.id("OldPassword");
    private final By NewPasswordInput = By.id("NewPassword");
    private final By ConfirmPasswordInput = By.name("ConfirmNewPassword");
    private final By ChangePasswordButton = By.xpath("//button[@class=\"button-1 change-password-button\"]");
    private final By OldPasswordDoNotMatch = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");
    private final By PasswordChangedSuccessfully = By.xpath("//p[@class=\"content\"]");
    public void ClickOnChangePasswordLink() {
        WebElement changePasswordElement = driver.findElement(ChangePasswordLink);
        Click(changePasswordElement);
    }
    public void EnterOldPasswordInput(String OldPass) {
        WebElement oldPasswordInputElement = driver.findElement(OldPasswordInput);
        SendKeys(oldPasswordInputElement, OldPass);
    }
    public void EnterNewPasswordInput(String NewPass) {
        WebElement newPasswordInputElement = driver.findElement(NewPasswordInput);
        SendKeys(newPasswordInputElement, NewPass);
    }
    public void EnterConfirmPasswordInput(String ConPass) {
        WebElement confirmPasswordInputElement = driver.findElement(ConfirmPasswordInput);
        SendKeys(confirmPasswordInputElement, ConPass);
    }
    public void ClickOnChangePasswordButton() {
        WebElement changePasswordButtonElement = driver.findElement(ChangePasswordButton);
        Click(changePasswordButtonElement);
    }
    public String GetOldPasswordDoNotMatch(){
        return driver.findElement(OldPasswordDoNotMatch).getText();
    }
    public String GetPasswordChangedSuccessfully(){
        return driver.findElement(PasswordChangedSuccessfully).getText();
    }

    //----------------------------------------------------
    // Locators And Methods - Add Address
    private final By AddressesButton = By.partialLinkText("Addresses");
    private final By AddNewAddress = By.xpath("//button[@class=\"button-1 add-address-button\"]");
    private final By FirstnameAddress = By.id("Address_FirstName");
    private final By LastnameAddress = By.id("Address_LastName");
    private final By EmailAddress = By.id("Address_Email");
    private final By CompanyAddress = By.id("Address_Company");
    private final By CountryAddress = By.xpath("//select[@name=\"Address.CountryId\"]");
    private final By CityAddress = By.id("Address_City");
    private final By AdressAddress = By.id("Address_Address1");
    private final By ZipcodeAddress = By.id("Address_ZipPostalCode");
    private final By PhoneAddress = By.id("Address_PhoneNumber");
    private final By SaveButton = By.xpath("//button[@class=\"button-1 save-address-button\"]");
    private final By AddedNewAddressSuccessfully = By.xpath("//p[@class=\"content\"]");
    private final By WrongEmailMessage_Address = By.id("Address_Email-error");
    public void ClickOnAddressesButton(){
        WebElement AddressesButtonElement = driver.findElement(AddressesButton);
        Click(AddressesButtonElement);
    }
    public void ClickOnAddNewAddress(){
        WebElement AddNewAddressElement = driver.findElement(AddNewAddress);
        Click(AddNewAddressElement);
    }
    public void EnterFirstnameAddress(String FNA){
        WebElement FirstnameAddressElement = wait.until(ExpectedConditions.elementToBeClickable(FirstnameAddress));
        ScrollToElement(FirstnameAddressElement);
        SendKeys(FirstnameAddressElement, FNA);
    }
    public void EnterLastnameAddress(String LNA){
        WebElement LastnameAddressElement = driver.findElement(LastnameAddress);
        SendKeys(LastnameAddressElement, LNA);
    }
    public void EnterEmailAddress(String Mail){
        WebElement FirstEmailElement = driver.findElement(EmailAddress);
        SendKeys(FirstEmailElement, Mail);
    }
    public void EnterCompanyAddress(String Company){
        WebElement CompanyAddressElement = driver.findElement(CompanyAddress);
        SendKeys(CompanyAddressElement, Company);
    }
    public void EnterCountryAddress(String Country){
        WebElement CountryAddressElement = driver.findElement(CountryAddress);
        SendKeys(CountryAddressElement, Country);
    }
    public void EnterCityAddress(String City){
        WebElement CityAddressElement = driver.findElement(CityAddress);
        SendKeys(CityAddressElement, City);
    }
    public void EnterAdressAdress(String Address){
        WebElement AddressAddressElement = driver.findElement(AdressAddress);
        SendKeys(AddressAddressElement, Address);
    }
    public void EnterZipcodeAddress(String Zipcode){
        WebElement ZipcodeAddressElement = driver.findElement(ZipcodeAddress);
        SendKeys(ZipcodeAddressElement, Zipcode);
    }
    public void EnterPhoneAddress(String phone){
        WebElement PhoneAddressElement = driver.findElement(PhoneAddress);
        SendKeys(PhoneAddressElement, phone);
    }
    public void ClickOnSaveButton(){
        WebElement SaveButtonElement = driver.findElement(SaveButton);
        Click(SaveButtonElement);
    }
    public String GetAddedNewAddressSuccessfully(){
        return driver.findElement(AddedNewAddressSuccessfully).getText();
    }
    public String GetWrongEmailMessage_Address(){
        return driver.findElement(WrongEmailMessage_Address).getText();
    }
}
