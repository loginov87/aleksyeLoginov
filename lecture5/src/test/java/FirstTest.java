import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest {

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before all tests ...");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After all tests ...");
    }



    @BeforeMethod

            public void beforeEachTest()
    {
        System.out.println("This is text before each test");
    }

    @AfterMethod
            public void afterEachTest()
        {
            System.out.println("This is text after each test");
        }

        @DataProvider
    public Object[][] stringData()
        {
            int[] array = {3,6,4,9,1};
            int[] array1 = {1,7,5,6};
            int[] array2 = {};
            return new Object[][]
                    {
                            {array1,2,"I am lucky"},
                            {array,3,"Run again"},
                            {array2,1,"Run again"}
                    };
        }

        Lucky lucky = new Lucky();

        @Test(dataProvider = "stringData")
    public void isLuck(int[] array, int index, String result)
        {
            Assert.assertEquals(lucky.checkInt(array, index), result);
        }

}


