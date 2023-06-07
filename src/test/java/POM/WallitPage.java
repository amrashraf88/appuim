package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WallitPage {


    WebDriver driver = null;

    public WallitPage(WebDriver driver) {
        this.driver = driver;
    }
    public  WebElement wallitamount(){
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-account/div/div/div/div/div[2]/div[2]/div/app-customer-wallet-history/mat-card/div/h3"));
    }
    public WebElement Wallitbutton() {
        return driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[2]/button"));
    }
}
