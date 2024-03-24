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

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    // Locators
    private final By Login = By.className("ico-login");
    private final By Register = By.className("ico-register");
    private final By MyAccount = By.className("ico-account");
    private final By SearchBar = By.id("small-searchterms");
    private final By SearchButton = By.xpath("//button[@class=\"button-1 search-box-button\"]");
    private final By FirstItem = By.xpath("//a[@title=\"Show details for Beats Pill 2.0 Wireless Speaker\"]");
    private final By Jewelry = By.xpath("(//a[@href=\"/jewelry\"])[1]");
    private final By DigitalDownloads = By.xpath("//a[@href=\"/digital-downloads\"]");
    private final By AddToCartRing = By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]");
    private final By AddToCartNightVisions = By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]");
    private final By NikeSBZoom = By.partialLinkText("Nike SB Zoom Stefan Janoski \"Medium Mint\"");
    private final By NikeSBZoomAddToCart = By.id("add-to-cart-button-26");
    private final By ShoppingCartButton = By.id("topcartlink");
    private final By NoCustomers = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");

    // Methods
    public Boolean AssertOnAvailabilityEmail(){
        WebElement NoCustomersElement = wait.until(ExpectedConditions.elementToBeClickable(NoCustomers));
        Boolean Check = NoCustomersElement.isDisplayed();
        Assert.isTrue(Check, "Not Registered");
        return Check;
    }
    public ShoppingCart ClickOnShoppingCartButton(){
        WebElement ShoppingCartButtonElement = driver.findElement(ShoppingCartButton);
        ScrollToElement(ShoppingCartButtonElement);
        Click(ShoppingCartButtonElement);
        return new ShoppingCart(driver);
    }
    public LoginPage ClickOnLoginButton() {
        WebElement LoginElement = driver.findElement(Login);
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
    public void clickOnFirstItem(){
        WebElement FirstItemElement = driver.findElement(FirstItem);
        Main.Click(FirstItemElement);
    }
    public void ClickOnSearchButton(){
        WebElement SearchButtonElement = wait.until(ExpectedConditions.elementToBeClickable(SearchButton));
        ScrollToElement(SearchButtonElement);
        Click(SearchButtonElement);
    }
    public void EnterTopicToSearchBar(String Topic){
        WebElement SearchBarElement = driver.findElement(SearchBar);
        ScrollToElement(SearchBarElement);
        SendKeys(SearchBarElement, Topic);
    }

    public void ClickOnJewelryLink(){
        WebElement JewelryElement = driver.findElement(Jewelry);
        Click(JewelryElement);
    }
    public void ClickOnDigitalDownloads(){
        WebElement DigitalDownloadsElement = driver.findElement(DigitalDownloads);
        ScrollToElement(DigitalDownloadsElement);
        Click(DigitalDownloadsElement);
    }
    public void ClickOnAddToCartRing(){
        WebElement AddToCartRingElement = driver.findElement(AddToCartRing);
        ScrollToElement(AddToCartRingElement);
        Click(AddToCartRingElement);
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
}
