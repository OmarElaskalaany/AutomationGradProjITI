import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCart extends Main{
    public ShoppingCart(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    private final By TermsOfService = By.id("termsofservice");
    private final By CheckOut = By.id("checkout");
    private final By CityBA = By.name("BillingNewAddress.City");
    private final By Address1BA = By.id("BillingNewAddress_Address1");
    private final By ZipcodeBA = By.id("BillingNewAddress_ZipPostalCode");
    private final By PhoneBA = By.id("BillingNewAddress_PhoneNumber");
    private final By ContinueButtonBA = By.xpath("//button[@class=\"button-1 new-address-next-step-button\"]");
    private final By CountryBA = By.id("BillingNewAddress_CountryId");
    private final By ShippingMethodContinueButton = By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]");
    private final By PaymentMethodContinueButton = By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]");
    private final By CreditCardCheckBox = By.id("paymentmethod_1");
    private final By CardHolderNamePI = By.id("CardholderName");
    private final By CardNumberPI = By.id("CardNumber");
    private final By ExpirationMonthPI = By.id("ExpireMonth");
    private final By ExpirationyearPI = By.id("ExpireYear");
    private final By CardCodePI = By.id("CardCode");
    private final By paymentInformationCountinueButton = By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]");
    private final By AssertionText = By.id("billing-address-select");
    private final By ConfirmButtonCheckOut = By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]");

    public void ClickOnConfirmButtonCheckOut(){
        WebElement ConfirmButtonCheckOutElement = wait.until(ExpectedConditions.elementToBeClickable(ConfirmButtonCheckOut));
        ScrollToElement(ConfirmButtonCheckOutElement);
        Click(ConfirmButtonCheckOutElement);
    }
    public Boolean AssertionOnAvailabilityOfAddress(){
        WebElement AssertionTextElement = wait.until(ExpectedConditions.elementToBeClickable(AssertionText));
        boolean Check = AssertionTextElement.isDisplayed();
        Assert.isTrue(Check,"Not Found");
        return Check;
    }
    public void ClickOnpaymentInformationCountinueButton(){
        WebElement paymentInformationCountinueButtonElement = driver.findElement(paymentInformationCountinueButton);
        ScrollToElement(paymentInformationCountinueButtonElement);
        Click(paymentInformationCountinueButtonElement);
    }
    public void EnterCardHolderNamePI(String Name){
        WebElement CardHolderNamePIElement = wait.until(ExpectedConditions.elementToBeClickable(CardHolderNamePI));
        ScrollToElement(CardHolderNamePIElement);
        SendKeys(CardHolderNamePIElement, Name);
    }
    public void EnterCardNumberPI(String Number){
        WebElement CardNumberPIElement = driver.findElement(CardNumberPI);
        ScrollToElement(CardNumberPIElement);
        SendKeys(CardNumberPIElement, Number);
    }
    public void EnterDropDownMonthPI(String Number) {
        WebElement DropDownMonthPIElement = driver.findElement(ExpirationMonthPI);
        Select options = new Select(DropDownMonthPIElement);
        options.selectByValue(Number);
    }
    public void EnterDropDownYear(String Number) {
        WebElement ExpirationyearPIElement = driver.findElement(ExpirationyearPI);
        Select options = new Select(ExpirationyearPIElement);
        options.selectByValue(Number);
    }
    public void EnterCardCodePI(String Code){
        WebElement CardCodePIElement = driver.findElement(CardCodePI);
        ScrollToElement(CardCodePIElement);
        SendKeys(CardCodePIElement, Code);
    }
    public void ClickOnShippingMethodContinueButton(){
        WebElement ShippingMethodContinueButtonElement = wait.until(ExpectedConditions.elementToBeClickable(ShippingMethodContinueButton));
        ScrollToElement(ShippingMethodContinueButtonElement);
        Click(ShippingMethodContinueButtonElement);
    }
    public void ClickOnPaymentMethodContinueButton(){
        WebElement PaymentMethodContinueButtonElement = wait.until(ExpectedConditions.elementToBeClickable(PaymentMethodContinueButton));
        ScrollToElement(PaymentMethodContinueButtonElement);
        Click(PaymentMethodContinueButtonElement);
    }
    public void ClickOnCreditCardCheckBox(){
        WebElement CreditCardCheckBoxElement = wait.until(ExpectedConditions.elementToBeClickable(CreditCardCheckBox));
        ScrollToElement(CreditCardCheckBoxElement);
        Click(CreditCardCheckBoxElement);
    }
    public void EnterCountryBA(String Country){
        WebElement CountryAddressElement = wait.until(ExpectedConditions.elementToBeClickable(CountryBA));
        SendKeys(CountryAddressElement, Country);
    }
    public void EnterCityBA(String city){
        WebElement CityBAElement = driver.findElement(CityBA);
        ScrollToElement(CityBAElement);
        SendKeys(CityBAElement, city);
    }
    public void EnterAddress1BA(String address){
        WebElement Address1BAElement = driver.findElement(Address1BA);
        SendKeys(Address1BAElement, address);
    }
    public void EnterZipcodeBA(String zipcode){
        WebElement ZipcodeBAElement = driver.findElement(ZipcodeBA);
        ScrollToElement(ZipcodeBAElement);
        SendKeys(ZipcodeBAElement, zipcode);
    }
    public void EnterPhoneBA(String mobile){
        WebElement PhoneBAElement = driver.findElement(PhoneBA);
        SendKeys(PhoneBAElement, mobile);
    }
    public void ClickOnContinueButtonBA(){
        WebElement ContinueButtonElement = driver.findElement(ContinueButtonBA);
        ScrollToElement(ContinueButtonElement);
        Click(ContinueButtonElement);
    }
    public void ClickOnTermsOfService(){
        WebElement TermOfServiceElement = driver.findElement(TermsOfService);
        ScrollToElement(TermOfServiceElement);
        Click(TermOfServiceElement);
    }
    public void ClickOnCheckOut(){
        WebElement CheckOutElement = driver.findElement(CheckOut);
        Click(CheckOutElement);
    }
}
