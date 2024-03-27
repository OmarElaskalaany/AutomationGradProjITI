import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class Structure{
    protected WebDriver driver;

    @BeforeClass
    public void initialization(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        HomePage();
    }

    @BeforeMethod
    public void HomePage(){
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterClass
    public void Quit(){
        driver.quit();
    }
}
