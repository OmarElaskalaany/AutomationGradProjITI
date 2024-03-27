import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ChangePasswordTest extends Structure {
    private HomePage hp;
    private LoginPage lp;
    private MyAccountPage ap;

    @Test(priority = 1)
    public void ValidChangePassword(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("qazxsw");
        lp.ClickOnLoginButton();
        ap = hp.ClickOnMyAccountButton();
        ap.ClickOnChangePasswordLink();
        ap.EnterOldPasswordInput("qazxsw");
        ap.EnterNewPasswordInput("TestingWebsite123!");
        ap.EnterConfirmPasswordInput("TestingWebsite123!");
        ap.ClickOnChangePasswordButton();
        ap.ClickOnCloseButtonAfterChange();
        assertEquals(ap.GetPasswordChangedSuccessfully(),"Password was changed", "New Password Error");
    }

    @Test(priority = 2)
    public void InValidChangePassword_OldPasswordDoNotMatch(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnLoginButton();
        ap = hp.ClickOnMyAccountButton();
        ap.ClickOnChangePasswordLink();
        ap.EnterOldPasswordInput("TestingWebsite123");
        ap.EnterNewPasswordInput("asdfgh");
        ap.EnterConfirmPasswordInput("asdfgh");
        ap.ClickOnChangePasswordButton();
        assertEquals(ap.GetOldPasswordDoNotMatch(),"Old password doesn't match", "Old Password Error");
    }
}
