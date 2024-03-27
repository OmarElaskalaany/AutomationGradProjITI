import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddToCartTest extends Structure{
    private HomePage hp;
    private LoginPage lp;

    @Test(priority = 1)
    public void AddToCart_Jewelry(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnLoginButton();
        hp.ClickOnJewelryLink();
        hp.ClickOnAddToCartRing();
        assertEquals(hp.GetProductAddedSuccessfully(),"The product has been added to your shopping cart", "Product Add To Cart Error");
        hp.ClickOnCloseNotificationButton();
        lp.ClickOnLogoutButton();
    }
    @Test(priority = 2)
    public void AddToCart_DigitalDownloads(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnLoginButton();
        hp.ClickOnDigitalDownloads();
        hp.ClickOnAddToCartNightVision();
        assertEquals(hp.GetProductAddedSuccessfully(),"The product has been added to your shopping cart", "Product Add To Cart Error");
        hp.ClickOnCloseNotificationButton();
        lp.ClickOnLogoutButton();
    }
    @Test(priority = 3)
    public void AddToCart_NikeSBZoom(){
        hp = new HomePage(driver);
        lp = hp.ClickOnLoginButton();
        lp.EnterEmail("byomarwael@gmail.com");
        lp.EnterPassword("TestingWebsite123!");
        lp.ClickOnLoginButton();
        hp.EnterTopicToSearchBar("Nike");
        hp.ClickOnSearchButton();
        hp.ClickOnNikeSBZoom();
        hp.ClickOnNikeSBZoomAddToCart();
        assertEquals(hp.GetProductAddedSuccessfully(),"The product has been added to your shopping cart", "Product Add To Cart Error");
        hp.ClickOnCloseNotificationButton();
        lp.ClickOnLogoutButton();
    }

}
