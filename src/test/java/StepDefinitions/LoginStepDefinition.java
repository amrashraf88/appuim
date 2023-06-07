package StepDefinitions;

import POM.HomePage;
import POM.LoginPage;
import POM.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.scanner.Scanner;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

import static StepDefinitions.Hooks.driver;

public class LoginStepDefinition  {

	String phone = RegisterStepDefinition.globalVariable;
	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);

	String nphone;

	@Given("user to login page")
	public void openLoginPage() throws InterruptedException {

		Thread.sleep(3000);
		home.login().click();

	}

	@And("user accept cookies")
	public void accept_cookie() throws InterruptedException {
		Thread.sleep(3000);
		login.accept_cookie().click();
	}

	@When("user enter valid email")
	public void enterEmail() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10));
		WebElement element = null;
		boolean elementFound = false;
		while (!elementFound) {
			try {
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/div[1]/mat-form-field/div/div[1]/div/input")));
				elementFound = true;
			} catch (TimeoutException e) {
				System.out.println("Element not found, retrying...");
			}
		}
		login.userName();
	}
//		try {
//			email = driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/div/signin/div/div/div/div/div/div[2]/mat-card/embryo-signin/form/div[1]/mat-form-field/div/div[1]/div/span[2]/label/span"));
//			// do action with the element
//			if (email.isDisplayed()) {
//
//				login.userName();
//
//			} else {
//				login.phone_user();
//			}
//		} catch (NoSuchElementException e) {
//			System.out.println("Element not found, retrying...");
//			// element not found, do another action
//		}
//	}


//		StringBuilder data = new StringBuilder();
//		try (BufferedReader br = new BufferedReader(new FileReader("/home/amr/Downloads/hotfix_final/fileName.txt"))) {
//			String line;s
//			while ((line = br.readLine()) != null) {
//				data.append(line).append("\n");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		String dataString = data.toString();
//		System.out.println(dataString);
//
//		login.userName().sendKeys(dataString);


	@And("user enter valid password")
	public void enterPassword() {
		login.password().sendKeys("12345678");
	}

	@And("user click on login")
	public void clickLoginButton() {
		login.loginButton().click();
	}
	@And ("user click on profile")
public void clickaccountbutton() throws InterruptedException {
		Thread.sleep(2000);
	home.profile().click();
} 
	@Then("user could login successfully and redirected to home page")
	public void successLogin() throws InterruptedException {
		
		Thread.sleep(2000);
		String expectedResult = "Profile information";
		String actualResult = home.profile_name().getText();
		Assert.assertTrue(actualResult.contains(expectedResult));

	}

}
