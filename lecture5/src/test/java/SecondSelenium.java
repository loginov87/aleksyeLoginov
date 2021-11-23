import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SecondSelenium {

    WebDriver driver;
    private final String URL = "https://demoqa.com/";


    @BeforeTest

    public void setup()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(URL);

    }


    @Test
    public void secondUiTest()
    {

        WebElement elements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        Assert.assertEquals(elements.getText(),"Elements");

        WebElement forms = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5"));
        Assert.assertEquals(forms.getText(),"Forms");

        WebElement alert = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5"));
        Assert.assertEquals(alert.getText(),"Alerts, Frame & Windows");

        WebElement widgets = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5"));
        Assert.assertEquals(widgets.getText(),"Widgets");

        WebElement interactions = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]/h5"));
        Assert.assertEquals(interactions.getText(),"Interactions");

        WebElement book = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5"));
        Assert.assertEquals(book.getText(),"Book Store Application");



    }


    @AfterTest
    public void end()
    {
        driver.quit();
    }


}
