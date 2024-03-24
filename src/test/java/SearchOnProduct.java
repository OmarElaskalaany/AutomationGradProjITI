import org.testng.annotations.Test;

public class SearchOnProduct extends Structure {
    private HomePage hp;
    private LoginPage lp;
    private RegistrationPage rp;

    @Test(priority = 1)
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
    public void Search(){
        hp.EnterTopicToSearchBar("Beats");
        hp.ClickOnSearchButton();
        hp.clickOnFirstItem();
    }
}
