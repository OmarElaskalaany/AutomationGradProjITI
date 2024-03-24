import org.testng.annotations.Test;

public class ChangePasswordTest extends Structure {
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
    public void ChangePassword(){
        hp = new HomePage(driver);
        ap = hp.ClickOnMyAccountButton();
        ap.ClickOnChangePasswordLink();
        ap.EnterOldPasswordInput("TestingWebsite123!");
        ap.EnterNewPasswordInput("abc123!");
        ap.EnterConfirmPasswordInput("abc123!");
        ap.ClickOnChangePasswordButton();
        ap.ClickOnCloseButtonAfterChange();
    }
    @Test(priority = 4, dependsOnMethods = "ChangePassword", alwaysRun = true)
    public void Logout(){
        lp.ClickOnLogoutButton();
    }

    @Test(priority = 5, dependsOnMethods = "Logout")
    public void TestNewPassword(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("abc123!");
        lp.ClickOnLoginButton();
    }
}
