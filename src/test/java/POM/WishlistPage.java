package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistPage {

    WebDriver driver = null;

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWishlistMessage()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-favorites/div/div/div/div/div/div/div[2]/div/div[1]/a/h5"));
    }


}
