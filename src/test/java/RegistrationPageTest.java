import org.testng.annotations.Test;

public class RegistrationPageTest extends Structure {

    private HomePage hp;
    private RegistrationPage rp;

    @Test(priority = 1, alwaysRun = true)
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
        rp.EnterPassword("TestingWebsite123!");
        rp.EnterConfirmPassword("TestingWebsite123!");
        rp.ClickOnRegisterButton();
        rp.ClickOnContiuneButton();
    }
}
