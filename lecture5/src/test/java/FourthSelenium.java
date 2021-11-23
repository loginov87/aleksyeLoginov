import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.get(URL);
        //driver.manage().window().fullscreen();
    }


    @Test
    public void formUiTest() throws InterruptedException {
        WebElement elements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]"));
        elements.click();
        WebElement forms = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div"));
        forms.click();
        WebElement practiceForm = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div"));
        practiceForm.click();
        //Thread.sleep(2000);



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
        jse.executeScript("arguments[0].value='12.12.2020';", element);
        Thread.sleep(2000);
        WebElement subject = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
        subject.sendKeys("wehwrht,wrhtrt");
        //WebElement hobbieBox = driver.findElement(By.className("custom-control-label"));
        //hobbieBox.click();


        /*
        WebElement inputEmail = driver.findElement(By.id("userEmail"));
        inputEmail.sendKeys("aleksey@gmail.com");
        */

    }

    @AfterTest
    public void end()
    {
        //driver.quit();
    }
}
