import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;

public class Third {

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
    public void thirdtUiTest()
    {
        WebElement elements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]"));
        elements.click();
        WebElement textBox = driver.findElement(By.id("item-0"));
        textBox.click();


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

        Map<String,String> map1 = new HashMap<>();

        Map<String,String> map = new HashMap<>();
        map.put("Name", name);
        map.put("Email", email);
        map.put("Current Address", address);
        map.put("Permananet Address", permanentAddress);


        WebElement setName = driver.findElement(By.id("name"));
        String[] newName =  setName.getText().split(":");
        map1.put(newName[0],newName[1]);

        WebElement setEmail = driver.findElement(By.id("email"));
        String[] newEmail =  setEmail.getText().split(":");
        map1.put(newEmail[0],newEmail[1]);

        WebElement setAddress = driver.findElement(By.cssSelector("#currentAddress.mb-1"));
        String[] setCurrent =  setAddress.getText().split(":");
        map1.put(setCurrent[0].trim(),setCurrent[1]);

        WebElement setAddressPer = driver.findElement(By.cssSelector("#permanentAddress.mb-1"));
        String[] setPermanent =  setAddressPer.getText().split(":");

        map1.put(setPermanent[0].trim(),setPermanent[1]);

        Assert.assertEquals(map,map1);

    }


    @AfterTest
    public void end()
    {
        driver.quit();
    }
}

