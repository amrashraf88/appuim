package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotifactionPage {

        WebDriver driver = null;

        public NotifactionPage(WebDriver driver) {
            this.driver = driver;
        }
        public WebElement NotifactionView(){
            return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-notifications/section/div/div/table/tr[3]/td[5]/a/img"));
        }
}
