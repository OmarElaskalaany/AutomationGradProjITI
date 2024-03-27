import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegistrationPageTest extends Structure {

    private HomePage hp;
    private RegistrationPage rp;

    @Test(priority = 1)
    public void ValidRegistration(){
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
        rp.EnterPassword("qazxsw");
        rp.EnterConfirmPassword("qazxsw");
        rp.ClickOnRegisterButton();
        assertEquals(rp.GetSuccessfulMessage(),"Your registration completed", "Not Found");
        rp.ClickOnContiuneButton();
    }
    @Test(priority = 2)
    public void InValidRegistration_IncorrectEmail(){
        hp = new HomePage(driver);
        rp = hp.ClickOnRegisterButton();
        rp.ClickOnGender("M");
        rp.EnterFn("Omar");
        rp.EnterLn("Wael");
        rp.EnterDropDownDay("14");
        rp.EnterDropDownMonth("July");
        rp.EnterDropDownYear("2001");
        rp.EnterEmail("byomarwaelgmail.com");
        rp.EnterCompany("ITI");
        rp.ClickOnNewsletterButton();
        rp.EnterPassword("qazxsw");
        rp.EnterConfirmPassword("qazxsw");
        rp.ClickOnRegisterButton();
        assertEquals(rp.GetEmailErrorMessage(),"Wrong email", "Not Found");
    }
    @Test(priority = 3)
    public void InValidRegistration_PasswordDoNotMatch(){
        hp = new HomePage(driver);
        rp = hp.ClickOnRegisterButton();
        rp.ClickOnGender("M");
        rp.EnterFn("Omar");
        rp.EnterLn("Wael");
        rp.EnterDropDownDay("14");
        rp.EnterDropDownMonth("July");
        rp.EnterDropDownYear("2001");
        rp.EnterEmail("byomarwael1234@gmail.com");
        rp.EnterCompany("ITI");
        rp.ClickOnNewsletterButton();
        rp.EnterPassword("qazxsw!!");
        rp.EnterConfirmPassword("qazxsw!");
        rp.ClickOnRegisterButton();
        assertEquals(rp.GetConfirmPasswordDoNotMatch(),"The password and confirmation password do not match.", "Unmatched Password");
    }
}