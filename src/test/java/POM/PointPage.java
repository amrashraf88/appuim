package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PointPage {
    WebDriver driver = null;

    public PointPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement pointamount(){
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/div/div[2]/div[2]/div/app-your-points/div/div/div/div/div[2]/span"));
    }

}
