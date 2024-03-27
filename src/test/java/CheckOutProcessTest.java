import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CheckOutProcessTest extends Structure{
    private HomePage hp;
    private LoginPage lp;
    private ShoppingCart sc;

    @Test(priority = 1)
    public void ValidCheckoutProcess(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnLoginButton();
        sc = hp.ClickOnShoppingCartButton();
        sc.ClickOnTermsOfService();
        sc.ClickOnCheckOut();
        sc.EnterCountryBA("Egypt");
        sc.EnterCityBA("Cairo");
        sc.EnterAddress1BA("Mostafa El-Nahas Street");
        sc.EnterZipcodeBA("5812");
        sc.EnterPhoneBA("+201030092723");
        sc.ClickOnContinueButtonBA();
        sc.ClickOnShippingMethodContinueButton();
        sc.ClickOnCreditCardCheckBox();
        sc.ClickOnPaymentMethodContinueButton();
        sc.EnterCardHolderNamePI("OmarWael");
        sc.EnterCardNumberPI("4006 2363 7943 6948");
        sc.EnterDropDownMonthPI("12");
        sc.EnterDropDownYear("2026");
        sc.EnterCardCodePI("159");
        sc.ClickOnpaymentInformationCountinueButton();
        sc.ClickOnConfirmButtonCheckOut();
        lp.ClickOnLogoutButton();
    }
    @Test(priority = 2)
    public void InvalidCheckoutProcess_EmptyCreditCard(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnLoginButton();
        sc = hp.ClickOnShoppingCartButton();
    }
}
