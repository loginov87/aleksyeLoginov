import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;

public class FourthSelenium {

    WebDriver driver;
    private final String URL = "https://demoqa.com/";


    @BeforeTest

    public void setup()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        //driver.manage().window().fullscreen();
    }


    @Test
    public void formUiTest() throws InterruptedException {
        /*
        WebElement elements = driver.findElement(By.xpath("//*[contains(text(), 'Elements')]"));
        elements.click();//*
        WebElement forms = driver.findElement(By.xpath("//*[@class = 'header-wrapper']/*[contains(text(), 'Forms')]"));
        forms.click();
        WebElement practiceForm = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div"));
        practiceForm.click();
*/



        WebElement firstName = driver.findElement(By.cssSelector("[placeholder='First Name']"));
        String name = "Alex";
        firstName.sendKeys(name);
        WebElement lastName = driver.findElement(By.cssSelector("[placeholder='Last Name']"));
        lastName.sendKeys("Loginov");
        WebElement email = driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        email.sendKeys("Loginov@gmail.com");
        WebElement mobileNumber = driver.findElement(By.cssSelector("[placeholder='Mobile Number']"));
        mobileNumber.sendKeys("80660240210");
        WebElement genderRadio = driver.findElement(By.className("custom-radio"));
        genderRadio.click();

        WebElement element = driver.findElement(By.id("dateOfBirthInput"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='10.10.1987';", element);



        WebElement subject = driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("Eng");
        subject.sendKeys(Keys.ENTER);
        WebElement hobbieBox = driver.findElement(By.xpath("//*[@class = 'custom-control-label'][contains(text(), 'Sports')]"));
        hobbieBox.click();

        WebElement currecntAddress = driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        currecntAddress.sendKeys("Kiev City");

        WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        state.click();
        state.sendKeys("NCR");
        state.sendKeys(Keys.ENTER);


    }

    @AfterTest
    public void end()
    {
        //driver.quit();
    }
}
