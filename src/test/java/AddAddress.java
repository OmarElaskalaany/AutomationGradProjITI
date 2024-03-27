import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddAddress extends Structure{
    private HomePage hp;
    private LoginPage lp;
    private MyAccountPage ap;

    @Test(priority = 1)
    public void ValidAddressInputs(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnRememberMeButton();
        lp.ClickOnLoginButton();
        ap = hp.ClickOnMyAccountButton();
        ap.ClickOnAddressesButton();
        ap.ClickOnAddNewAddress();
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
        assertEquals(ap.GetAddedNewAddressSuccessfully(),"The new address has been added successfully.", "Not Saved - Add Address");
        ap.ClickOnCloseButtonAfterChange();
        lp.ClickOnLogoutButton();
    }
    @Test(priority = 2)
    public void InvalidAddressInputs_WrongEmail(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnRememberMeButton();
        lp.ClickOnLoginButton();
        ap = hp.ClickOnMyAccountButton();
        ap.ClickOnAddressesButton();
        ap.ClickOnAddNewAddress();
        ap.EnterFirstnameAddress("Omar");
        ap.EnterLastnameAddress("Elaskalany");
        ap.EnterEmailAddress("omarwailamingmail.com");
        ap.EnterCompanyAddress("ITI");
        ap.EnterCountryAddress("Egypt");
        ap.EnterCityAddress("Cairo");
        ap.EnterAdressAdress("Mostafa El-Nahas Street, NasrCity");
        ap.EnterZipcodeAddress("13567");
        ap.EnterPhoneAddress("+201030092723");
        assertEquals(ap.GetWrongEmailMessage_Address(),"Wrong email", "Wrong email - Add Address");
    }
}
