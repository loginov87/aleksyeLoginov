package HomeTask10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jsoup.nodes.Document;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;



public class PracticeForm {

    WebDriver driver;
    private final String URL = "https://demoqa.com/automation-practice-form";



    @BeforeTest

    public void setup()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(URL);

    }


    @Test
    public void UiTest() throws InterruptedException {
        driver.findElement(By.id("firstName")).sendKeys("Alex");
        driver.findElement(By.id("lastName")).sendKeys("Loginov");
        driver.findElement(By.id("userEmail")).sendKeys("alex@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div[1]")).click();
        driver.findElement(By.id("userNumber")).sendKeys("0660240210");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[3]")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("Ukraine, Kiev City");

        WebDriverWait state = new WebDriverWait(driver, 20);
        state.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("react-select-3-input")))).sendKeys("Haryana", Keys.ENTER);

        WebDriverWait city = new WebDriverWait(driver, 20);
        city.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("react-select-4-input")))).sendKeys("Karnal", Keys.ENTER);

        WebElement subContainer = driver.findElement(By.id("subjectsInput"));
        subContainer.sendKeys("Ger");
        subContainer.sendKeys(Keys.ENTER);






        //Setup date of birth
        driver.findElement(By.id("dateOfBirthInput")).clear();
        WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
        Select monthCombo = new Select(month);
        monthCombo.selectByVisibleText("March");
        WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
        Select yearCombo = new Select(year);
        yearCombo.selectByVisibleText("1987");
        ((JavascriptExecutor) driver).executeScript("scroll(0,200)");
        driver.findElement(By.xpath("//div[contains(text(), '5')]")).click();



        driver.findElement(By.id("submit")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = 'modal-content']")).isDisplayed(), true);


    }


    @AfterTest
    public void end()
    {
        //driver.quit();
    }
}
