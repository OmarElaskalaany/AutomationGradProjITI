import org.testng.annotations.Test;

public class AddAddress extends Structure{
    private HomePage hp;
    private LoginPage lp;
    private RegistrationPage rp;
    private MyAccountPage ap;

    @Test(priority = 1, alwaysRun = true)
    public void Registration(){
        hp = new HomePage(driver);
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
    }
    @Test(priority = 2, dependsOnMethods = "Registration", alwaysRun = true)
    public void Login(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnLoginButton();
    }
    @Test(priority = 3, dependsOnMethods = "Login", alwaysRun = true)
    public void AddNewAddress(){
        hp = new HomePage(driver);
        ap = hp.ClickOnMyAccountButton();
        ap.ClickOnAddressesButton();
        ap.ClickOnAddNewAddress();
    }
    @Test(priority = 4, dependsOnMethods = "AddNewAddress", alwaysRun = true)
    public void EnterAddressInputs(){
        ap.EnterFirstnameAddress("Omar");
        ap.EnterLastnameAddress("Elaskalany");
        ap.EnterEmailAddress("omarwailamin@gmail.com");
        ap.EnterCompanyAddress("ITI");
        ap.EnterCountryAddress("Egypt");
        ap.EnterCityAddress("Cairo");
        ap.EnterAdressAdress("Mostafa El-Nahas Street, NasrCity");
        ap.EnterZipcodeAddress("13567");
        ap.EnterPhoneAddress("+201030092723");
        ap.ClickOnSaveButton();
        ap.ClickOnCloseButtonAfterChange();
    }
}
