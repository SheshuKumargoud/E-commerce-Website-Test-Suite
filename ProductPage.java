package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    By addToCartButton = By.id("add-to-cart");
    By checkoutButton = By.id("checkout");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();
    }
}