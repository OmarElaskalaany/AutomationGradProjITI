import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginPageTest extends Structure {
    private HomePage hp;
    private LoginPage lp;

    @Test(priority = 1)
    public void ValidLogin(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("qazxsw");
        lp.ClickOnRememberMeButton();
        lp.ClickOnLoginButton();
        lp.ClickOnLogoutButton();
    }

    @Test(priority = 2)
    public void InvalidLogin_UnRegisteredUser(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("TestingUserInvalid@gmail.com");
        lp.EnterPassword("TestingUserInvalid123!");
        lp.ClickOnRememberMeButton();
        lp.ClickOnLoginButton();
        assertTrue(lp.GetUnsuccessfulMessage().contains("Login was unsuccessful. Please correct the errors and try again."),"Could Not Found");
    }

}
