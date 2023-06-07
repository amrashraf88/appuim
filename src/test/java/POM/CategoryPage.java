package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage {

    WebDriver driver = null;

    public CategoryPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement categoryExist()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-productslist/app-bread-crumbs/section/div/div/div[2]/a"));
    }

    public WebElement priceFilter()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-productslist/div/div/div/div[1]/div/div[3]/div[1]/input[1]"));
    }

    public WebElement priceFilter_input(){
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-productslist/div/div/div/div[1]/div/div[3]/div[1]/input[2]"));
    }
    public WebElement apply_filter(){
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-productslist/div/div/div/div[1]/div/div[3]/div[2]/button"));
    }


    public WebElement filteredCategory()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-productslist/div/div/div/div[1]/div/div[3]/div[1]/input[2]"));
    }

    public WebElement addToCartButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-detailpage/div/div/div/embryo-shopdetails/div/div[2]/div/div[2]/div/div/div/div[2]/div/ul/li[4]/div/div[2]/div[3]/app-control-add-to-cart/span/span/button"));
    }

    public WebElement addToWishlistButton()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-detailpage/div/div/div/embryo-shopdetails/div/div[2]/div/div[2]/div/div/div/div[2]/div/ul/li[4]/div/div[2]/div[1]/button/mat-icon"));
    }

    public WebElement addToCompareButton()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[2]"));
    }

    public WebElement computerTag()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-category-view/div/div[1]/div[1]/a/div"));
    }

    public WebElement getMessageOfTag()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/app-productslist/app-bread-crumbs/section/div/div"));
    }

    public WebElement awesomeTag()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[4]/div[2]/div[1]/ul/li[2]/a"));
    }

    public static class WalletPage {
    }
}
