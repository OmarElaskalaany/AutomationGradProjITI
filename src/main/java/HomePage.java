import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Main {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    // Locators And Methods - Buttons
    private final By Login = By.className("ico-login");
    private final By Register = By.className("ico-register");
    private final By MyAccount = By.className("ico-account");
    private final By ShoppingCartButton = By.id("topcartlink");
    private final By NoCustomers = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");
    public LoginPage ClickOnLoginButton() {
        WebElement LoginElement = wait.until(ExpectedConditions.elementToBeClickable(Login));
        Click(LoginElement);
        return new LoginPage(driver);
    }
    public RegistrationPage ClickOnRegisterButton() {
        WebElement RegisterElement = driver.findElement(Register);
        Click(RegisterElement);
        return new RegistrationPage(driver);
    }
    public MyAccountPage ClickOnMyAccountButton() {
        WebElement MyAccountElement = driver.findElement(MyAccount);
        Click(MyAccountElement);
        return new MyAccountPage(driver);
    }
    public ShoppingCart ClickOnShoppingCartButton(){
        WebElement ShoppingCartButtonElement = driver.findElement(ShoppingCartButton);
        ScrollToElement(ShoppingCartButtonElement);
        Click(ShoppingCartButtonElement);
        return new ShoppingCart(driver);
    }
    public Boolean AssertOnAvailabilityEmail(){
        WebElement NoCustomersElement = wait.until(ExpectedConditions.elementToBeClickable(NoCustomers));
        Boolean Check = NoCustomersElement.isDisplayed();
        Assert.isTrue(Check, "Not Registered");
        return Check;
    }

    //--------------------------------------
    // Locators And Methods - Add To Cart
    private final By SearchBar = By.id("small-searchterms");
    private final By SearchButton = By.xpath("//button[@class=\"button-1 search-box-button\"]");
    private final By FirstItem = By.xpath("//a[@title=\"Show details for Beats Pill 2.0 Wireless Speaker\"]");
    private final By Jewelry = By.xpath("(//a[@href=\"/jewelry\"])[1]");
    private final By AddToCartRing = By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]");
    private final By DigitalDownloads = By.xpath("//a[@href=\"/digital-downloads\"]");
    private final By AddToCartNightVisions = By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]");
    private final By NikeSBZoom = By.partialLinkText("Nike SB Zoom Stefan Janoski \"Medium Mint\"");
    private final By NikeSBZoomAddToCart = By.id("add-to-cart-button-26");
    private final By ProductAddedSuccessfully = By.xpath("//*[@id='bar-notification']/div/p");
    private final By CloseNotificationButton = By.xpath("//span[@class=\"close\"]");
    public void EnterTopicToSearchBar(String Topic){
        WebElement SearchBarElement = driver.findElement(SearchBar);
        ScrollToElement(SearchBarElement);
        SendKeys(SearchBarElement, Topic);
    }
    public void ClickOnSearchButton(){
        WebElement SearchButtonElement = wait.until(ExpectedConditions.elementToBeClickable(SearchButton));
        ScrollToElement(SearchButtonElement);
        Click(SearchButtonElement);
    }
    public void clickOnFirstItem(){
        WebElement FirstItemElement = driver.findElement(FirstItem);
        Main.Click(FirstItemElement);
    }
    public void ClickOnJewelryLink(){
        WebElement JewelryElement = driver.findElement(Jewelry);
        Click(JewelryElement);
    }
    public void ClickOnAddToCartRing(){
        WebElement AddToCartRingElement = wait.until(ExpectedConditions.elementToBeClickable(AddToCartRing));
        ScrollToElement(AddToCartRingElement);
        Click(AddToCartRingElement);
    }
    public void ClickOnDigitalDownloads(){
        WebElement DigitalDownloadsElement = wait.until(ExpectedConditions.elementToBeClickable(DigitalDownloads));
        ScrollToElement(DigitalDownloadsElement);
        Click(DigitalDownloadsElement);
    }
    public void ClickOnAddToCartNightVision(){
        WebElement AddToCartNightVisionElement = driver.findElement(AddToCartNightVisions);
        ScrollToElement(AddToCartNightVisionElement);
        Click(AddToCartNightVisionElement);
    }
    public void ClickOnNikeSBZoom(){
        WebElement NikeSBZoomElement = driver.findElement(NikeSBZoom);
        ScrollToElement(NikeSBZoomElement);
        Click(NikeSBZoomElement);
    }
    public void ClickOnNikeSBZoomAddToCart(){
        WebElement NikeSBZoomAddToCartElement = driver.findElement(NikeSBZoomAddToCart);
        ScrollToElement(NikeSBZoomAddToCartElement);
        Click(NikeSBZoomAddToCartElement);
    }
    public String GetProductAddedSuccessfully(){
        wait.until(ExpectedConditions.presenceOfElementLocated(ProductAddedSuccessfully));
        return driver.findElement(ProductAddedSuccessfully).getText();
    }
    public void ClickOnCloseNotificationButton(){
        WebElement CloseNotificationButtonElement = wait.until(ExpectedConditions.elementToBeClickable(CloseNotificationButton));
        Click(CloseNotificationButtonElement);
    }
}
