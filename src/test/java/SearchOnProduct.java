import org.testng.annotations.Test;

public class SearchOnProduct extends Structure {
    private HomePage hp;
    private LoginPage lp;

    @Test(priority = 1)
    public void Search(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnLoginButton();
        hp.EnterTopicToSearchBar("Beats");
        hp.ClickOnSearchButton();
        hp.clickOnFirstItem();
    }
}
