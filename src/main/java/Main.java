import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main {

    protected WebDriver driver;

    public Main(WebDriver driver){
        this.driver = driver;
    }

    public static void Click(WebElement element){
        element.click();
    }

    public static void SendKeys(WebElement element, String test){
        element.sendKeys(test);
    }

    public void ScrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
