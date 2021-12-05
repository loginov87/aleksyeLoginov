package HomeTask10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Checkboxes {

    WebDriver driver;
    private final String URL = "https://demoqa.com/checkbox ";

    @BeforeTest

    public void setup()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(URL);

    }
    @Test
    public void tUiTest() {
        WebElement downMenu = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/span/button"));
        downMenu.click();
        WebElement downloads = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/ol/li[3]/span/button"));
        downloads.click();
        WebElement wordFile = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
        WebElement exelFile = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]"));
        Assert.assertEquals((driver.findElement(By.id("tree-node-wordFile")).isSelected()),false);
        Assert.assertEquals((driver.findElement(By.id("tree-node-excelFile")).isSelected()),false);
        wordFile.click();
        exelFile.click();
        Assert.assertEquals((driver.findElement(By.id("tree-node-wordFile")).isSelected()),true);
        Assert.assertEquals((driver.findElement(By.id("tree-node-excelFile")).isSelected()),true);

/*
        WebElement inputName = driver.findElement(By.id("userName"));
        String name = "Aleksey";
        inputName.sendKeys(name);
        WebElement inputEmail = driver.findElement(By.id("userEmail"));
        String email = "aleksey@gmail.com";
        inputEmail.sendKeys(email);
        WebElement inputAddress = driver.findElement(By.id("currentAddress"));
        String address = "Kiev City";
        inputAddress.sendKeys(address);
        WebElement inputPermanentAddress = driver.findElement(By.id("permanentAddress"));
        String permanentAddress = "Ukraine Village";
        inputPermanentAddress.sendKeys(permanentAddress);

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
*/

    }


    @AfterTest
    public void end()
    {
        driver.quit();
    }
}
