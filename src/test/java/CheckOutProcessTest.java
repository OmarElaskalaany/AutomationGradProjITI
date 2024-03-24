import org.testng.annotations.Test;

public class CheckOutProcessTest extends Structure{
    private HomePage hp;
    private LoginPage lp;
    private RegistrationPage rp;
    private ShoppingCart sc;

    @Test(priority = 1, alwaysRun = true)
    public void RegisterationAndLogin(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnLoginButton();
        Boolean Check = hp.AssertOnAvailabilityEmail();
        if(!Check){}
        else{
            rp = hp.ClickOnRegisterButton();
            rp.ClickOnGender("M");
            rp.EnterFn("Omar");
            rp.EnterLn("Wael");
            rp.EnterDropDownDay("14");
            rp.EnterDropDownMonth("July");
            rp.EnterDropDownYear("2001");
            rp.EnterEmail("byomarwael@gmail.com");
            rp.EnterCompany("ITI");
            rp.ClickOnNewsletterButton();
            rp.EnterPassword("TestingWebsite123!");
            rp.EnterConfirmPassword("TestingWebsite123!");
            rp.ClickOnRegisterButton();
            rp.ClickOnContiuneButton();
            RegisterationAndLogin();
        }
    }
    @Test(priority = 2, dependsOnMethods = "RegisterationAndLogin", alwaysRun = true)
    public void AddToCart(){
        hp.ClickOnJewelryLink();
        hp.ClickOnAddToCartRing();
        hp.ClickOnDigitalDownloads();
        hp.ClickOnAddToCartNightVision();
        hp.EnterTopicToSearchBar("Nike");
        hp.ClickOnSearchButton();
        hp.ClickOnNikeSBZoom();
        hp.ClickOnNikeSBZoomAddToCart();
        hp.ClickOnShoppingCartButton();
    }
    @Test(priority = 3, dependsOnMethods = "AddToCart", alwaysRun = true)
    public void Checkout(){
        sc = hp.ClickOnShoppingCartButton();
        sc.ClickOnTermsOfService();
        sc.ClickOnCheckOut();
    }
    @Test(priority = 4, dependsOnMethods = "Checkout", alwaysRun = true)
    public void BillingAddress(){
        Boolean Check = sc.AssertionOnAvailabilityOfAddress();
        if(Check){
            sc.ClickOnContinueButtonBA();
        }else{
            sc.EnterCountryBA("Egypt");
            sc.EnterCityBA("Cairo");
            sc.EnterAddress1BA("Mostafa El-Nahas Street");
            sc.EnterZipcodeBA("5812");
            sc.EnterPhoneBA("+201030092723");
            sc.ClickOnContinueButtonBA();
        }
    }
    @Test(priority = 5, dependsOnMethods = "BillingAddress", alwaysRun = true)
    public void ShippingMethod(){
        sc.ClickOnShippingMethodContinueButton();
    }
    @Test(priority = 6, dependsOnMethods = "ShippingMethod", alwaysRun = true)
    public void PaymentMethod(){
        sc.ClickOnCreditCardCheckBox();
        sc.ClickOnPaymentMethodContinueButton();
    }
    @Test(priority = 7, dependsOnMethods = "PaymentMethod", alwaysRun = true)
    public void PaymentInformation(){
        sc.EnterCardHolderNamePI("OmarWael");
        sc.EnterCardNumberPI("4006 2363 7943 6948");
        sc.EnterDropDownMonthPI("12");
        sc.EnterDropDownYear("2026");
        sc.EnterCardCodePI("159");
        sc.ClickOnpaymentInformationCountinueButton();
    }
    @Test(priority = 8, dependsOnMethods = "PaymentInformation", alwaysRun = true)
    public void ConfirmOrder(){
            sc.ClickOnConfirmButtonCheckOut();
    }

}
