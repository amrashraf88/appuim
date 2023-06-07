package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ForgotPassword {
    WebDriver driver = null;

    public ForgotPassword(WebDriver driver)
    {
        this.driver = driver;
    }
   
    public void emailAddress() throws FileNotFoundException {
        File emailFile = new File("/home/amr/Downloads/hotfix_final/fileName2.txt");
        Scanner emailScanner = new Scanner(emailFile);
        String email = emailScanner.nextLine();
        emailScanner.close();

// Read phone from phone.txt
        File phoneFile = new File("/home/amr/Downloads/hotfix_final/fileName.txt");
        Scanner phoneScanner = new Scanner(phoneFile);
        String phone = phoneScanner.nextLine();
        phoneScanner.close();

// Find the element that determines whether to send email or phone
        WebElement forget_password = driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/embryo-forgotpassword/div/div/div/div/div/div[2]/mat-card/form/div[1]/mat-form-field/div/div[1]/div/input"));


        if (forget_password.isDisplayed()) {
            try {
                WebElement phoneInput = driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/embryo-forgotpassword/div/div/div/div/div/div[2]/mat-card/form/div[1]/mat-form-field/div/div[1]/div/span[2]/label"));

                if (phoneInput.isDisplayed()) {
                    forget_password.click();
                    forget_password.sendKeys(phone);
                    // Element is displayed, send phone number
                    }
            } catch (Exception e) {
                forget_password.click();
                forget_password.sendKeys(email);

            }
        }
        else {   WebElement emailInput = driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/div[1]/mat-form-field/div/div[1]/div/span/label/span"));
            emailInput.sendKeys(email);
        }

    }

    public WebElement recoverButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"en\"]/app-root/div/mat-sidenav-container/mat-sidenav-content/div/embryo-forgotpassword/div/div/div/div/div/div[2]/mat-card/form/button"));
    }

    public WebElement getRecoverMessage()
    {
        return driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/embryo-forgotpassword/div/div/div/div/div/div[2]/mat-card/div"));
    }
}
