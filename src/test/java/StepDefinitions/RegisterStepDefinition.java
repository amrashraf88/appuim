package StepDefinitions;

import POM.HomePage;
import POM.InventoryPage;
import POM.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;

import static StepDefinitions.Hooks.driver;
import static java.nio.file.FileVisitResult.CONTINUE;



public class RegisterStepDefinition {
	
	Faker faker = new Faker();
   String nPhone;

  InventoryPage inventory = new InventoryPage(driver);
    HomePage home = new HomePage(driver);
    String phone = home.fask_phone();

    RegistrationPage register = new RegistrationPage(driver);

    @Given("user navigate to registration page")
    public void openRegistrationPag() throws InterruptedException {
        //home.c();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
//        try {
//            // Wait for up to 10 seconds for the element to be present and visible
//            WebElement element = new WebDriverWait(driver, Duration.ofMillis(10))
//                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div[2]/div/div[2]/div[2]")));
//
//            // If the element is present and visible, check if it's enabled and enter some text
//            if (element.isEnabled()) {
//                inventory.SelectStore().click();
//          Thread.sleep(2000);
//          inventory.StoreInventory().click();
//          Thread.sleep(3000);
//          inventory.storeSave().click();
//            } else {
//                System.out.println("Element is not enabled");
//            }
//        } catch (NoSuchElementException | TimeoutException e) {
//            System.out.println("Element not found or timed out");
//        }
//         WebElement eleinvetort_pagement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div[2]/div/div[2]/div[2]")));
//      if(invetort_page.isDisplayed()){
//          inventory.SelectStore().click();
//          Thread.sleep(2000);
//          inventory.StoreInventory().click();
//          Thread.sleep(3000);
//          inventory.storeSave().click();
//        }
//      else {
//          System.out.println("no");
//      }
        Thread.sleep(3000);
    	home.login().click();

    	try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        home.register().click();
    }


  

    @When("user enter first name")
    public void enterFirstName()
    {
    	String name = home.fask_name();
        register.firstName().sendKeys(name);
        String Name_f=  name;
    }

    @And("user enter last name")
    public void enterLastName()
    {
        register.lastName().sendKeys("ashraf");
    }

    @And("user enter email")
    public void enterEmail() throws IOException {
        try {
            FileWriter fw = new FileWriter("/home/amr/Downloads/hotfix_final/fileName2.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print("");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String email = home.fask_email();
        register.email().sendKeys(email);
        File file = new File("fileName2.txt");
        FileWriter fr = new FileWriter(file, true);
        fr.write("");
        fr.write(email);
        fr.close();
    }
    public static String globalVariable;

    
    @And("user enter phone")
    public String phone() throws IOException {
        try {
            FileWriter fw = new FileWriter("/home/amr/Downloads/hotfix_final/fileName.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print("");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    	globalVariable = phone;
    	
    	register.phone().sendKeys(phone);
    	register.phone().getAttribute(phone);
        globalVariable = phone;

        File file = new File("fileName.txt");
        FileWriter fr = new FileWriter(file, true);
        fr.write("");
        fr.write(phone);
        fr.close();
    	return globalVariable;
    	
    }

    @And("user enter password")
    public void enterPassword()
    {
        register.password().sendKeys("12345678");
    }

    @And("user confirm password")
    public void confirmPassword()
    {
        register.confirmPassword().sendKeys("12345678");
    }

    @Then("user could register successfully")
    public void clickOnRegisterBtn()
    {
        register.registerButton().click();
    }




//	@Override
//	void openRegistrationPage() {
//		// TODO Auto-generated method stub	home.login().click();
//    	try {
//			Thread.sleep(9000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        home.register().click();
//	}



}
