package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.ProductPage;

public class EcommerceUITest {
    WebDriver driver;
    ProductPage productPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://fakestore.test"); // replace with actual URL
        productPage = new ProductPage(driver);
    }

    @Test(priority = 1)
    public void testAddToCartFlow() {
        productPage.addItemToCart();
        productPage.proceedToCheckout();
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
