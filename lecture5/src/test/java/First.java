import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class First {

    WebDriver driver;
    private final String URL = "https://demoqa.com/";


    @BeforeTest

    public void setup()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get(URL);

    }


    @Test
    public void firstUiTest()
    {
        WebElement join = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img"));
        join.click();
        Assert.assertEquals(driver.getWindowHandles(),2);




    }


    @AfterTest
    public void endTest()
    {
        driver.quit();
    }


}

