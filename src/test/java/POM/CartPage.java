package POM;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    AndroidDriver driver = null;

    public CartPage(AndroidDriver driver)
    {
        this.driver = (AndroidDriver) driver;
    }

    public WebElement getCartMessage()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/embryo-cart/div/div/div/div[1]/div/div/div[2]/div/a/h5"));
    }

    public WebElement termsAndConditions()
    {
        return driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
    }

    public WebElement checkoutButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"goToCheckout\"]"));
    }
}
