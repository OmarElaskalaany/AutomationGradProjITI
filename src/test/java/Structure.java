import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Structure{
    protected WebDriver driver;

    @BeforeTest
    public void initialization(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
//
//    @AfterTest
//    public void Quit(){
//        driver.quit();
//    }
}
